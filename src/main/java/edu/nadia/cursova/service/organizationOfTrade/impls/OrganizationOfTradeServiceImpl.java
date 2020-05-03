package edu.nadia.cursova.service.organizationOfTrade.impls;

import edu.nadia.cursova.dao.organizationOfTrade.impls.OrganizationOfTradeDaoImplFake;
import edu.nadia.cursova.dao.repository.OrganizationOfTradeRepository;
import edu.nadia.cursova.model.OrganizationOfTrade;
import edu.nadia.cursova.service.organizationOfTrade.interfaces.IOrganizationOfTradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service
public class OrganizationOfTradeServiceImpl implements IOrganizationOfTradeService {
    @Autowired
    OrganizationOfTradeDaoImplFake dao;

    @Autowired
    OrganizationOfTradeRepository repository;

    @PostConstruct
    void init(){
        List<OrganizationOfTrade> list = dao.getAll();

        repository.saveAll(list);
    }

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
        return repository.findAll();
    }

    @Override
    public OrganizationOfTrade edit(OrganizationOfTrade organizationOfTrade) {
        return null;
    }

    @Override
    public OrganizationOfTrade delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
