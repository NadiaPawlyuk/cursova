package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.ProductsFromSuppliers;
import edu.nadia.cursova.service.productsFromSuppliers.impls.ProductsFromSuppliersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ProductsFromSuppliers")
public class ProductsFromSuppliersAPIController {
   @Autowired
    ProductsFromSuppliersServiceImpl service;

    @RequestMapping("/get/list")
    List<ProductsFromSuppliers> getAll()
    {
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    ProductsFromSuppliers getById(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    ProductsFromSuppliers create(@RequestBody ProductsFromSuppliers productsFromSuppliers){
        return service.save(productsFromSuppliers);
    }

    @RequestMapping("/delete/{id}")
    ProductsFromSuppliers delete( @PathVariable("id") String id) {
        return service.delete(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PATCH)
    ProductsFromSuppliers edit(@RequestBody ProductsFromSuppliers productsFromSuppliers){
        return service.edit(productsFromSuppliers);
    }

}
