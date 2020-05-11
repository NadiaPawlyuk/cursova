package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.DepartmentStore;
import edu.nadia.cursova.service.departmentStore.impls.DepartmentStoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/DepartmentStore")
public class DepartmentStoreAPIController {
    @Autowired
    DepartmentStoreServiceImpl service;
    @RequestMapping("/get/list")
    List<DepartmentStore> getAll()
    {
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    DepartmentStore getById(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    DepartmentStore create(@RequestBody DepartmentStore departmentStore){
        return service.save(departmentStore);
    }

    @RequestMapping("/delete/{id}")
    DepartmentStore delete( @PathVariable("id") String id) {
        return service.delete(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PATCH)
    DepartmentStore edit(@RequestBody DepartmentStore departmentStore ){
        return service.edit(departmentStore);
    }

}
