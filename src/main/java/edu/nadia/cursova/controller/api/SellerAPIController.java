package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.Order;
import edu.nadia.cursova.model.Seller;
import edu.nadia.cursova.service.seller.impls.SellerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Seller")
public class SellerAPIController {
    @Autowired
    SellerServiceImpl service;

    @RequestMapping("/get/list")
    List<Seller> getAll()
    {
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    Seller getById(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Seller create(@RequestBody Seller seller){
        return service.save(seller);
    }

    @RequestMapping("/delete/{id}")
    Seller delete( @PathVariable("id") String id) {
        return service.delete(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PATCH)
    Seller edit(@RequestBody Seller seller){
        return service.edit(seller);
    }

}
