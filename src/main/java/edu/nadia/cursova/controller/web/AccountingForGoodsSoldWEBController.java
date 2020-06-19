package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.form.AccountingForBuyersForm;
import edu.nadia.cursova.form.AccountingForGoodsSoldForm;
import edu.nadia.cursova.form.OrderToTheSupplierForm;
import edu.nadia.cursova.form.SearchForm;
import edu.nadia.cursova.model.*;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import edu.nadia.cursova.service.accountingForBuyers.interfaces.IAccountingForBuyersService;
import edu.nadia.cursova.service.accountingForGoodsSold.impls.AccountingForGoodsSoldServiceImpl;
import edu.nadia.cursova.service.directoryOfGoodsNomenclature.impls.DirectoryOfGoodsNomenclatureServiceImpl;
import edu.nadia.cursova.service.seller.impls.SellerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/web/AccountingForGoodsSold")
public class AccountingForGoodsSoldWEBController {
    @Autowired
    AccountingForGoodsSoldServiceImpl accountingForGoodsSoldService;

    @Autowired
    DirectoryOfGoodsNomenclatureServiceImpl directoryOfGoodsNomenclatureService;

    @Autowired
    SellerServiceImpl sellerService;

    @Autowired
    AccountingForBuyersServiceImpl accountingForBuyersService;

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String getAll(Model model)
    {
        List<AccountingForGoodsSold> list = accountingForGoodsSoldService.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("accountingForGoodsSold", accountingForGoodsSoldService.getAll());
        return "accountingForGoodsSoldList";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/get/list", method = RequestMethod.POST)
    String search(Model model,
                  @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getString();
        List<AccountingForGoodsSold> list = accountingForGoodsSoldService.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("accountingForGoodsSold", list);
        return "accountingForGoodsSoldList";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<AccountingForGoodsSold> accountingForGoodsSolds = accountingForGoodsSoldService.getAll();
        List<AccountingForGoodsSold> sorted = accountingForGoodsSoldService.sortByName(accountingForGoodsSolds);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("accountingForGoodsSold", sorted);
        return "accountingForGoodsSoldList";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/sort", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<AccountingForGoodsSold> list = accountingForGoodsSoldService.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("accountingForGoodsSold", list);
        return "accountingForGoodsSoldList";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        accountingForGoodsSoldService.delete(id);
        model.addAttribute("accountingForGoodsSold", accountingForGoodsSoldService.getAll());
        return "redirect:/web/AccountingForGoodsSold/get/list";
    }


    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/create",  method = RequestMethod.GET)
    String create(Model model)
    {
        AccountingForGoodsSoldForm accountingForGoodsSoldForm = new AccountingForGoodsSoldForm();
        Map<String, String> mavs1 = directoryOfGoodsNomenclatureService.getAll().stream()
                .collect(Collectors.toMap(DirectoryOfGoodsNomenclature::getId, DirectoryOfGoodsNomenclature::getTheNameOfTheProduct));
        model.addAttribute("mavs1", mavs1);
        Map<String, String> mavs2 = sellerService.getAll().stream()
                .collect(Collectors.toMap(Seller::getId, Seller::getInitials));
        model.addAttribute("mavs2", mavs2);
        Map<String, String> mavs3 = accountingForBuyersService.getAll().stream()
                .collect(Collectors.toMap(AccountingForBuyers::getId, AccountingForBuyers::getInitials));
        model.addAttribute("mavs3", mavs3);
        model.addAttribute("accountingForGoodsSoldForm", accountingForGoodsSoldForm);
        return "accountingForGoodsSoldAdd";

    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("accountingForGoodsSoldForm") AccountingForGoodsSoldForm accountingForGoodsSoldForm){
        AccountingForGoodsSold accountingForGoodsSold = new AccountingForGoodsSold();
        DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature = directoryOfGoodsNomenclatureService.get(accountingForGoodsSoldForm.getExternalCommunicationWithTheDirectoryOfNomenclatureGoods());
        Seller seller = sellerService.get(accountingForGoodsSoldForm.getExternalCommunicationWithTheSeller());
        AccountingForBuyers accountingForBuyers = accountingForBuyersService.get(accountingForGoodsSoldForm.getExternalCommunicationWithCustomerAccounting());
        accountingForGoodsSold.setOfftake(accountingForGoodsSoldForm.getOfftake());
        accountingForGoodsSold.setExternalCommunicationWithTheDirectoryOfNomenclatureGoods(directoryOfGoodsNomenclature);
        accountingForGoodsSold.setExternalCommunicationWithCustomerAccounting(accountingForBuyers);
        accountingForGoodsSold.setExternalCommunicationWithTheSeller(seller);
        accountingForGoodsSold.setDescription(accountingForGoodsSoldForm.getDescription());
        accountingForGoodsSoldService.save(accountingForGoodsSold);
        model.addAttribute("accountingForGoodsSold", accountingForGoodsSoldService.getAll());
        return "redirect:/web/AccountingForGoodsSold/get/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model,
                @PathVariable("id") String id){
        Map<String, String> mavs1 = directoryOfGoodsNomenclatureService.getAll().stream()
                .collect(Collectors.toMap(DirectoryOfGoodsNomenclature::getId, DirectoryOfGoodsNomenclature::getTheNameOfTheProduct));
        Map<String, String> mavs2 = sellerService.getAll().stream()
                .collect(Collectors.toMap(Seller::getId, Seller::getInitials));
        Map<String, String> mavs3 = accountingForBuyersService.getAll().stream()
                .collect(Collectors.toMap(AccountingForBuyers::getId, AccountingForBuyers::getInitials));

        AccountingForGoodsSold accountingForGoodsSold = accountingForGoodsSoldService.get(id);
        AccountingForGoodsSoldForm accountingForGoodsSoldForm = new AccountingForGoodsSoldForm();
        accountingForGoodsSoldForm.setOfftake(accountingForGoodsSold.getOfftake());
        accountingForGoodsSoldForm.setExternalCommunicationWithTheDirectoryOfNomenclatureGoods(accountingForGoodsSold.getExternalCommunicationWithTheDirectoryOfNomenclatureGoods().getTheNameOfTheProduct());
        accountingForGoodsSoldForm.setExternalCommunicationWithCustomerAccounting(accountingForGoodsSold.getExternalCommunicationWithCustomerAccounting().getInitials());
        accountingForGoodsSoldForm.setExternalCommunicationWithTheSeller(accountingForGoodsSold.getExternalCommunicationWithTheSeller().getInitials());
        accountingForGoodsSoldForm.setDescription(accountingForGoodsSold.getDescription());
        model.addAttribute("mavs1", mavs1);
        model.addAttribute("mavs2", mavs2);
        model.addAttribute("mavs3", mavs3);
        model.addAttribute("accountingForGoodsSoldForm", accountingForGoodsSoldForm);
        return "accountingForGoodsSoldAdd";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("accountingForBuyersForm") AccountingForGoodsSoldForm accountingForGoodsSoldForm){
        AccountingForGoodsSold accountingForGoodsSold = new AccountingForGoodsSold();
        DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature = directoryOfGoodsNomenclatureService.get(accountingForGoodsSoldForm.getExternalCommunicationWithTheDirectoryOfNomenclatureGoods());
        Seller seller = sellerService.get(accountingForGoodsSoldForm.getExternalCommunicationWithTheSeller());
        AccountingForBuyers accountingForBuyers = accountingForBuyersService.get(accountingForGoodsSoldForm.getExternalCommunicationWithCustomerAccounting());
        accountingForGoodsSold.setId(id);
        accountingForGoodsSold.setOfftake(accountingForGoodsSoldForm.getOfftake());
        accountingForGoodsSold.setExternalCommunicationWithTheDirectoryOfNomenclatureGoods(directoryOfGoodsNomenclature);
        accountingForGoodsSold.setExternalCommunicationWithCustomerAccounting(accountingForBuyers);
        accountingForGoodsSold.setExternalCommunicationWithTheSeller(seller);
        accountingForGoodsSold.setDescription(accountingForGoodsSoldForm.getDescription());
        accountingForGoodsSoldService.save(accountingForGoodsSold);
        model.addAttribute("accountingForGoodsSold", accountingForGoodsSoldService.getAll());
        return "redirect:/web/AccountingForGoodsSold/get/list";

    }

}