package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.form.*;
import edu.nadia.cursova.model.*;
import edu.nadia.cursova.service.directoryOfGoodsNomenclature.impls.DirectoryOfGoodsNomenclatureServiceImpl;
import edu.nadia.cursova.service.outlet.impls.OutletServiceImpl;
import edu.nadia.cursova.service.productsInOutlets.impls.ProductsInOutletsServiceImpl;
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
@RequestMapping("/web/ProductsInOutlets")
public class ProductsInOutletsWEBController {
    @Autowired
    ProductsInOutletsServiceImpl service;

    @Autowired
    DirectoryOfGoodsNomenclatureServiceImpl directoryOfGoodsNomenclatureService;
    
    @Autowired
    OutletServiceImpl outletService;

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String getAll(Model model)
    {
        List<ProductsInOutlets> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("productsInOutlets", service.getAll());
        return "productsInOutletsList";
    }

    @RequestMapping(value = "/get/list", method = RequestMethod.POST)
    String search(Model model,
                  @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getString();
        List<ProductsInOutlets> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("productsInOutlets", list);
        return "productsInOutletsList";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<ProductsInOutlets> productsInOutlets = service.getAll();
        List<ProductsInOutlets> sorted = service.sortByName(productsInOutlets);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("productsInOutlets", sorted);
        return "productsInOutletsList";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<ProductsInOutlets> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("productsInOutlets", list);
        return "productsInOutletsList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("productsInOutlets", service.getAll());
        return "productsInOutletsList";
    }

    @RequestMapping(value = "/create",  method = RequestMethod.GET)
    String create(Model model)
    {
        ProductsInOutletsForm productsInOutletsForm = new ProductsInOutletsForm();
        Map<String, String> mavs1 = directoryOfGoodsNomenclatureService.getAll().stream()
                .collect(Collectors.toMap(DirectoryOfGoodsNomenclature::getId, DirectoryOfGoodsNomenclature::getTheNameOfTheProduct));
        Map<String, String> mavs2 = outletService.getAll().stream()
                .collect(Collectors.toMap(Outlet::getId, Outlet::getName));
        model.addAttribute("mavs1", mavs1);
        model.addAttribute("mavs2", mavs2);
        model.addAttribute("productsInOutletsForm", productsInOutletsForm);
        return "productsInOutletsAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("productsInOutletsForm") ProductsInOutletsForm productsInOutletsForm ){
        ProductsInOutlets productsInOutlets = new ProductsInOutlets();
        DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature = directoryOfGoodsNomenclatureService.get(productsInOutletsForm.getExternalCommunicationWithTheNomenclature());
        Outlet outlet = outletService.get(productsInOutletsForm.getOutlet());
        productsInOutlets.setExternalCommunicationWithTheNomenclature(directoryOfGoodsNomenclature);
        productsInOutlets.setPrice(productsInOutletsForm.getPrice());
        productsInOutlets.setNumberOfGoods(productsInOutletsForm.getNumberOfGoods());
        productsInOutlets.setOutlet(outlet);
        productsInOutlets.setDescription(productsInOutletsForm.getDescription());
        service.save(productsInOutlets);
        model.addAttribute("productsInOutlets", service.getAll());
        return "redirect:/web/ProductsInOutlets/get/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model,
                @PathVariable("id") String id){
        Map<String, String> mavs1 = directoryOfGoodsNomenclatureService.getAll().stream()
                .collect(Collectors.toMap(DirectoryOfGoodsNomenclature::getId, DirectoryOfGoodsNomenclature::getTheNameOfTheProduct));
        Map<String, String> mavs2 = outletService.getAll().stream()
                .collect(Collectors.toMap(Outlet::getId, Outlet::getName));
        ProductsInOutlets productsInOutlets = service.get(id);
        ProductsInOutletsForm productsInOutletsForm = new ProductsInOutletsForm();
        productsInOutletsForm.setExternalCommunicationWithTheNomenclature(productsInOutlets.getExternalCommunicationWithTheNomenclature().getTheNameOfTheProduct());
        productsInOutletsForm.setPrice(productsInOutlets.getPrice());
        productsInOutletsForm.setNumberOfGoods(productsInOutlets.getNumberOfGoods());
        productsInOutletsForm.setOutlet(productsInOutlets.getOutlet().getName());
        productsInOutletsForm.setDescription(productsInOutlets.getDescription());
        model.addAttribute("mavs1", mavs1);
        model.addAttribute("mavs2", mavs2);
        model.addAttribute("productsInOutletsForm", productsInOutletsForm);
        return "productsInOutletsAdd";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("productsInOutletsForm") ProductsInOutletsForm productsInOutletsForm) {
        ProductsInOutlets productsInOutlets = new ProductsInOutlets();
        DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature = directoryOfGoodsNomenclatureService.get(productsInOutletsForm.getExternalCommunicationWithTheNomenclature());
        Outlet outlet = outletService.get(productsInOutletsForm.getOutlet());
        productsInOutlets.setId(id);
        productsInOutlets.setExternalCommunicationWithTheNomenclature(directoryOfGoodsNomenclature);
        productsInOutlets.setPrice(productsInOutletsForm.getPrice());
        productsInOutlets.setNumberOfGoods(productsInOutletsForm.getNumberOfGoods());
        productsInOutlets.setOutlet(outlet);
        productsInOutlets.setDescription(productsInOutletsForm.getDescription());
        service.save(productsInOutlets);
        model.addAttribute("productsInOutlets", service.getAll());
        return "redirect:/web/ProductsInOutlets/get/list";
    }
    }