package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.form.AccountingForBuyersForm;
import edu.nadia.cursova.form.DistributionForm;
import edu.nadia.cursova.form.HallForm;
import edu.nadia.cursova.form.KioskForm;
import edu.nadia.cursova.model.*;
import edu.nadia.cursova.service.kiosk.impls.KioskServiceImpl;
import edu.nadia.cursova.service.outlet.impls.OutletServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/web/Kiosk")
public class KioskWEBController {
    @Autowired
    KioskServiceImpl service;

    @Autowired
    OutletServiceImpl outletService;

    @RequestMapping("/get/list")
   String getAll(Model model)
    {
        model.addAttribute("kiosks", service.getAll());
        return "kioskList";
    }
    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("kiosks", service.getAll());
        return "kioskList";
    }

    @RequestMapping(value = "/create",  method = RequestMethod.GET)
    String create(Model model)
    {
        KioskForm kioskForm = new KioskForm();
        Map<String, String> mavs = outletService.getAll().stream()
                .collect(Collectors.toMap(Outlet::getId, Outlet::getName));
        model.addAttribute("mavs", mavs);
        model.addAttribute("kioskForm", kioskForm);
        return "kioskAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("kioskForm") KioskForm kioskForm){
        Kiosk kiosk = new Kiosk();
        Outlet outlet = outletService.get(kioskForm.getNameOfTheKiosk());
        kiosk.setNameOfTheKiosk(outlet);
        kiosk.setNumberOfSellers(kioskForm.getNumberOfSellers());
        kiosk.setNumberOfCounters(kioskForm.getNumberOfCounters());
        kiosk.setAddress(kioskForm.getAddress());
        kiosk.setAddress(kioskForm.getAddress());
        kiosk.setTheSizeOfTheOutlet(kioskForm.getTheSizeOfTheOutlet());
        kiosk.setRent(kioskForm.getRent());
        kiosk.setUtilities(kioskForm.getUtilities());
        kiosk.setDescription(kioskForm.getDescription());
        service.save(kiosk);
        model.addAttribute("kiosks", service.getAll());
        return "redirect:/web/Kiosk/get/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model,
                @PathVariable("id") String id){
        Kiosk kiosk = service.get(id);
        Map<String, String> mavs = outletService.getAll().stream()
                .collect(Collectors.toMap(Outlet::getId, Outlet::getName));
        KioskForm kioskForm = new KioskForm();
        kioskForm.setNameOfTheKiosk(kiosk.getNameOfTheKiosk().getName());
        kioskForm.setNumberOfSellers(kiosk.getNumberOfSellers());
        kioskForm.setNumberOfCounters(kiosk.getNumberOfCounters());
        kioskForm.setAddress(kiosk.getAddress());
        kioskForm.setAddress(kiosk.getAddress());
        kioskForm.setTheSizeOfTheOutlet(kiosk.getTheSizeOfTheOutlet());
        kioskForm.setRent(kiosk.getRent());
        kioskForm.setUtilities(kiosk.getUtilities());
        kioskForm.setDescription(kiosk.getDescription());
        model.addAttribute("mavs", mavs);
        model.addAttribute("kioskForm", kioskForm);
        return "kioskAdd";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("kioskForm") KioskForm kioskForm){
        Kiosk kiosk = new Kiosk();
        Outlet outlet = outletService.get(kioskForm.getNameOfTheKiosk());
        kiosk.setId(id);
        kiosk.setNameOfTheKiosk(outlet);
        kiosk.setNumberOfSellers(kioskForm.getNumberOfSellers());
        kiosk.setNumberOfCounters(kioskForm.getNumberOfCounters());
        kiosk.setAddress(kioskForm.getAddress());
        kiosk.setAddress(kioskForm.getAddress());
        kiosk.setTheSizeOfTheOutlet(kioskForm.getTheSizeOfTheOutlet());
        kiosk.setRent(kioskForm.getRent());
        kiosk.setUtilities(kioskForm.getUtilities());
        kiosk.setDescription(kioskForm.getDescription());
        service.save(kiosk);
        model.addAttribute("kiosk", service.getAll());
        return "redirect:/web/Kiosk/get/list";
    }
}
