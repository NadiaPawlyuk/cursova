package edu.nadia.cursova.controller.api;


import edu.nadia.cursova.model.DirectoryOfGoodsNomenclature;
import edu.nadia.cursova.service.directoryOfGoodsNomenclature.impls.DirectoryOfGoodsNomenclatureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/organization/")
public class DirectoryOfGoodsNomenclatureAPIController {
    @Autowired
    DirectoryOfGoodsNomenclatureServiceImpl service;

    @RequestMapping("/DirectoryOfGoodsNomenclatureController")
    List<DirectoryOfGoodsNomenclature> getAll()
    {
        return service.getAll();
    }
}