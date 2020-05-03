package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.Section;
import edu.nadia.cursova.service.section.impls.SectionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/organization/")
public class SectionAPIController {
   @Autowired
    SectionServiceImpl service;

    @RequestMapping("/Section")
    List<Section> getAll()
    {
        return service.getAll();
    }
}
