package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.Order;
import edu.nadia.cursova.model.Section;
import edu.nadia.cursova.service.section.impls.SectionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Section")
public class SectionAPIController {
   @Autowired
    SectionServiceImpl service;

    @RequestMapping("/get/list")
    List<Section> getAll()
    {
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    Section getById(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Section create(@RequestBody Section section){
        return service.save(section);
    }

    @RequestMapping("/delete/{id}")
    Section delete( @PathVariable("id") String id) {
        return service.delete(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PATCH)
    Section edit(@RequestBody Section section){
        return service.edit(section);
    }
}
