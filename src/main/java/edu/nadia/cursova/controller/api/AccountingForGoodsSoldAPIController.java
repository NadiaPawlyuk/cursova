package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.AccountingForGoodsSold;
import edu.nadia.cursova.service.accountingForGoodsSold.impls.AccountingForGoodsSoldServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/AccountingForGoodsSold")
public class AccountingForGoodsSoldAPIController {
    @Autowired
    AccountingForGoodsSoldServiceImpl service;

    @RequestMapping("/get/list")
    List<AccountingForGoodsSold> getAll(){
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    AccountingForGoodsSold getById(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    AccountingForGoodsSold create(@RequestBody AccountingForGoodsSold accountingForGoodsSold){
        return service.save(accountingForGoodsSold);
    }

    @RequestMapping("/delete/{id}")
    AccountingForGoodsSold delete( @PathVariable("id") String id) {
        return service.delete(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PATCH)
    AccountingForGoodsSold edit(@RequestBody AccountingForGoodsSold accountingForGoodsSold){
        return service.edit(accountingForGoodsSold);
    }


}
