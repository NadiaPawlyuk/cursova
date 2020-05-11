package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/AccountingForBuyers")
public class AccountingForBuyersAPIController {
   @Autowired
    AccountingForBuyersServiceImpl service;

    @RequestMapping("/get/list")
    List<AccountingForBuyers> getAll()
    {
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    AccountingForBuyers getById(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    AccountingForBuyers create(@RequestBody AccountingForBuyers accountingForBuyers){
        return service.save(accountingForBuyers);
    }

    @RequestMapping("/delete/{id}")
    AccountingForBuyers delete( @PathVariable("id") String id) {
        return service.delete(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PATCH)
    AccountingForBuyers edit(@RequestBody AccountingForBuyers accountingForBuyers){
        return service.edit(accountingForBuyers);
    }

}
