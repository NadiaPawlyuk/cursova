package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.Order;
import edu.nadia.cursova.model.Store;
import edu.nadia.cursova.service.store.impls.StoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Store")
public class StoreAPIController {
    @Autowired
    StoreServiceImpl service;

    @RequestMapping("/get/list")
    List<Store> getAll(){
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    Store getById(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Store create(@RequestBody Store store){
        return service.save(store);
    }

    @RequestMapping("/delete/{id}")
    Store delete( @PathVariable("id") String id) {
        return service.delete(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PATCH)
    Store edit(@RequestBody Store store){
        return service.edit(store);
    }
}
