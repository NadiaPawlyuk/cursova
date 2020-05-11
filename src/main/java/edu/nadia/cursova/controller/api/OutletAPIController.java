package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Outlet;
import edu.nadia.cursova.service.outlet.impls.OutletServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Outlet")
public class OutletAPIController {
    @Autowired
    OutletServiceImpl service;

    @RequestMapping("/get/list")
    List<Outlet> getAll()
    {
        return service.getAll();
    }
    @RequestMapping("/get/{id}")
    Outlet getById(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Outlet create(@RequestBody Outlet outlet){
        return service.save(outlet);
    }

    @RequestMapping("/delete/{id}")
    Outlet delete( @PathVariable("id") String id) {
        return service.delete(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PATCH)
    Outlet edit(@RequestBody Outlet outlet){
        return service.edit(outlet);
    }

}
