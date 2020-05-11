package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.model.TheHeadOfTheSection;
import edu.nadia.cursova.service.theHeadOfTheSection.impls.TheHeadOfTheSectionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/web/TheHeadOfTheSection")
public class TheHeadOfTheSectionWEBController {
    @Autowired
    TheHeadOfTheSectionServiceImpl service;
    @RequestMapping("/get/list")
    String getAll(Model model)
    {
        model.addAttribute("theHeadOfTheSection", service.getAll());
        return "theHeadOfTheSectionList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("theHeadOfTheSection", service.getAll());
        return "theHeadOfTheSectionList";
    }
}
