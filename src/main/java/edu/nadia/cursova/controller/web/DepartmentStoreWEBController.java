package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.form.AccountingForBuyersForm;
import edu.nadia.cursova.form.AccountingForGoodsSoldForm;
import edu.nadia.cursova.form.DepartmentStoreForm;
import edu.nadia.cursova.form.SearchForm;
import edu.nadia.cursova.model.*;
import edu.nadia.cursova.service.departmentStore.impls.DepartmentStoreServiceImpl;
import edu.nadia.cursova.service.departmentStore.interfaces.IDepartmentStoreService;
import edu.nadia.cursova.service.outlet.impls.OutletServiceImpl;
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
@RequestMapping("/web/DepartmentStore")
public class DepartmentStoreWEBController {
    @Autowired
    DepartmentStoreServiceImpl service;

    @Autowired
    OutletServiceImpl outletService;

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String getAll(Model model) {
        List<DepartmentStore> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("departmentStore", service.getAll());
        return "departmentStoreList";
    }

    @RequestMapping(value = "/get/list", method = RequestMethod.POST)
    String search(Model model,
                  @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getString();
        List<DepartmentStore> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("departmentStore", list);
        return "departmentStoreList";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<DepartmentStore> departmentStores = service.getAll();
        List<DepartmentStore> sorted = service.sortByName(departmentStores);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("departmentStore", sorted);
        return "departmentStoreList";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<DepartmentStore> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("departmentStore", list);
        return "departmentStoreList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("departmentStore", service.getAll());
        return "departmentStoreList";
    }

    @RequestMapping(value = "/create",  method = RequestMethod.GET)
    String create(Model model)
    {
        DepartmentStoreForm departmentStoreForm = new DepartmentStoreForm();
        Map<String, String> mavs = outletService.getAll().stream()
                .collect(Collectors.toMap(Outlet::getId, Outlet::getName));
        model.addAttribute("mavs", mavs);
        model.addAttribute("departmentStoreForm", departmentStoreForm);
        return "departmentStoreAdd";
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("departmentStoreForm") DepartmentStoreForm departmentStoreForm){
        DepartmentStore departmentStore = new DepartmentStore();
        Outlet outlet = outletService.get(departmentStoreForm.getName());
        departmentStore.setNameOfTheStore(departmentStoreForm.getNameOfTheStore());
        departmentStore.setName(outlet);
        departmentStore.setNumberOfSections(departmentStoreForm.getNumberOfSections());
        departmentStore.setNumberOfFloors(departmentStoreForm.getNumberOfFloors());
        departmentStore.setNumberOfHalls(departmentStoreForm.getNumberOfHalls());
        departmentStore.setNumberOfCounters(departmentStoreForm.getNumberOfCounters());
        departmentStore.setAddress(departmentStoreForm.getAddress());
        departmentStore.setTheSizeOfTheOutlet(departmentStoreForm.getTheSizeOfTheOutlet());
        departmentStore.setRent(departmentStoreForm.getRent());
        departmentStore.setUtilities(departmentStoreForm.getUtilities());
        departmentStore.setDescription(departmentStoreForm.getDescription());
        service.save(departmentStore);
        model.addAttribute("departmentStore", service.getAll());
        return "redirect:/web/DepartmentStore/get/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model,
                @PathVariable("id") String id){
        Map<String, String> mavs = outletService.getAll().stream()
                .collect(Collectors.toMap(Outlet::getId, Outlet::getName));
        DepartmentStore departmentStore = service.get(id);
        DepartmentStoreForm departmentStoreForm = new DepartmentStoreForm();
        departmentStoreForm.setNameOfTheStore(departmentStore.getNameOfTheStore());
        departmentStoreForm.setName(departmentStore.getName().getName());
        departmentStoreForm.setNumberOfSections(departmentStore.getNumberOfSections());
        departmentStoreForm.setNumberOfFloors(departmentStore.getNumberOfFloors());
        departmentStoreForm.setNumberOfHalls(departmentStore.getNumberOfHalls());
        departmentStoreForm.setNumberOfCounters(departmentStore.getNumberOfCounters());
        departmentStoreForm.setAddress(departmentStore.getAddress());
        departmentStoreForm.setTheSizeOfTheOutlet(departmentStore.getTheSizeOfTheOutlet());
        departmentStoreForm.setRent(departmentStore.getRent());
        departmentStoreForm.setUtilities(departmentStore.getUtilities());
        departmentStoreForm.setDescription(departmentStore.getDescription());
        model.addAttribute("mavs", mavs);
        model.addAttribute("departmentStoreForm", departmentStoreForm);
        return "departmentStoreAdd";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("departmentStoreForm") DepartmentStoreForm departmentStoreForm){
        DepartmentStore departmentStore = new DepartmentStore();
        Outlet outlet = outletService.get(departmentStoreForm.getName());
        departmentStore.setId(id);
        departmentStore.setNameOfTheStore(departmentStoreForm.getNameOfTheStore());
        departmentStore.setName(outlet);
        departmentStore.setNumberOfSections(departmentStoreForm.getNumberOfSections());
        departmentStore.setNumberOfFloors(departmentStoreForm.getNumberOfFloors());
        departmentStore.setNumberOfHalls(departmentStoreForm.getNumberOfHalls());
        departmentStore.setNumberOfCounters(departmentStoreForm.getNumberOfCounters());
        departmentStore.setAddress(departmentStoreForm.getAddress());
        departmentStore.setTheSizeOfTheOutlet(departmentStoreForm.getTheSizeOfTheOutlet());
        departmentStore.setRent(departmentStoreForm.getRent());
        departmentStore.setUtilities(departmentStoreForm.getUtilities());
        departmentStore.setDescription(departmentStoreForm.getDescription());
        service.save(departmentStore);
        model.addAttribute("departmentStore", service.getAll());
        return "redirect:/web/DepartmentStore/get/list";
    }

}