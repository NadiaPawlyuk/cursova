package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.OrganizationOfTrade;
import edu.nadia.cursova.service.organizationOfTrade.impls.OrganizationOfTradeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/OrganizationOfTrade")
public class OrganizationOfTradeAPIController {
   @Autowired
    OrganizationOfTradeServiceImpl service;

    @RequestMapping("/get/list")
    List<OrganizationOfTrade> getAll(){
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    OrganizationOfTrade getById(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    OrganizationOfTrade create(@RequestBody OrganizationOfTrade organizationOfTrade){
        return service.save(organizationOfTrade);
    }

    @RequestMapping("/delete/{id}")
    OrganizationOfTrade delete( @PathVariable("id") String id) {
        return service.delete(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PATCH)
    OrganizationOfTrade edit(@RequestBody OrganizationOfTrade organizationOfTrade){
        return service.edit(organizationOfTrade);
    }

}
