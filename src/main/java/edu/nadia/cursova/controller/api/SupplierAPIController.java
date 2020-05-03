package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.Supplier;
import edu.nadia.cursova.service.supplier.impls.SupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/organization/")
public class SupplierAPIController {
    @Autowired
    SupplierServiceImpl service;

    @RequestMapping("/Supplier")
    List<Supplier> getAll(){
        return service.getAll();
    }
}
