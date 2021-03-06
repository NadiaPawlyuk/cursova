package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.AccountingForGoodsSold;
import edu.nadia.cursova.service.accountingForGoodsSold.impls.AccountingForGoodsSoldServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/organization/")
public class AccountingForGoodsSoldAPIController {
    @Autowired
    AccountingForGoodsSoldServiceImpl service;

    @RequestMapping("/AccountingForGoodsSoldController")
    List<AccountingForGoodsSold> getAll(){
        return service.getAll();
    }

}
