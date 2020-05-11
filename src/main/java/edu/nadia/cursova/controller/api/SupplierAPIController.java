package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Supplier;
import edu.nadia.cursova.service.supplier.impls.SupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Supplier")
public class SupplierAPIController {
    @Autowired
    SupplierServiceImpl service;

    @RequestMapping("/get/list")
    List<Supplier> getAll(){
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    Supplier getById(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Supplier create(@RequestBody Supplier supplier){
        return service.save(supplier);
    }

    @RequestMapping("/delete/{id}")
    Supplier delete( @PathVariable("id") String id) {
        return service.delete(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PATCH)
    Supplier edit(@RequestBody Supplier supplier){
        return service.edit(supplier);
    }

}
