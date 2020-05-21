package edu.nadia.cursova.controller.web;

import edu.nadia.cursova.form.*;
import edu.nadia.cursova.model.*;
import edu.nadia.cursova.service.directoryOfGoodsNomenclature.impls.DirectoryOfGoodsNomenclatureServiceImpl;
import edu.nadia.cursova.service.distribution.impls.DistributionServiceImpl;
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
@RequestMapping("/web/Distribution")
public class DistributionWEBController {
    @Autowired
    DistributionServiceImpl service;

    @Autowired
    DirectoryOfGoodsNomenclatureServiceImpl directoryOfGoodsNomenclatureService;

    @Autowired
    OutletServiceImpl outletService;

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String getAll(Model model)
    {
        List<Distribution> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("distributions", service.getAll());
        return "distributionList";
    }

    @RequestMapping(value = "/get/list", method = RequestMethod.POST)
    String search(Model model,
                  @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getString();
        List<Distribution> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("distributions", list);
        return "distributionList";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<Distribution> distributions = service.getAll();
        List<Distribution> sorted = service.sortByName(distributions);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("distributions", sorted);
        return "distributionList";
    }

    @RequestMapping(value = "/sort", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Distribution> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("distributions", list);
        return "distributionList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("distributions", service.getAll());
        return "distributionList";
    }

    @RequestMapping(value = "/create",  method = RequestMethod.GET)
    String create(Model model)
    {
        DistributionForm distributionForm = new DistributionForm();
        Map<String, String> mavs1 = directoryOfGoodsNomenclatureService.getAll().stream()
                .collect(Collectors.toMap(DirectoryOfGoodsNomenclature::getId, DirectoryOfGoodsNomenclature::getTheNameOfTheProduct));
        Map<String, String> mavs2 = outletService.getAll().stream()
                .collect(Collectors.toMap(Outlet::getId, Outlet::getName));
        model.addAttribute("mavs1", mavs1);
        model.addAttribute("mavs2", mavs2);
        model.addAttribute("distributionForm", distributionForm);
        return "distributionAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("distributionForm") DistributionForm distributionForm){
        Distribution distribution = new Distribution();
        DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature = directoryOfGoodsNomenclatureService.get(distributionForm.getExternalCommunicationWithTheNomenclature());
        Outlet outlet = outletService.get(distributionForm.getExternalCommunicationWithTheOutlet());
        distribution.setExternalCommunicationWithTheNomenclature(directoryOfGoodsNomenclature);
        distribution.setNumberOfGoods(distributionForm.getNumberOfGoods());
        distribution.setPrice(distributionForm.getPrice());
        distribution.setExternalCommunicationWithTheOutlet(outlet);
        distribution.setDescription(distributionForm.getDescription());
        service.save(distribution);
        model.addAttribute("distributions", service.getAll());
        return "redirect:/web/Distribution/get/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model,
                @PathVariable("id") String id) {
        Map<String, String> mavs1 = directoryOfGoodsNomenclatureService.getAll().stream()
                .collect(Collectors.toMap(DirectoryOfGoodsNomenclature::getId, DirectoryOfGoodsNomenclature::getTheNameOfTheProduct));
        Map<String, String> mavs2 = outletService.getAll().stream()
                .collect(Collectors.toMap(Outlet::getId, Outlet::getName));
        Distribution distribution = service.get(id);
        DistributionForm distributionForm = new DistributionForm();
        distributionForm.setExternalCommunicationWithTheNomenclature(distribution.getExternalCommunicationWithTheNomenclature().getTheNameOfTheProduct());
        distributionForm.setNumberOfGoods(distribution.getNumberOfGoods());
        distributionForm.setPrice(distribution.getPrice());
        distributionForm.setExternalCommunicationWithTheOutlet(distribution.getExternalCommunicationWithTheOutlet().getName());
        distributionForm.setDescription(distribution.getDescription());
        model.addAttribute("mavs1", mavs1);
        model.addAttribute("mavs2", mavs2);
        model.addAttribute("distributionForm", distributionForm);
        return "distributionAdd";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("distributionForm") DistributionForm distributionForm){
        Distribution distribution = new Distribution();
        DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature = directoryOfGoodsNomenclatureService.get(distributionForm.getExternalCommunicationWithTheNomenclature());
        Outlet outlet = outletService.get(distributionForm.getExternalCommunicationWithTheOutlet());
        distribution.setId(id);
        distribution.setExternalCommunicationWithTheNomenclature(directoryOfGoodsNomenclature);
        distribution.setNumberOfGoods(distributionForm.getNumberOfGoods());
        distribution.setPrice(distributionForm.getPrice());
        distribution.setExternalCommunicationWithTheOutlet(outlet);
        distribution.setDescription(distributionForm.getDescription());
        service.save(distribution);
        model.addAttribute("distributions", service.getAll());
        return "redirect:/web/Distribution/get/list";
    }
}
