package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Kiosk;
import edu.nadia.cursova.service.kiosk.impls.KioskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Kiosk")
public class KioskAPIController {
    @Autowired
    KioskServiceImpl service;

    @RequestMapping("/get/list")
    List<Kiosk> getAll()
    {
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    Kiosk getById(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Kiosk create(@RequestBody Kiosk kiosk){
        return service.save(kiosk);
    }

    @RequestMapping("/delete/{id}")
    Kiosk delete( @PathVariable("id") String id) {
        return service.delete(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PATCH)
    Kiosk edit(@RequestBody Kiosk kiosk){
        return service.edit(kiosk);
    }


}
