package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.form.*;
import edu.nadia.cursova.model.*;
import edu.nadia.cursova.service.manager.impls.ManagerServiceImpl;
import edu.nadia.cursova.service.organizationOfTrade.impls.OrganizationOfTradeServiceImpl;
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
@RequestMapping("/web/Manager")
public class ManagerWEBController {
    @Autowired
    ManagerServiceImpl service;

    @Autowired
    OrganizationOfTradeServiceImpl organizationOfTradeService;

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String getAll(Model model)
    {
        List<Manager> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("managers", service.getAll());
        return "managerList";
    }

    @RequestMapping(value = "/get/list", method = RequestMethod.POST)
    String search(Model model,
                  @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getString();
        List<Manager> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("managers", list);
        return "managerList";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<Manager> managers = service.getAll();
        List<Manager> sorted = service.sortByName(managers);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("managers", sorted);
        return "managerList";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Manager> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("managers", list);
        return "managerList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("managers", service.getAll());
        return "redirect:/web/Manager/get/list";
    }

    @RequestMapping(value = "/create",  method = RequestMethod.GET)
    String create(Model model)
    {
        ManagerForm managerForm = new ManagerForm();
        Map<String, String> mavs = organizationOfTradeService.getAll().stream()
                .collect(Collectors.toMap(OrganizationOfTrade::getId, OrganizationOfTrade::getNameOfOrganization));
        model.addAttribute("mavs", mavs);
        model.addAttribute("managerForm", managerForm);
        return "managerAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("managerForm") ManagerForm managerForm){
       Manager manager = new Manager();
       OrganizationOfTrade organizationOfTrade = organizationOfTradeService.get(managerForm.getExternalCommunicationWithThePlaceOfWork());
        manager.setInitials(managerForm.getInitials());
        manager.setDateOfBirthday(managerForm.getDateOfBirthday());
        manager.setDateOfHiring(managerForm.getDateOfHiring());
        manager.setNumberOfPhone(managerForm.getNumberOfPhone());
        manager.setAddress(managerForm.getAddress());
        manager.setSalary(managerForm.getSalary());
        manager.setExternalCommunicationWithThePlaceOfWork(organizationOfTrade);
        manager.setDescription(managerForm.getDescription());
        service.save(manager);
        model.addAttribute("managers", service.getAll());
        return "redirect:/web/Manager/get/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model,
                @PathVariable("id") String id){
        Manager manager = service.get(id);
        Map<String, String> mavs = organizationOfTradeService.getAll().stream()
                .collect(Collectors.toMap(OrganizationOfTrade::getId, OrganizationOfTrade::getNameOfOrganization));
        ManagerForm managerForm = new ManagerForm();
        managerForm.setInitials(manager.getInitials());
        managerForm.setDateOfBirthday(manager.getDateOfBirthday());
        managerForm.setDateOfHiring(manager.getDateOfHiring());
        managerForm.setNumberOfPhone(manager.getNumberOfPhone());
        managerForm.setAddress(manager.getAddress());
        managerForm.setSalary(manager.getSalary());
        managerForm.setExternalCommunicationWithThePlaceOfWork(manager.getExternalCommunicationWithThePlaceOfWork().getNameOfOrganization());
        managerForm.setDescription(manager.getDescription());
        model.addAttribute("mavs", mavs);
        model.addAttribute("managerForm", managerForm);
        return "managerAdd";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("managerForm") ManagerForm managerForm){
        Manager manager = new Manager();
        OrganizationOfTrade organizationOfTrade = organizationOfTradeService.get(managerForm.getExternalCommunicationWithThePlaceOfWork());
        manager.setId(id);
        manager.setInitials(managerForm.getInitials());
        manager.setDateOfBirthday(managerForm.getDateOfBirthday());
        manager.setDateOfHiring(managerForm.getDateOfHiring());
        manager.setNumberOfPhone(managerForm.getNumberOfPhone());
        manager.setAddress(managerForm.getAddress());
        manager.setSalary(managerForm.getSalary());
        manager.setExternalCommunicationWithThePlaceOfWork(organizationOfTrade);
        manager.setDescription(managerForm.getDescription());
        service.save(manager);
        model.addAttribute("manager", service.getAll());
        return "redirect:/web/Manager/get/list";
    }
}