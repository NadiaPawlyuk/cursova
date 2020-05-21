package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.form.*;
import edu.nadia.cursova.model.*;
import edu.nadia.cursova.service.directoryOfGoodsNomenclature.impls.DirectoryOfGoodsNomenclatureServiceImpl;
import edu.nadia.cursova.service.manager.impls.ManagerServiceImpl;
import edu.nadia.cursova.service.order.impls.OrderServiceImpl;
import edu.nadia.cursova.service.supplier.impls.SupplierServiceImpl;
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
@RequestMapping("/web/Order")
public class OrderWEBController {
    @Autowired
    OrderServiceImpl service;

    @Autowired
    DirectoryOfGoodsNomenclatureServiceImpl directoryOfGoodsNomenclatureService;

    @Autowired
    SupplierServiceImpl supplierService;

    @Autowired
    ManagerServiceImpl managerService;

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String getAll(Model model)
    {
        List<Order> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("orders", service.getAll());
        return "orderList";
    }

    @RequestMapping(value = "/get/list", method = RequestMethod.POST)
    String search(Model model,
                  @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getString();
        List<Order> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("orders", list);
        return "orderList";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<Order> orders = service.getAll();
        List<Order> sorted = service.sortByName(orders);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("orders", sorted);
        return "orderList";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Order> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("orders", list);
        return "orderList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("orders", service.getAll());
        return "orderList";
    }

    @RequestMapping(value = "/create",  method = RequestMethod.GET)
    String create(Model model)
    {
        OrderForm orderForm = new OrderForm();
        Map<String, String> mavs1 = directoryOfGoodsNomenclatureService.getAll().stream()
                .collect(Collectors.toMap(DirectoryOfGoodsNomenclature::getId, DirectoryOfGoodsNomenclature::getTheNameOfTheProduct));
        model.addAttribute("mavs1", mavs1);
        Map<String, String> mavs2 = supplierService.getAll().stream()
                .collect(Collectors.toMap(Supplier::getId, Supplier::getInitials));
        model.addAttribute("mavs2", mavs2);
        Map<String, String> mavs3 = managerService.getAll().stream()
                .collect(Collectors.toMap(Manager::getId, Manager::getInitials));
        model.addAttribute("mavs3", mavs3);
        model.addAttribute("orderForm", orderForm);
        return "orderAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("distributionForm") OrderForm orderForm){
        Order order = new Order();
        DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature = directoryOfGoodsNomenclatureService.get(orderForm.getExternalCommunicationWithNomenclature());
        Supplier supplier = supplierService.get(orderForm.getExternalCommunicationWithSupplier());
        Manager manager = managerService.get(orderForm.getExternalCommunicationWithManagers());
        order.setExternalCommunicationWithNomenclature(directoryOfGoodsNomenclature);
        order.setNumberOfGoods(orderForm.getNumberOfGoods());
        order.setExternalCommunicationWithSupplier(supplier);
        order.setExternalCommunicationWithManagers(manager);
        order.setPrice(orderForm.getPrice());
        order.setDescription(orderForm.getDescription());
        service.save(order);
        model.addAttribute("orders", service.getAll());
        return "redirect:/web/Order/get/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model,
                @PathVariable("id") String id){
        Map<String, String> mavs1 = directoryOfGoodsNomenclatureService.getAll().stream()
                .collect(Collectors.toMap(DirectoryOfGoodsNomenclature::getId, DirectoryOfGoodsNomenclature::getTheNameOfTheProduct));
        Map<String, String> mavs2 = supplierService.getAll().stream()
                .collect(Collectors.toMap(Supplier::getId, Supplier::getInitials));
        Map<String, String> mavs3 = managerService.getAll().stream()
                .collect(Collectors.toMap(Manager::getId, Manager::getInitials));
        Order order = service.get(id);
        OrderForm orderForm = new OrderForm();
        orderForm.setExternalCommunicationWithNomenclature(order.getExternalCommunicationWithNomenclature().getTheNameOfTheProduct());
        orderForm.setNumberOfGoods(order.getNumberOfGoods());
        orderForm.setExternalCommunicationWithSupplier(order.getExternalCommunicationWithSupplier().getInitials());
        orderForm.setExternalCommunicationWithManagers(order.getExternalCommunicationWithManagers().getInitials());
        orderForm.setPrice(order.getPrice());
        orderForm.setDescription(order.getDescription());
        model.addAttribute("mavs1", mavs1);
        model.addAttribute("mavs2", mavs2);
        model.addAttribute("mavs3", mavs3);
        model.addAttribute("orderForm", orderForm); 
        return "orderAdd";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("orderForm") OrderForm orderForm){
        Order order = new Order();
        DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature = directoryOfGoodsNomenclatureService.get(orderForm.getExternalCommunicationWithNomenclature());
        Supplier supplier = supplierService.get(orderForm.getExternalCommunicationWithSupplier());
        Manager manager = managerService.get(orderForm.getExternalCommunicationWithManagers());
        order.setId(id);
        order.setExternalCommunicationWithNomenclature(directoryOfGoodsNomenclature);
        order.setNumberOfGoods(orderForm.getNumberOfGoods());
        order.setExternalCommunicationWithSupplier(supplier);
        order.setExternalCommunicationWithManagers(manager);
        order.setPrice(orderForm.getPrice());
        order.setDescription(orderForm.getDescription());
        service.save(order);
        model.addAttribute("orders", service.getAll());
        return "redirect:/web/Order/get/list";
    }
}