package edu.nadia.cursova.controller.api;


import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.DirectoryOfGoodsNomenclature;
import edu.nadia.cursova.service.directoryOfGoodsNomenclature.impls.DirectoryOfGoodsNomenclatureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/DirectoryOfGoodsNomenclature")
public class DirectoryOfGoodsNomenclatureAPIController {
    @Autowired
    DirectoryOfGoodsNomenclatureServiceImpl service;

    @RequestMapping("/get/list")
    List<DirectoryOfGoodsNomenclature> getAll()
    {
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    DirectoryOfGoodsNomenclature getById(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    DirectoryOfGoodsNomenclature create(@RequestBody DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature){
        return service.save(directoryOfGoodsNomenclature);
    }

    @RequestMapping("/delete/{id}")
    DirectoryOfGoodsNomenclature delete( @PathVariable("id") String id) {
        return service.delete(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PATCH)
    DirectoryOfGoodsNomenclature edit(@RequestBody DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature){
        return service.edit(directoryOfGoodsNomenclature);
    }

}