package edu.nadia.cursova.service.organizationOfTrade.interfaces;

import edu.nadia.cursova.model.OrganizationOfTrade;

import java.util.List;

public interface IOrganizationOfTradeService {
    OrganizationOfTrade save(OrganizationOfTrade organizationOfTrade);
    OrganizationOfTrade get(String id);
    List<OrganizationOfTrade> getAll();
    OrganizationOfTrade edit(OrganizationOfTrade organizationOfTrade);
    OrganizationOfTrade delete(String id);
}
