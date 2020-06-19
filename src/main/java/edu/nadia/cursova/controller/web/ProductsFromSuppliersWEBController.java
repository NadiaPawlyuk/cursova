package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.form.*;
import edu.nadia.cursova.model.*;
import edu.nadia.cursova.service.directoryOfGoodsNomenclature.impls.DirectoryOfGoodsNomenclatureServiceImpl;
import edu.nadia.cursova.service.productsFromSuppliers.impls.ProductsFromSuppliersServiceImpl;
import edu.nadia.cursova.service.supplier.impls.SupplierServiceImpl;
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
@RequestMapping("/web/ProductsFromSuppliers")
public class ProductsFromSuppliersWEBController {
    @Autowired
    ProductsFromSuppliersServiceImpl service;

    @Autowired
    DirectoryOfGoodsNomenclatureServiceImpl directoryOfGoodsNomenclatureService;

    @Autowired
    SupplierServiceImpl supplierService;

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String getAll(Model model)
    {
        List<ProductsFromSuppliers> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("productsFromSuppliers", service.getAll());
        return "productsFromSuppliersList";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/get/list", method = RequestMethod.POST)
    String search(Model model,
                  @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getString();
        List<ProductsFromSuppliers> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("productsFromSuppliers", list);
        return "productsFromSuppliersList";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<ProductsFromSuppliers> productsFromSuppliers = service.getAll();
        List<ProductsFromSuppliers> sorted = service.sortByName(productsFromSuppliers);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("productsFromSuppliers", sorted);
        return "productsFromSuppliersList";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/sort", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<ProductsFromSuppliers> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("productsFromSuppliers", list);
        return "productsFromSuppliersList";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("productsFromSuppliers", service.getAll());
        return "redirect:/web/ProductsFromSuppliers/get/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    String create(Model model) {
        ProductsFromSuppliersForm productsFromSuppliersForm = new ProductsFromSuppliersForm();
        Map<String, String> mavs1 = directoryOfGoodsNomenclatureService.getAll().stream()
                .collect(Collectors.toMap(DirectoryOfGoodsNomenclature::getId, DirectoryOfGoodsNomenclature::getTheNameOfTheProduct));
        model.addAttribute("mavs1", mavs1);
        Map<String, String> mavs2 = supplierService.getAll().stream()
                .collect(Collectors.toMap(Supplier::getId, Supplier::getInitials));
        model.addAttribute("mavs2", mavs2);
        model.addAttribute("productsFromSuppliersForm", productsFromSuppliersForm);
        return "productsFromSuppliersAdd";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("productsFromSuppliersForm") ProductsFromSuppliersForm productsFromSuppliersForm) {
        ProductsFromSuppliers productsFromSuppliers = new ProductsFromSuppliers();
        DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature = directoryOfGoodsNomenclatureService.get(productsFromSuppliersForm.getExternalCommunicationWithTheNomenclature());
        Supplier supplier = supplierService.get(productsFromSuppliersForm.getExternalCommunicationWithTheSupplier());
        productsFromSuppliers.setExternalCommunicationWithTheNomenclature(directoryOfGoodsNomenclature);
        productsFromSuppliers.setPrice(productsFromSuppliersForm.getPrice());
        productsFromSuppliers.setNumberOfGoods(productsFromSuppliersForm.getNumberOfGoods());
        productsFromSuppliers.setExternalCommunicationWithTheSupplier(supplier);
        productsFromSuppliers.setDescription(productsFromSuppliersForm.getDescription());
        service.save(productsFromSuppliers);
        model.addAttribute("productsFromSuppliers", service.getAll());
        return "redirect:/web/ProductsFromSuppliers/get/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model,
                @PathVariable("id") String id){
        Map<String, String> mavs1 = directoryOfGoodsNomenclatureService.getAll().stream()
                .collect(Collectors.toMap(DirectoryOfGoodsNomenclature::getId, DirectoryOfGoodsNomenclature::getTheNameOfTheProduct));
        Map<String, String> mavs2 = supplierService.getAll().stream()
                .collect(Collectors.toMap(Supplier::getId, Supplier::getInitials));
        ProductsFromSuppliers productsFromSuppliers = service.get(id);
        ProductsFromSuppliersForm productsFromSuppliersForm = new ProductsFromSuppliersForm();
        productsFromSuppliersForm.setExternalCommunicationWithTheNomenclature(productsFromSuppliers.getExternalCommunicationWithTheNomenclature().getTheNameOfTheProduct());
        productsFromSuppliersForm.setPrice(productsFromSuppliers.getPrice());
        productsFromSuppliersForm.setNumberOfGoods(productsFromSuppliers.getNumberOfGoods());
        productsFromSuppliersForm.setExternalCommunicationWithTheSupplier(productsFromSuppliers.getExternalCommunicationWithTheSupplier().getInitials());
        productsFromSuppliersForm.setDescription(productsFromSuppliers.getDescription());
        model.addAttribute("mavs1", mavs1);
        model.addAttribute("mavs2", mavs2);
        model.addAttribute("productsFromSuppliersForm", productsFromSuppliersForm);
        return "productsFromSuppliersAdd";
    }


    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("productsFromSuppliersForm") ProductsFromSuppliersForm productsFromSuppliersForm){
        ProductsFromSuppliers productsFromSuppliers = new ProductsFromSuppliers();
        DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature = directoryOfGoodsNomenclatureService.get(productsFromSuppliersForm.getExternalCommunicationWithTheNomenclature());
        Supplier supplier = supplierService.get(productsFromSuppliersForm.getExternalCommunicationWithTheSupplier());
        productsFromSuppliers.setId(id);
        productsFromSuppliers.setExternalCommunicationWithTheNomenclature(directoryOfGoodsNomenclature);
        productsFromSuppliers.setPrice(productsFromSuppliersForm.getPrice());
        productsFromSuppliers.setNumberOfGoods(productsFromSuppliersForm.getNumberOfGoods());
        productsFromSuppliers.setExternalCommunicationWithTheSupplier(supplier);
        productsFromSuppliers.setDescription(productsFromSuppliersForm.getDescription());
        service.save(productsFromSuppliers);
        model.addAttribute("productsFromSuppliers", service.getAll());
        return "redirect:/web/ProductsFromSuppliers/get/list";

    }
}