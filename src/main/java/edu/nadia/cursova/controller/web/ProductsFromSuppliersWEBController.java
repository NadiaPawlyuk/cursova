package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.form.*;
import edu.nadia.cursova.model.*;
import edu.nadia.cursova.service.directoryOfGoodsNomenclature.impls.DirectoryOfGoodsNomenclatureServiceImpl;
import edu.nadia.cursova.service.productsFromSuppliers.impls.ProductsFromSuppliersServiceImpl;
import edu.nadia.cursova.service.supplier.impls.SupplierServiceImpl;
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
@RequestMapping("/web/ProductsFromSuppliers")
public class ProductsFromSuppliersWEBController {
    @Autowired
    ProductsFromSuppliersServiceImpl service;

    @Autowired
    DirectoryOfGoodsNomenclatureServiceImpl directoryOfGoodsNomenclatureService;

    @Autowired
    SupplierServiceImpl supplierService;

    @RequestMapping("/get/list")
    String getAll(Model model) {
        model.addAttribute("productsFromSuppliers", service.getAll());
        return "productsFromSuppliersList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("productsFromSuppliers", service.getAll());
        return "productsFromSuppliersList";
    }

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