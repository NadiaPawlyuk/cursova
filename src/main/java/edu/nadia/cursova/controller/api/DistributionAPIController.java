package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.service.distribution.impls.DistributionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Distribution")
public class DistributionAPIController {
    @Autowired
    DistributionServiceImpl service;

    @RequestMapping("/get/list")
    List<Distribution> getAll()
    {
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    Distribution getById(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Distribution create(@RequestBody Distribution distribution){
        return service.save(distribution);
    }

    @RequestMapping("/delete/{id}")
    Distribution delete( @PathVariable("id") String id) {
        return service.delete(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PATCH)
    Distribution edit(@RequestBody Distribution distribution){
        return service.edit(distribution);
    }

}
