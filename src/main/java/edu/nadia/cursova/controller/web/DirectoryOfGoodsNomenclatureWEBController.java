package edu.nadia.cursova.controller.web;


import edu.nadia.cursova.model.DirectoryOfGoodsNomenclature;
import edu.nadia.cursova.service.directoryOfGoodsNomenclature.impls.DirectoryOfGoodsNomenclatureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/web/organization")
public class DirectoryOfGoodsNomenclatureWEBController {
    @Autowired
    DirectoryOfGoodsNomenclatureServiceImpl service;

    @RequestMapping("/DirectoryOfGoodsNomenclatureController")
    String getAll(Model model)
    {
        model.addAttribute("directoryOfGoodsNomenclature", service.getAll());
        return "directoryOfGoodsNomenclatureList";
    }

    @RequestMapping("/DirectoryOfGoodsNomenclatureController/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("directoryOfGoodsNomenclature", service.getAll());
        return "directoryOfGoodsNomenclatureList";
    }
}