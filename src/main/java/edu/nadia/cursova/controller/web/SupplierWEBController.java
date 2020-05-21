package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.form.*;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.model.Manager;
import edu.nadia.cursova.model.Supplier;
import edu.nadia.cursova.service.supplier.impls.SupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/web/Supplier")
public class SupplierWEBController {
    @Autowired
    SupplierServiceImpl service;

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String getAll(Model model)
    {
        List<Supplier> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("suppliers", service.getAll());
        return "supplierList";
    }

    @RequestMapping(value = "/get/list", method = RequestMethod.POST)
    String search(Model model,
                  @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getString();
        List<Supplier> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("suppliers", list);
        return "supplierList";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<Supplier> suppliers = service.getAll();
        List<Supplier> sorted = service.sortByName(suppliers);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("suppliers", sorted);
        return "supplierList";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Supplier> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("suppliers", list);
        return "supplierList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("suppliers", service.getAll());
        return "redirect:/web/Supplier/get/list";
    }

    @RequestMapping(value = "/create",  method = RequestMethod.GET)
    String create(Model model)
    {
        SupplierForm supplierForm = new SupplierForm();
        model.addAttribute("supplierForm", supplierForm);
        return "supplierAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("supplierForm") SupplierForm supplierForm){
        Supplier supplier = new Supplier();
        supplier.setInitials(supplierForm.getInitials());
        supplier.setDateOfBirthday(supplierForm.getDateOfBirthday());
        supplier.setNumberOfPhone(supplierForm.getNumberOfPhone());
        supplier.setAddress(supplierForm.getAddress());
        supplier.setDescription(supplierForm.getDescription());
        service.save(supplier);
        model.addAttribute("suppliers", service.getAll());
        return "redirect:/web/Supplier/get/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model,
                @PathVariable("id") String id){
        Supplier supplier = service.get(id);
        SupplierForm supplierForm = new SupplierForm();
        supplierForm.setInitials(supplier.getInitials());
        supplierForm.setDateOfBirthday(supplier.getDateOfBirthday());
        supplierForm.setNumberOfPhone(supplier.getNumberOfPhone());
        supplierForm.setAddress(supplier.getAddress());
        supplierForm.setDescription(supplier.getDescription());
        model.addAttribute("supplierForm", supplierForm);
        return "supplierAdd";

    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("supplierForm") SupplierForm supplierForm){
        Supplier supplier = new Supplier();
        supplier.setId(id);
        supplier.setInitials(supplierForm.getInitials());
        supplier.setDateOfBirthday(supplierForm.getDateOfBirthday());
        supplier.setNumberOfPhone(supplierForm.getNumberOfPhone());
        supplier.setAddress(supplierForm.getAddress());
        supplier.setDescription(supplierForm.getDescription());
        service.save(supplier);
        model.addAttribute("suppliers", service.getAll());
        return "redirect:/web/Supplier/get/list";
    }
}