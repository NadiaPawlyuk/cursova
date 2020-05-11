package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Order;
import edu.nadia.cursova.service.order.impls.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Order")
public class OrderAPIController {
    @Autowired
    OrderServiceImpl service;

    @RequestMapping("/get/list")
    List<Order> getAll(){
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    Order getById(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Order create(@RequestBody Order order){
        return service.save(order);
    }

    @RequestMapping("/delete/{id}")
    Order delete( @PathVariable("id") String id) {
        return service.delete(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PATCH)
    Order edit(@RequestBody Order order){
        return service.edit(order);
    }

}
