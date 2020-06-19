package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.form.AccountingForBuyersForm;
import edu.nadia.cursova.form.DistributionForm;
import edu.nadia.cursova.form.HallForm;
import edu.nadia.cursova.form.SearchForm;
import edu.nadia.cursova.model.*;
import edu.nadia.cursova.service.hall.impls.HallServiceImpl;
import edu.nadia.cursova.service.outlet.impls.OutletServiceImpl;
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
@RequestMapping("/web/Hall")
public class HallWEBController {
    @Autowired
    HallServiceImpl service;

    @Autowired
    OutletServiceImpl outletService;

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String getAll(Model model)
    {
        List<Hall> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("halls", service.getAll());
        return "hallList";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/get/list", method = RequestMethod.POST)
    String search(Model model,
                  @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getString();
        List<Hall> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("halls", list);
        return "hallList";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<Hall> halls = service.getAll();
        List<Hall> sorted = service.sortByName(halls);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("halls", sorted);
        return "hallList";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/sort", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Hall> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("halls", list);
        return "hallList";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("halls", service.getAll());
        return "redirect:/web/Hall/get/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/create",  method = RequestMethod.GET)
    String create(Model model)
    {
        HallForm hallForm = new HallForm();
        Map<String, String> mavs = outletService.getAll().stream()
                .collect(Collectors.toMap(Outlet::getId, Outlet::getName));
        model.addAttribute("mavs", mavs);
        model.addAttribute("hallForm", hallForm);
        return "hallAdd";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("hallForm") HallForm hallForm){
        Hall hall = new Hall();
        Outlet outlet = outletService.get(hallForm.getNameOfTheHall());
        hall.setNumberOfSellers(hallForm.getNumberOfSellers());
        hall.setNameOfTheHall(outlet);
        hall.setDescription(hallForm.getDescription());
        service.save(hall);
        model.addAttribute("halls", service.getAll());
        return "redirect:/web/Hall/get/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model,
                @PathVariable("id") String id){
        Hall hall = service.get(id);
        Map<String, String> mavs = outletService.getAll().stream()
                .collect(Collectors.toMap(Outlet::getId, Outlet::getName));
        HallForm hallForm = new HallForm();
        hallForm.setNameOfTheHall(hall.getNameOfTheHall().getName());
        hallForm.setNumberOfSellers(hall.getNumberOfSellers());
        hallForm.setDescription(hall.getDescription());
        model.addAttribute("mavs", mavs);
        model.addAttribute("hallForm", hallForm);
        return "hallAdd";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("hallForm") HallForm hallForm){
        Hall hall = new Hall();
        Outlet outlet = outletService.get(hallForm.getNameOfTheHall());
        hall.setId(id);
        hall.setNameOfTheHall(outlet);
        hall.setNumberOfSellers(hallForm.getNumberOfSellers());
        hall.setDescription(hallForm.getDescription());
        service.save(hall);
        model.addAttribute("hall", service.getAll());
        return "redirect:/web/Hall/get/list";
    }
}