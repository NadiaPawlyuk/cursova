package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/organization/")
public class AccountingForBuyersAPIController {
   @Autowired
    AccountingForBuyersServiceImpl service;

    @RequestMapping("/AccountingForBuyersController")
    List<AccountingForBuyers> getAll()
    {
        return service.getAll();
    }


}
