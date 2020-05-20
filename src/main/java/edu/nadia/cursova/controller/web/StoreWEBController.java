package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.form.AccountingForBuyersForm;
import edu.nadia.cursova.form.DistributionForm;
import edu.nadia.cursova.form.OutletForm;
import edu.nadia.cursova.form.StoreForm;
import edu.nadia.cursova.model.*;
import edu.nadia.cursova.service.outlet.impls.OutletServiceImpl;
import edu.nadia.cursova.service.store.impls.StoreServiceImpl;
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
@RequestMapping("/web/Store")
public class StoreWEBController {
    @Autowired
    StoreServiceImpl service;

    @Autowired
    OutletServiceImpl outletService;

    @RequestMapping("/get/list")
    String getAll(Model model)
    {
        model.addAttribute("stores", service.getAll());
        return "storeList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("stores", service.getAll());
        return "storeList";
    }

    @RequestMapping(value = "/create",  method = RequestMethod.GET)
    String create(Model model)
    {
        StoreForm storeForm = new StoreForm();
        Map<String, String> mavs = outletService.getAll().stream()
                .collect(Collectors.toMap(Outlet::getId, Outlet::getName));
        model.addAttribute("mavs", mavs);
        model.addAttribute("storeForm", storeForm);
        return "storeAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("storeForm") StoreForm storeForm){
        Store store = new Store();
        Outlet outlet = outletService.get(storeForm.getNameOfTheStore());
        store.setNameOfTheStore(outlet);
        store.setNumberOfSellers(storeForm.getNumberOfSellers());
        store.setNumberOfHalls(storeForm.getNumberOfHalls());
        store.setNumberOfCounters(storeForm.getNumberOfCounters());
        store.setAddress(storeForm.getAddress());
        store.setTheSizeOfTheOutlet(storeForm.getTheSizeOfTheOutlet());
        store.setRent(storeForm.getRent());
        store.setUtilities(storeForm.getUtilities());
        store.setDescription(storeForm.getDescription());
        service.save(store);
        model.addAttribute("stores", service.getAll());
        return "redirect:/web/Store/get/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model,
                @PathVariable("id") String id){
        Map<String, String> mavs = outletService.getAll().stream()
                .collect(Collectors.toMap(Outlet::getId, Outlet::getName));
        Store store = service.get(id);
        StoreForm storeForm = new StoreForm();
        storeForm.setNameOfTheStore(store.getNameOfTheStore().getName());
        storeForm.setNumberOfSellers(store.getNumberOfSellers());
        storeForm.setNumberOfHalls(store.getNumberOfHalls());
        storeForm.setNumberOfCounters(store.getNumberOfCounters());
        storeForm.setAddress(store.getAddress());
        storeForm.setTheSizeOfTheOutlet(store.getTheSizeOfTheOutlet());
        storeForm.setRent(store.getRent());
        storeForm.setUtilities(store.getUtilities());
        storeForm.setDescription(store.getDescription());
        model.addAttribute("mavs", mavs);
        model.addAttribute("storeForm", storeForm);
        return "storeAdd";

    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("storeForm") StoreForm storeForm){
        Store store = new Store();
        Outlet outlet = outletService.get(storeForm.getNameOfTheStore());
        store.setId(id);
        store.setNameOfTheStore(outlet);
        store.setNumberOfSellers(storeForm.getNumberOfSellers());
        store.setNumberOfHalls(storeForm.getNumberOfHalls());
        store.setNumberOfCounters(storeForm.getNumberOfCounters());
        store.setAddress(storeForm.getAddress());
        store.setTheSizeOfTheOutlet(storeForm.getTheSizeOfTheOutlet());
        store.setRent(storeForm.getRent());
        store.setUtilities(storeForm.getUtilities());
        store.setDescription(storeForm.getDescription());
        service.save(store);
        model.addAttribute("stores", service.getAll());
        return "redirect:/web/Store/get/list";

    }
}