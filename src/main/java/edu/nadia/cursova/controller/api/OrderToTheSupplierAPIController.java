package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.OrderToTheSupplier;
import edu.nadia.cursova.service.orderToTheSupplier.impls.OrderToTheSupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/OrderToTheSupplier")
public class OrderToTheSupplierAPIController {
   @Autowired
    OrderToTheSupplierServiceImpl service;

    @RequestMapping("/get/list")
    List<OrderToTheSupplier> getAll()
    {
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    OrderToTheSupplier getById(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    OrderToTheSupplier create(@RequestBody OrderToTheSupplier orderToTheSupplier){
        return service.save(orderToTheSupplier);
    }

    @RequestMapping("/delete/{id}")
    OrderToTheSupplier delete( @PathVariable("id") String id) {
        return service.delete(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PATCH)
    OrderToTheSupplier edit(@RequestBody OrderToTheSupplier orderToTheSupplier){
        return service.edit(orderToTheSupplier);
    }

}
