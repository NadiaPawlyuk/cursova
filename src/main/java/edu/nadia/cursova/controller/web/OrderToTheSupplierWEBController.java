package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.form.*;
import edu.nadia.cursova.model.*;
import edu.nadia.cursova.service.directoryOfGoodsNomenclature.impls.DirectoryOfGoodsNomenclatureServiceImpl;
import edu.nadia.cursova.service.orderToTheSupplier.impls.OrderToTheSupplierServiceImpl;
import edu.nadia.cursova.service.outlet.impls.OutletServiceImpl;
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
@RequestMapping("/web/OrderToTheSupplier")
public class OrderToTheSupplierWEBController {
   @Autowired
    OrderToTheSupplierServiceImpl orderToTheSupplierService;

   @Autowired
   OutletServiceImpl outletService;


   @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String getAll(Model model)
    {
        List<OrderToTheSupplier> list = orderToTheSupplierService.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("orderToTheSupplier", orderToTheSupplierService.getAll());
        return "orderToTheSupplierList";
    }

    @RequestMapping(value = "/get/list", method = RequestMethod.POST)
    String search(Model model,
                  @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getString();
        List<OrderToTheSupplier> list = orderToTheSupplierService.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("orderToTheSupplier", list);
        return "orderToTheSupplierList";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<OrderToTheSupplier> orderToTheSuppliers = orderToTheSupplierService.getAll();
        List<OrderToTheSupplier> sorted = orderToTheSupplierService.sortByName(orderToTheSuppliers);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("orderToTheSupplier", sorted);
        return "orderToTheSupplierList";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<OrderToTheSupplier> list = orderToTheSupplierService.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("orderToTheSupplier", list);
        return "orderToTheSupplierList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        orderToTheSupplierService.delete(id);
        model.addAttribute("orderToTheSupplier", orderToTheSupplierService.getAll());
        return "redirect:/web/OrderToTheSupplier/get/list";
    }


    @RequestMapping(value = "/create", method = RequestMethod.GET)
    String create(Model model){
        OrderToTheSupplierForm orderToTheSupplierForm = new OrderToTheSupplierForm();
        Map<String, String> mavs = outletService.getAll().stream()
                .collect(Collectors.toMap(Outlet::getId, Outlet::getName));
        model.addAttribute("mavs", mavs);
        model.addAttribute("orderToTheSupplierForm", orderToTheSupplierForm);
        return "orderToTheSupplierAdd";
    }

    @PostMapping(value = "/create")
    String create(Model model, @ModelAttribute("orderToTheSupplierForm") OrderToTheSupplierForm orderToTheSupplierForm){
        OrderToTheSupplier orderToTheSupplier = new OrderToTheSupplier();
        Outlet outlet = outletService.get(orderToTheSupplierForm.getExternalCommunicationWithNomenclature());
        orderToTheSupplier.setTheNameOfTheProduct(orderToTheSupplierForm.getTheNameOfTheProduct());
        orderToTheSupplier.setNumberOfGoods(orderToTheSupplierForm.getNumberOfGoods());
        orderToTheSupplier.setDescription(orderToTheSupplierForm.getDescription());
        orderToTheSupplier.setExternalCommunicationWithNomenclature(outlet);
        orderToTheSupplierService.save(orderToTheSupplier);
        model.addAttribute("orderToTheSupplier", orderToTheSupplierService.getAll());
        return "redirect:/web/OrderToTheSupplier/get/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model,
                @PathVariable("id") String id){
        Map<String, String> mavs = outletService.getAll().stream()
                .collect(Collectors.toMap(Outlet::getId, Outlet::getName));
        OrderToTheSupplier orderToTheSupplier = orderToTheSupplierService.get(id);
        OrderToTheSupplierForm orderToTheSupplierForm = new OrderToTheSupplierForm();
        orderToTheSupplierForm.setTheNameOfTheProduct(orderToTheSupplier.getTheNameOfTheProduct());
        orderToTheSupplierForm.setNumberOfGoods(orderToTheSupplier.getNumberOfGoods());
        orderToTheSupplierForm.setExternalCommunicationWithNomenclature(orderToTheSupplier.getExternalCommunicationWithNomenclature().getName());
        orderToTheSupplierForm.setDescription(orderToTheSupplier.getDescription());
        model.addAttribute("mavs", mavs);
        model.addAttribute("orderToTheSupplierForm", orderToTheSupplierForm);
        return "orderToTheSupplierAdd";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("orderToTheSupplierForm") OrderToTheSupplierForm orderToTheSupplierForm){
        OrderToTheSupplier orderToTheSupplier = new OrderToTheSupplier();
        Outlet outlet = outletService.get(orderToTheSupplierForm.getExternalCommunicationWithNomenclature());
        orderToTheSupplier.setId(id);
        orderToTheSupplier.setTheNameOfTheProduct(orderToTheSupplierForm.getTheNameOfTheProduct());
        orderToTheSupplier.setNumberOfGoods(orderToTheSupplierForm.getNumberOfGoods());
        orderToTheSupplier.setExternalCommunicationWithNomenclature(outlet);
        orderToTheSupplier.setDescription(orderToTheSupplierForm.getDescription());
        orderToTheSupplierService.save(orderToTheSupplier);
        model.addAttribute("orderToTheSupplier", orderToTheSupplierService.getAll());
        return "redirect:/web/OrderToTheSupplier/get/list";
    }
}