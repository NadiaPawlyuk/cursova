package edu.nadia.cursova.controller.web;


import edu.nadia.cursova.form.AccountingForBuyersForm;
import edu.nadia.cursova.form.DepartmentStoreForm;
import edu.nadia.cursova.form.DirectoryOfGoodsNomenclatureForm;
import edu.nadia.cursova.form.SearchForm;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.DepartmentStore;
import edu.nadia.cursova.model.DirectoryOfGoodsNomenclature;
import edu.nadia.cursova.service.directoryOfGoodsNomenclature.impls.DirectoryOfGoodsNomenclatureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/web/DirectoryOfGoodsNomenclature")
public class DirectoryOfGoodsNomenclatureWEBController {
    @Autowired
    DirectoryOfGoodsNomenclatureServiceImpl service;

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String getAll(Model model)
    {
        List<DirectoryOfGoodsNomenclature> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("directoryOfGoodsNomenclature", service.getAll());
        return "directoryOfGoodsNomenclatureList";
    }

    @RequestMapping(value = "/get/list", method = RequestMethod.POST)
    String search(Model model,
                  @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getString();
        List<DirectoryOfGoodsNomenclature> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("directoryOfGoodsNomenclature", list);
        return "directoryOfGoodsNomenclatureList";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<DirectoryOfGoodsNomenclature> directoryOfGoodsNomenclatures = service.getAll();
        List<DirectoryOfGoodsNomenclature> sorted = service.sortByName(directoryOfGoodsNomenclatures);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("directoryOfGoodsNomenclature", sorted);
        return "directoryOfGoodsNomenclatureList";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<DirectoryOfGoodsNomenclature> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("directoryOfGoodsNomenclature", list);
        return "directoryOfGoodsNomenclatureList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("directoryOfGoodsNomenclature", service.getAll());
        return "directoryOfGoodsNomenclatureList";
    }

    @RequestMapping(value = "/create",  method = RequestMethod.GET)
    String create(Model model)
    {
        DirectoryOfGoodsNomenclatureForm directoryOfGoodsNomenclatureForm = new DirectoryOfGoodsNomenclatureForm();
        model.addAttribute("directoryOfGoodsNomenclatureForm", directoryOfGoodsNomenclatureForm);
        return "directoryOfGoodsNomenclatureAdd";
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("directoryOfGoodsNomenclatureForm") DirectoryOfGoodsNomenclatureForm directoryOfGoodsNomenclatureForm){
        DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature = new DirectoryOfGoodsNomenclature();
        directoryOfGoodsNomenclature.setTheNameOfTheProduct(directoryOfGoodsNomenclatureForm.getTheNameOfTheProduct());
        directoryOfGoodsNomenclature.setDescription(directoryOfGoodsNomenclatureForm.getDescription());
        service.save(directoryOfGoodsNomenclature);
        model.addAttribute("directoryOfGoodsNomenclature", service.getAll());
        return "redirect:/web/DirectoryOfGoodsNomenclature/get/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model,
                @PathVariable("id") String id){
        DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature = service.get(id);
        DirectoryOfGoodsNomenclatureForm directoryOfGoodsNomenclatureForm = new DirectoryOfGoodsNomenclatureForm();
        directoryOfGoodsNomenclatureForm.setTheNameOfTheProduct(directoryOfGoodsNomenclature.getTheNameOfTheProduct());
        directoryOfGoodsNomenclatureForm.setDescription(directoryOfGoodsNomenclature.getDescription());
        model.addAttribute("directoryOfGoodsNomenclatureForm", directoryOfGoodsNomenclatureForm);
        return "directoryOfGoodsNomenclatureAdd";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("directoryOfGoodsNomenclatureForm") DirectoryOfGoodsNomenclatureForm directoryOfGoodsNomenclatureForm){
        DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature = new DirectoryOfGoodsNomenclature();
        directoryOfGoodsNomenclature.setId(id);
        directoryOfGoodsNomenclature.setTheNameOfTheProduct(directoryOfGoodsNomenclatureForm.getTheNameOfTheProduct());
        directoryOfGoodsNomenclature.setDescription(directoryOfGoodsNomenclatureForm.getDescription());
        service.save(directoryOfGoodsNomenclature);
        model.addAttribute("directoryOfGoodsNomenclature", service.getAll());
        return "redirect:/web/DirectoryOfGoodsNomenclature/get/list";
    }
}