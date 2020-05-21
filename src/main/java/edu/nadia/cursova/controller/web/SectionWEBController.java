package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.form.*;
import edu.nadia.cursova.model.*;
import edu.nadia.cursova.service.outlet.impls.OutletServiceImpl;
import edu.nadia.cursova.service.section.impls.SectionServiceImpl;
import edu.nadia.cursova.service.theHeadOfTheSection.impls.TheHeadOfTheSectionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/web/Section")
public class SectionWEBController {
   @Autowired
    SectionServiceImpl service;

   @Autowired
    TheHeadOfTheSectionServiceImpl theHeadOfTheSectionService;

   @Autowired
    OutletServiceImpl outletService;

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String getAll(Model model)
    {
        List<Section> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("sections", service.getAll());
        return "sectionList";
    }

    @RequestMapping(value = "/get/list", method = RequestMethod.POST)
    String search(Model model,
                  @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getString();
        List<Section> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("sections", list);
        return "sectionList";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<Section> sections = service.getAll();
        List<Section> sorted = service.sortByName(sections);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("sections", sorted);
        return "sectionList";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Section> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("sections", list);
        return "sectionList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("sections", service.getAll());
        return "sectionList";
    }

    @RequestMapping(value = "/create",  method = RequestMethod.GET)
    String create(Model model)
    {
        SectionForm sectionForm = new SectionForm();
        Map<String, String> mavs1 = theHeadOfTheSectionService.getAll().stream()
                .collect(Collectors.toMap(TheHeadOfTheSection::getId, TheHeadOfTheSection::getInitials));
        model.addAttribute("mavs1", mavs1);
        Map<String, String> mavs2 = outletService.getAll().stream()
                .collect(Collectors.toMap(Outlet::getId, Outlet::getName));
        model.addAttribute("mavs2", mavs2);
        model.addAttribute("sectionForm", sectionForm);
        return "sectionAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("sectionForm") SectionForm sectionForm){
        Section section = new Section();
        TheHeadOfTheSection theHeadOfTheSection = theHeadOfTheSectionService.get(sectionForm.getExternalCommunicationWithTheHeadOfTheSection());
        Outlet outlet = outletService.get(sectionForm.getExternalCommunicationWithDepartmentStore());
        section.setNameOfTheSection(sectionForm.getNameOfTheSection());
        section.setExternalCommunicationWithTheHeadOfTheSection(theHeadOfTheSection);
        section.setTheFloor(sectionForm.getTheFloor());
        section.setExternalCommunicationWithDepartmentStore(outlet);
        section.setDescription(sectionForm.getDescription());
        service.save(section);
        model.addAttribute("sections", service.getAll());
        return "redirect:/web/Section/get/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model,
                @PathVariable("id") String id){
        Section section = service.get(id);
        Map<String, String> mavs1 = theHeadOfTheSectionService.getAll().stream()
                .collect(Collectors.toMap(TheHeadOfTheSection::getId, TheHeadOfTheSection::getInitials));
        Map<String, String> mavs2 = outletService.getAll().stream()
                .collect(Collectors.toMap(Outlet::getId, Outlet::getName));
        SectionForm sectionForm = new SectionForm();
        sectionForm.setNameOfTheSection(section.getNameOfTheSection());
        sectionForm.setExternalCommunicationWithTheHeadOfTheSection(section.getExternalCommunicationWithTheHeadOfTheSection().getInitials());
        sectionForm.setTheFloor(section.getTheFloor());
        sectionForm.setExternalCommunicationWithDepartmentStore(section.getExternalCommunicationWithDepartmentStore().getName());
        sectionForm.setDescription(section.getDescription());
        service.save(section);
        model.addAttribute("mavs1", mavs1);
        model.addAttribute("mavs2", mavs2);
        model.addAttribute("sectionForm", sectionForm);
        return "sectionAdd";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("sectionForm") SectionForm sectionForm){
        Section section = new Section();
        TheHeadOfTheSection theHeadOfTheSection = theHeadOfTheSectionService.get(sectionForm.getExternalCommunicationWithTheHeadOfTheSection());
        Outlet outlet = outletService.get(sectionForm.getExternalCommunicationWithDepartmentStore());
        section.setId(id);
        section.setNameOfTheSection(sectionForm.getNameOfTheSection());
        section.setExternalCommunicationWithTheHeadOfTheSection(theHeadOfTheSection);
        section.setTheFloor(sectionForm.getTheFloor());
        section.setExternalCommunicationWithDepartmentStore(outlet);
        section.setDescription(sectionForm.getDescription());
        service.save(section);
        model.addAttribute("sections", service.getAll());
        return "redirect:/web/Section/get/list";
    }
}
