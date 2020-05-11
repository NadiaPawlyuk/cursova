package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.ProductsInOutlets;
import edu.nadia.cursova.service.productsInOutlets.impls.ProductsInOutletsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ProductsInOutlets")
public class ProductsInOutletsAPIController {
    @Autowired
    ProductsInOutletsServiceImpl service;

    @RequestMapping("/get/list")
    List<ProductsInOutlets> getAll(){
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    ProductsInOutlets getById(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    ProductsInOutlets create(@RequestBody ProductsInOutlets productsInOutlets ){
        return service.save(productsInOutlets);
    }

    @RequestMapping("/delete/{id}")
    ProductsInOutlets delete( @PathVariable("id") String id) {
        return service.delete(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PATCH)
    ProductsInOutlets edit(@RequestBody ProductsInOutlets productsInOutlets){
        return service.edit(productsInOutlets);
    }

}
