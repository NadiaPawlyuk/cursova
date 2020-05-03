package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.Manager;
import edu.nadia.cursova.service.manager.impls.ManagerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/organization/")
public class ManagerAPIController {
    @Autowired
    ManagerServiceImpl service;

    @RequestMapping("/Manager")
    List<Manager> getAll(){
        return service.getAll();
    }
}
