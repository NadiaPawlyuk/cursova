package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.form.AccountingForBuyersForm;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/create",  method = RequestMethod.GET)
    String create(Model model)
    {
        AccountingForBuyersForm accountingForBuyersForm = new AccountingForBuyersForm();
        model.addAttribute("accountingForBuyersForm", accountingForBuyersForm);
        return "accountingForBuyersAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("accountingForBuyersForm") AccountingForBuyersForm accountingForBuyersForm){
        AccountingForBuyers accountingForBuyers = new AccountingForBuyers();
        accountingForBuyers.setInitials(accountingForBuyersForm.getInitials());
        accountingForBuyers.setNumberOfPhone(accountingForBuyersForm.getNumberOfPhone());
        accountingForBuyers.setDateOfBirthday(accountingForBuyersForm.getDateOfBirthday());
        accountingForBuyers.setDescription(accountingForBuyersForm.getDescription());
        service.save(accountingForBuyers);
        model.addAttribute("accountingForBuyers", service.getAll());
        return "accountingForBuyersList";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model,
                @PathVariable("id") String id){
        AccountingForBuyers accountingForBuyers = service.get(id);
        AccountingForBuyersForm accountingForBuyersForm = new AccountingForBuyersForm();
        accountingForBuyersForm.setInitials(accountingForBuyers.getInitials());
        accountingForBuyersForm.setNumberOfPhone(accountingForBuyers.getNumberOfPhone());
        accountingForBuyersForm.setDateOfBirthday(accountingForBuyers.getDateOfBirthday());
        accountingForBuyersForm.setDescription(accountingForBuyers.getDescription());
        model.addAttribute("accountingForBuyersForm", accountingForBuyersForm);
        return "accountingForBuyersAdd";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("accountingForBuyersForm") AccountingForBuyersForm accountingForBuyersForm){
        AccountingForBuyers accountingForBuyers = new AccountingForBuyers();
        accountingForBuyers.setId(id);
        accountingForBuyers.setInitials(accountingForBuyersForm.getInitials());
        accountingForBuyers.setNumberOfPhone(accountingForBuyersForm.getNumberOfPhone());
        accountingForBuyers.setDateOfBirthday(accountingForBuyersForm.getDateOfBirthday());
        accountingForBuyers.setDescription(accountingForBuyersForm.getDescription());
        service.save(accountingForBuyers);
        model.addAttribute("accountingForBuyers", service.getAll());
        return "redirect:/web/AccountingForBuyers/get/list";
    }

}


