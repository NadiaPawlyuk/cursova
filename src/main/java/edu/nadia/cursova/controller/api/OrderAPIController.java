package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.Order;
import edu.nadia.cursova.service.order.impls.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/organization/")
public class OrderAPIController {
    @Autowired
    OrderServiceImpl service;

    @RequestMapping("/Order")
    List<Order> getAll(){
        return service.getAll();
    }
}
