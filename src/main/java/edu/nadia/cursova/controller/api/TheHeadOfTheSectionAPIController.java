package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.TheHeadOfTheSection;
import edu.nadia.cursova.service.theHeadOfTheSection.impls.TheHeadOfTheSectionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/organization/")
public class TheHeadOfTheSectionAPIController {
    @Autowired
    TheHeadOfTheSectionServiceImpl service;
    @RequestMapping("/TheHeadOfTheSection")
    List<TheHeadOfTheSection> getAll(){
        return service.getAll();
    }
}
