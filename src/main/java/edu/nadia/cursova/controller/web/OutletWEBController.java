package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.form.AccountingForBuyersForm;
import edu.nadia.cursova.form.DistributionForm;
import edu.nadia.cursova.form.OrganizationOfTradeForm;
import edu.nadia.cursova.form.OutletForm;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.model.Outlet;
import edu.nadia.cursova.service.outlet.impls.OutletServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/web/Outlet")
public class OutletWEBController {
    @Autowired
    OutletServiceImpl service;

    @RequestMapping("/get/list")
    String getAll(Model model)
    {
        model.addAttribute("outlets", service.getAll());
        return "outletList";
    }
    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("outlets", service.getAll());
        return "outletList";
    }

    @RequestMapping(value = "/create",  method = RequestMethod.GET)
    String create(Model model)
    {
        OutletForm outletForm = new OutletForm();
        model.addAttribute("outletForm", outletForm);
        return "outletAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("outletForm") OutletForm outletForm){
        Outlet outlet = new Outlet();
        outlet.setName(outletForm.getName());
        outlet.setKindOfOutlet(outletForm.getKindOfOutlet());
        outlet.setDescription(outletForm.getDescription());
        service.save(outlet);
        model.addAttribute("outlets", service.getAll());
        return "outletList";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model,
                @PathVariable("id") String id){
        Outlet outlet = service.get(id);
        OutletForm outletForm = new OutletForm();
        outletForm.setName(outlet.getName());
        outletForm.setKindOfOutlet(outlet.getKindOfOutlet());
        outletForm.setDescription(outlet.getDescription());
        model.addAttribute("outletForm", outletForm);
        return "outletAdd";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("outletForm") OutletForm outletForm){
        Outlet outlet = new Outlet();
        outlet.setId(id);
        outlet.setName(outletForm.getName());
        outlet.setKindOfOutlet(outletForm.getKindOfOutlet());
        outlet.setDescription(outletForm.getDescription());
        service.save(outlet);
        model.addAttribute("outlets", service.getAll());
        return "redirect:/web/Outlet/get/list";
    }
}