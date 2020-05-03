package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.DepartmentStore;
import edu.nadia.cursova.service.departmentStore.impls.DepartmentStoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/organization/")
public class DepartmentStoreAPIController {
    @Autowired
    DepartmentStoreServiceImpl service;
    @RequestMapping("/DepartmentStoreController")
    List<DepartmentStore> getAll()
    {
        return service.getAll();
    }
}
