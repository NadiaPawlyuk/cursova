package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.Outlet;
import edu.nadia.cursova.service.outlet.impls.OutletServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/organization/")
public class OutletAPIController {
    @Autowired
    OutletServiceImpl service;

    @RequestMapping("/Outlet")
    List<Outlet> getAll()
    {
        return service.getAll();
    }
}
