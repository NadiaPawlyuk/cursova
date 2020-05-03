package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.model.Kiosk;
import edu.nadia.cursova.service.kiosk.impls.KioskServiceImpl;
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
@RequestMapping("/web/organization")
public class KioskWEBController {
    @Autowired
    KioskServiceImpl service;

    @RequestMapping("/KioskController")
   String getAll(Model model)
    {
        model.addAttribute("kiosks", service.getAll());
        return "kioskList";
    }
    @RequestMapping("/KioskController/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("kiosks", service.getAll());
        return "kioskList";
    }
}
