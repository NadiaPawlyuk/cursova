package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.form.*;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.model.Manager;
import edu.nadia.cursova.model.Outlet;
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

@Controller
@RequestMapping("/web/Outlet")
public class OutletWEBController {
    @Autowired
    OutletServiceImpl service;

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String getAll(Model model)
    {
        List<Outlet> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("outlets", service.getAll());
        return "outletList";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/get/list", method = RequestMethod.POST)
    String search(Model model,
                  @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getString();
        List<Outlet> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("outlets", list);
        return "outletList";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<Outlet> outlets = service.getAll();
        List<Outlet> sorted = service.sortByName(outlets);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("outlets", sorted);
        return "outletList";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/sort", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Outlet> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("outlets", list);
        return "outletList";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("outlets", service.getAll());
        return "redirect:/web/Outlet/get/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/create",  method = RequestMethod.GET)
    String create(Model model)
    {
        OutletForm outletForm = new OutletForm();
        model.addAttribute("outletForm", outletForm);
        return "outletAdd";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("outletForm") OutletForm outletForm){
        Outlet outlet = new Outlet();
        outlet.setName(outletForm.getName());
        outlet.setKindOfOutlet(outletForm.getKindOfOutlet());
        outlet.setDescription(outletForm.getDescription());
        service.save(outlet);
        model.addAttribute("outlets", service.getAll());
        return "redirect:/web/Outlet/get/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model,
                @PathVariable("id") String id){
        Outlet outlet = service.get(id);
        OutletForm outletForm = new OutletForm();
        outletForm.setName(outlet.getName());
        outletForm.setKindOfOutlet(outlet.getKindOfOutlet());
        outletForm.setDescription(outlet.getDescription());
        model.addAttribute("outletForm", outletForm);
        return "outletAdd";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("outletForm") OutletForm outletForm){
        Outlet outlet = new Outlet();
        outlet.setId(id);
        outlet.setName(outletForm.getName());
        outlet.setKindOfOutlet(outletForm.getKindOfOutlet());
        outlet.setDescription(outletForm.getDescription());
        service.save(outlet);
        model.addAttribute("outlets", service.getAll());
        return "redirect:/web/Outlet/get/list";
    }
}