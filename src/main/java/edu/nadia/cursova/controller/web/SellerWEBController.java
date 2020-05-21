package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.form.*;
import edu.nadia.cursova.model.*;
import edu.nadia.cursova.service.outlet.impls.OutletServiceImpl;
import edu.nadia.cursova.service.seller.impls.SellerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sun.plugin.javascript.navig.Array;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/web/Seller")
public class SellerWEBController {
    @Autowired
    SellerServiceImpl service;

    @Autowired
    OutletServiceImpl outletService;

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String getAll(Model model)
    {
        List<Seller> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("sellers", service.getAll());
        return "sellerList";
    }

    @RequestMapping(value = "/get/list", method = RequestMethod.POST)
    String search(Model model,
                  @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getString();
        List<Seller> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("sellers", list);
        return "sellerList";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<Seller> sellers = service.getAll();
        List<Seller> sorted = service.sortByName(sellers);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("sellers", sorted);
        return "sellerList";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Seller> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("sellers", list);
        return "sellerList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("sellers", service.getAll());
        return "sellerList";
    }

    @RequestMapping(value = "/create",  method = RequestMethod.GET)
    String create(Model model)
    {
        SellerForm sellerForm = new SellerForm();
        Map<String, String> mavs = outletService.getAll().stream()
                .collect(Collectors.toMap(Outlet::getId, Outlet::getName));
        model.addAttribute("mavs", mavs);
        model.addAttribute("sellerForm", sellerForm);
        return "sellerAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("sellerForm") SellerForm sellerForm){
        Seller seller = new Seller();
        Outlet outlet = outletService.get(sellerForm.getExternalCommunicationWithThePlaceOfWork());
        seller.setInitials(sellerForm.getInitials());
        seller.setDateOfBirthday(sellerForm.getDateOfBirthday());
        seller.setDateOfHiring(sellerForm.getDateOfHiring());
        seller.setNumberOfPhone(sellerForm.getNumberOfPhone());
        seller.setAddress(sellerForm.getAddress());
        seller.setSalary(sellerForm.getSalary());
        seller.setExternalCommunicationWithThePlaceOfWork(outlet);
        seller.setDescription(sellerForm.getDescription());
        service.save(seller);
        model.addAttribute("sellers", service.getAll());
        return "redirect:/web/Seller/get/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model,
                @PathVariable("id") String id){
        Map<String, String> mavs = outletService.getAll().stream()
                .collect(Collectors.toMap(Outlet::getId, Outlet::getName));
        Seller seller = service.get(id);
        SellerForm sellerForm = new SellerForm();
        sellerForm.setInitials(seller.getInitials());
        sellerForm.setDateOfBirthday(seller.getDateOfBirthday());
        sellerForm.setDateOfHiring(seller.getDateOfHiring());
        sellerForm.setNumberOfPhone(seller.getNumberOfPhone());
        sellerForm.setAddress(seller.getAddress());
        sellerForm.setSalary(seller.getSalary());
        sellerForm.setExternalCommunicationWithThePlaceOfWork(seller.getExternalCommunicationWithThePlaceOfWork().getName());
        sellerForm.setDescription(seller.getDescription());
        model.addAttribute("mavs", mavs);
        model.addAttribute("sellerForm", sellerForm);
        return "sellerAdd";

    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("sellerForm") SellerForm sellerForm){
        Seller seller = new Seller();
        Outlet outlet = outletService.get(sellerForm.getExternalCommunicationWithThePlaceOfWork());
        seller.setId(id);
        seller.setInitials(sellerForm.getInitials());
        seller.setDateOfBirthday(sellerForm.getDateOfBirthday());
        seller.setDateOfHiring(sellerForm.getDateOfHiring());
        seller.setNumberOfPhone(sellerForm.getNumberOfPhone());
        seller.setAddress(sellerForm.getAddress());
        seller.setSalary(sellerForm.getSalary());
        seller.setExternalCommunicationWithThePlaceOfWork(outlet);
        seller.setDescription(sellerForm.getDescription());
        service.save(seller);
        model.addAttribute("sellers", service.getAll());
        return "redirect:/web/Seller/get/list";

    }
}