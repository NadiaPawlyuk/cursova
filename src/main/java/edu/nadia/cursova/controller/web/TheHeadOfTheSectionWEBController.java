package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.form.*;
import edu.nadia.cursova.model.*;
import edu.nadia.cursova.service.outlet.impls.OutletServiceImpl;
import edu.nadia.cursova.service.theHeadOfTheSection.impls.TheHeadOfTheSectionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/web/TheHeadOfTheSection")
public class TheHeadOfTheSectionWEBController {
    @Autowired
    TheHeadOfTheSectionServiceImpl service;

    @Autowired
    OutletServiceImpl outletService;

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String getAll(Model model)
    {
        List<TheHeadOfTheSection> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("theHeadOfTheSection", service.getAll());
        return "theHeadOfTheSectionList";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/get/list", method = RequestMethod.POST)
    String search(Model model,
                  @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getString();
        List<TheHeadOfTheSection> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("theHeadOfTheSection", list);
        return "theHeadOfTheSectionList";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<TheHeadOfTheSection> theHeadOfTheSections = service.getAll();
        List<TheHeadOfTheSection> sorted = service.sortByName(theHeadOfTheSections);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("theHeadOfTheSection", sorted);
        return "theHeadOfTheSectionList";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/sort", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<TheHeadOfTheSection> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("theHeadOfTheSection", list);
        return "theHeadOfTheSectionList";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("theHeadOfTheSection", service.getAll());
        return "redirect:/web/TheHeadOfTheSection/get/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    String create(Model model) {
        TheHeadOfTheSectionForm theHeadOfTheSectionForm = new TheHeadOfTheSectionForm();
        Map<String, String> mavs = outletService.getAll().stream()
                .collect(Collectors.toMap(Outlet::getId, Outlet::getName));
        model.addAttribute("mavs", mavs);
        model.addAttribute("theHeadOfTheSectionForm", theHeadOfTheSectionForm);
        return "theHeadOfTheSectionAdd";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("theHeadOfTheSectionForm") TheHeadOfTheSectionForm theHeadOfTheSectionForm) {
        TheHeadOfTheSection theHeadOfTheSection = new TheHeadOfTheSection();
        Outlet outlet = outletService.get(theHeadOfTheSectionForm.getExternalCommunicationWithThePlaceOfWork());
        theHeadOfTheSection.setInitials(theHeadOfTheSectionForm.getInitials());
        theHeadOfTheSection.setDateOfBirth(theHeadOfTheSectionForm.getDateOfBirth());
        theHeadOfTheSection.setDateOfHiring(theHeadOfTheSectionForm.getDateOfHiring());
        theHeadOfTheSection.setNumberOfPhone(theHeadOfTheSectionForm.getNumberOfPhone());
        theHeadOfTheSection.setAddress(theHeadOfTheSectionForm.getAddress());
        theHeadOfTheSection.setSalary(theHeadOfTheSectionForm.getSalary());
        theHeadOfTheSection.setExternalCommunicationWithThePlaceOfWork(outlet);
        theHeadOfTheSection.setDescription(theHeadOfTheSectionForm.getDescription());
        service.save(theHeadOfTheSection);
        model.addAttribute("theHeadOfTheSection", service.getAll());
        return "redirect:/web/TheHeadOfTheSection/get/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model,
                @PathVariable("id") String id) {
        Map<String, String> mavs = outletService.getAll().stream()
                .collect(Collectors.toMap(Outlet::getId, Outlet::getName));
        TheHeadOfTheSection theHeadOfTheSection = service.get(id);
        TheHeadOfTheSectionForm theHeadOfTheSectionForm = new TheHeadOfTheSectionForm();
        theHeadOfTheSectionForm.setInitials(theHeadOfTheSection.getInitials());
        theHeadOfTheSectionForm.setDateOfBirth(theHeadOfTheSection.getDateOfBirth());
        theHeadOfTheSectionForm.setDateOfHiring(theHeadOfTheSection.getDateOfHiring());
        theHeadOfTheSectionForm.setNumberOfPhone(theHeadOfTheSection.getNumberOfPhone());
        theHeadOfTheSectionForm.setAddress(theHeadOfTheSection.getAddress());
        theHeadOfTheSectionForm.setSalary(theHeadOfTheSection.getSalary());
        theHeadOfTheSectionForm.setExternalCommunicationWithThePlaceOfWork(theHeadOfTheSection.getExternalCommunicationWithThePlaceOfWork().getName());
        theHeadOfTheSectionForm.setDescription(theHeadOfTheSection.getDescription());
        model.addAttribute("mavs", mavs);
        model.addAttribute("theHeadOfTheSectionForm", theHeadOfTheSectionForm);
        return "theHeadOfTheSectionAdd";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("theHeadOfTheSectionForm") TheHeadOfTheSectionForm theHeadOfTheSectionForm) {
        TheHeadOfTheSection theHeadOfTheSection = new TheHeadOfTheSection();
        Outlet outlet = outletService.get(theHeadOfTheSectionForm.getExternalCommunicationWithThePlaceOfWork());
        theHeadOfTheSection.setId(id);
        theHeadOfTheSection.setInitials(theHeadOfTheSectionForm.getInitials());
        theHeadOfTheSection.setDateOfBirth(theHeadOfTheSectionForm.getDateOfBirth());
        theHeadOfTheSection.setDateOfHiring(theHeadOfTheSectionForm.getDateOfHiring());
        theHeadOfTheSection.setNumberOfPhone(theHeadOfTheSectionForm.getNumberOfPhone());
        theHeadOfTheSection.setAddress(theHeadOfTheSectionForm.getAddress());
        theHeadOfTheSection.setSalary(theHeadOfTheSectionForm.getSalary());
        theHeadOfTheSection.setExternalCommunicationWithThePlaceOfWork(outlet);
        theHeadOfTheSection.setDescription(theHeadOfTheSectionForm.getDescription());
        service.save(theHeadOfTheSection);
        model.addAttribute("theHeadOfTheSection", service.getAll());
        return "redirect:/web/TheHeadOfTheSection/get/list";
    }
}

