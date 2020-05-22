package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.form.*;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.model.Manager;
import edu.nadia.cursova.model.OrganizationOfTrade;
import edu.nadia.cursova.service.organizationOfTrade.impls.OrganizationOfTradeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/web/OrganizationOfTrade")
public class OrganizationOfTradeWEBController {
   @Autowired
    OrganizationOfTradeServiceImpl service;

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String getAll(Model model)
    {
        List<OrganizationOfTrade> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("organizationOfTrade", service.getAll());
        return "organizationOfTradeList";
    }

    @RequestMapping(value = "/get/list", method = RequestMethod.POST)
    String search(Model model,
                  @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getString();
        List<OrganizationOfTrade> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("organizationOfTrade", list);
        return "organizationOfTradeList";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<OrganizationOfTrade> organizationOfTrades = service.getAll();
        List<OrganizationOfTrade> sorted = service.sortByName(organizationOfTrades);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("organizationOfTrade", sorted);
        return "organizationOfTradeList";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<OrganizationOfTrade> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("organizationOfTrade", list);
        return "organizationOfTradeList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("organizationOfTrade", service.getAll());
        return "redirect:/web/OrganizationOfTrade/get/list";
    }

    @RequestMapping(value = "/create",  method = RequestMethod.GET)
    String create(Model model)
    {
        OrganizationOfTradeForm organizationOfTradeForm = new OrganizationOfTradeForm();
        model.addAttribute("organizationOfTradeForm", organizationOfTradeForm);
        return "organizationOfTradeAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("organizationOfTradeForm") OrganizationOfTradeForm organizationOfTradeForm){
        OrganizationOfTrade organizationOfTrade = new OrganizationOfTrade();
        organizationOfTrade.setNameOfOrganization(organizationOfTradeForm.getNameOfOrganization());
        organizationOfTrade.setPhoneNumber(organizationOfTradeForm.getPhoneNumber());
        organizationOfTrade.setAddress(organizationOfTradeForm.getAddress());
        organizationOfTrade.setNumberOfManagers(organizationOfTradeForm.getNumberOfManagers());
        organizationOfTrade.setDescription(organizationOfTradeForm.getDescription());
        service.save(organizationOfTrade);
        model.addAttribute("organizationOfTrade", service.getAll());
        return "redirect:/web/OrganizationOfTrade/get/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model,
                @PathVariable("id") String id){
        OrganizationOfTrade organizationOfTrade = service.get(id);
        OrganizationOfTradeForm organizationOfTradeForm = new OrganizationOfTradeForm();
        organizationOfTradeForm.setNameOfOrganization(organizationOfTrade.getNameOfOrganization());
        organizationOfTradeForm.setPhoneNumber(organizationOfTrade.getPhoneNumber());
        organizationOfTradeForm.setAddress(organizationOfTrade.getAddress());
        organizationOfTradeForm.setNumberOfManagers(organizationOfTrade.getNumberOfManagers());
        organizationOfTradeForm.setDescription(organizationOfTrade.getDescription());
        model.addAttribute("organizationOfTradeForm", organizationOfTradeForm);
        return "organizationOfTradeAdd";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("organizationOfTradeForm") OrganizationOfTradeForm organizationOfTradeForm){
        OrganizationOfTrade organizationOfTrade = new OrganizationOfTrade();
        organizationOfTrade.setId(id);
        organizationOfTrade.setNameOfOrganization(organizationOfTradeForm.getNameOfOrganization());
        organizationOfTrade.setPhoneNumber(organizationOfTradeForm.getPhoneNumber());
        organizationOfTrade.setAddress(organizationOfTradeForm.getAddress());
        organizationOfTrade.setNumberOfManagers(organizationOfTradeForm.getNumberOfManagers());
        organizationOfTrade.setDescription(organizationOfTradeForm.getDescription());
        service.save(organizationOfTrade);
        model.addAttribute("organizationOfTrade", service.getAll());
        return "redirect:/web/OrganizationOfTrade/get/list";
    }
}