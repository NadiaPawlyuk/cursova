package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.ProductsInOutlets;
import edu.nadia.cursova.service.productsInOutlets.impls.ProductsInOutletsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/organization/")
public class ProductsInOutletsAPIController {
    @Autowired
    ProductsInOutletsServiceImpl service;

    @RequestMapping("/ProductsInOutlets")
    List<ProductsInOutlets> getAll(){
        return service.getAll();
    }
}
