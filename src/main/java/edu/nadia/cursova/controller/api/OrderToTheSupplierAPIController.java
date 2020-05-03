package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.OrderToTheSupplier;
import edu.nadia.cursova.service.orderToTheSupplier.impls.OrderToTheSupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/organization/")
public class OrderToTheSupplierAPIController {
   @Autowired
    OrderToTheSupplierServiceImpl service;

    @RequestMapping("/OrderToTheSupplier")
    List<OrderToTheSupplier> getAll()
    {
        return service.getAll();
    }
}
