package edu.nadia.cursova.controller.api;

import edu.nadia.cursova.model.OrganizationOfTrade;
import edu.nadia.cursova.service.organizationOfTrade.impls.OrganizationOfTradeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/organization/")
public class OrganizationOfTradeAPIController {
   @Autowired
    OrganizationOfTradeServiceImpl service;

    @RequestMapping("/OrganizationOfTrade")
    List<OrganizationOfTrade> getAll(){
        return service.getAll();
    }
}
