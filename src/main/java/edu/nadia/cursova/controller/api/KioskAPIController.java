package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.Kiosk;
import edu.nadia.cursova.service.kiosk.impls.KioskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/organization")
public class KioskAPIController {
    @Autowired
    KioskServiceImpl service;

    @RequestMapping("/KioskController")
    List<Kiosk> getAll()
    {
        return service.getAll();
    }

}
