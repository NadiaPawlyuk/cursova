package edu.nadia.cursova.dao.organizationOfTrade.interfaces;

import edu.nadia.cursova.model.OrganizationOfTrade;

import java.util.List;

public interface IOrganizationOfTradeDao {
    OrganizationOfTrade save(OrganizationOfTrade organizationOfTrade);
    OrganizationOfTrade get(String id);
    List<OrganizationOfTrade> getAll();
    OrganizationOfTrade edit(OrganizationOfTrade organizationOfTrade);
    OrganizationOfTrade delete(String id);
}
