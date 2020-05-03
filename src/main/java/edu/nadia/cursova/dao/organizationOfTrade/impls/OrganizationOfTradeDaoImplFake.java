package edu.nadia.cursova.dao.organizationOfTrade.impls;

import edu.nadia.cursova.dao.organizationOfTrade.interfaces.IOrganizationOfTradeDao;
import edu.nadia.cursova.dataSet.DataSet;
import edu.nadia.cursova.model.OrganizationOfTrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class OrganizationOfTradeDaoImplFake implements IOrganizationOfTradeDao {
    @Autowired
    DataSet dataSet;

    @Override
    public OrganizationOfTrade save(OrganizationOfTrade organizationOfTrade) {
        return null;
    }

    @Override
    public OrganizationOfTrade get(String id) {
        return null;
    }

    @Override
    public List<OrganizationOfTrade> getAll() {
        return dataSet.getOrganizationOfTrade();
    }

    @Override
    public OrganizationOfTrade edit(OrganizationOfTrade organizationOfTrade) {
        return null;
    }

    @Override
    public OrganizationOfTrade delete(String id) {
        return null;
    }
}
