package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.Store;
import edu.nadia.cursova.service.store.impls.StoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/organization/")
public class StoreAPIController {
    @Autowired
    StoreServiceImpl service;

    @RequestMapping("/Store")
    List<Store> getAll(){
        return service.getAll();
    }
}
