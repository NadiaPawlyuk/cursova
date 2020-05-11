package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Manager;
import edu.nadia.cursova.service.manager.impls.ManagerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Manager")
public class ManagerAPIController {
    @Autowired
    ManagerServiceImpl service;

    @RequestMapping("/get/list")
    List<Manager> getAll(){
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    Manager getById(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Manager create(@RequestBody Manager manager){
        return service.save(manager);
    }

    @RequestMapping("/delete/{id}")
    Manager delete( @PathVariable("id") String id) {
        return service.delete(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PATCH)
    Manager edit(@RequestBody Manager manager){
        return service.edit(manager);
    }

}
