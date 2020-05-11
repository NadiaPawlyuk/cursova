package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/web/AccountingForBuyers")
public class AccountingForBuyersWEBController {
   @Autowired
    AccountingForBuyersServiceImpl service;

    @RequestMapping("/get/list")
    String getAll(Model model)
    {
        model.addAttribute("accountingForBuyers", service.getAll());
        return "accountingForBuyersList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("accountingForBuyers", service.getAll());
        return "accountingForBuyersList";
    }
}
