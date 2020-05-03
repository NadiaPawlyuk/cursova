package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.Hall;
import edu.nadia.cursova.service.hall.impls.HallServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/organization/")
public class HallAPIController {
    @Autowired
    HallServiceImpl service;

    @RequestMapping("/HallController")
    List<Hall> getAll()
    {
        return service.getAll();
    }
}
