package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.Seller;
import edu.nadia.cursova.service.seller.impls.SellerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/organization/")
public class SellerAPIController {
    @Autowired
    SellerServiceImpl service;

    @RequestMapping("/Seller")
    List<Seller> getAll()
    {
        return service.getAll();
    }

}
