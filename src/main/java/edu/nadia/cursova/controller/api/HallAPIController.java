package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.Hall;
import edu.nadia.cursova.service.hall.impls.HallServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Hall")
public class HallAPIController {
    @Autowired
    HallServiceImpl service;

    @RequestMapping("/get/list")
    List<Hall> getAll()
    {
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    Hall getById(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Hall create(@RequestBody Hall hall){
        return service.save(hall);
    }

    @RequestMapping("/delete/{id}")
    Hall delete( @PathVariable("id") String id) {
        return service.delete(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PATCH)
    Hall edit(@RequestBody Hall hall ){
        return service.edit(hall);
    }

}
