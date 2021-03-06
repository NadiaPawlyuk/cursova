package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.model.ProductsFromSuppliers;
import edu.nadia.cursova.service.productsFromSuppliers.impls.ProductsFromSuppliersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/web/organization")
public class ProductsFromSuppliersWEBController {
    @Autowired
    ProductsFromSuppliersServiceImpl service;

    @RequestMapping("/ProductsFromSuppliers")
    String getAll(Model model)
    {
        model.addAttribute("productsFromSuppliers", service.getAll());
        return "productsFromSuppliersList";
    }

    @RequestMapping("/ProductsFromSuppliers/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("productsFromSuppliers", service.getAll());
        return "productsFromSuppliersList";
    }
}
