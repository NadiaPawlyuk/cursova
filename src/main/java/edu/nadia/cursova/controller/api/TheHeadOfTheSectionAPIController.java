package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.TheHeadOfTheSection;
import edu.nadia.cursova.service.theHeadOfTheSection.impls.TheHeadOfTheSectionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/TheHeadOfTheSection")
public class TheHeadOfTheSectionAPIController {
    @Autowired
    TheHeadOfTheSectionServiceImpl service;
    @RequestMapping("/get/list")
    List<TheHeadOfTheSection> getAll(){
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    TheHeadOfTheSection getById(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    TheHeadOfTheSection create(@RequestBody TheHeadOfTheSection theHeadOfTheSection){
        return service.save(theHeadOfTheSection);
    }

    @RequestMapping("/delete/{id}")
    TheHeadOfTheSection delete( @PathVariable("id") String id) {
        return service.delete(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PATCH)
    TheHeadOfTheSection edit(@RequestBody TheHeadOfTheSection theHeadOfTheSection){
        return service.edit(theHeadOfTheSection);
    }

}
