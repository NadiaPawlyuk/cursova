package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.service.distribution.impls.DistributionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/organization/")
public class DistributionAPIController {
    @Autowired
    DistributionServiceImpl service;

    @RequestMapping("/DistributionController")
    List<Distribution> getAll()
    {
        return service.getAll();
    }

}
