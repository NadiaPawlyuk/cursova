package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.model.Seller;
import edu.nadia.cursova.service.seller.impls.SellerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.plugin.javascript.navig.Array;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/web/organization")
public class SellerWEBController {
    @Autowired
    SellerServiceImpl service;

    @RequestMapping("/Seller")
    String getAll(Model model)
    {
        model.addAttribute("sellers", service.getAll());
        return "sellerList";
    }

    @RequestMapping("/Seller/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("sellers", service.getAll());
        return "sellerList";
    }
}
