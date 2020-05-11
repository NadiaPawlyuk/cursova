package edu.nadia.cursova.service.organizationOfTrade.impls;

import edu.nadia.cursova.dao.repository.OrganizationOfTradeRepository;
import edu.nadia.cursova.model.OrganizationOfTrade;
import edu.nadia.cursova.service.organizationOfTrade.interfaces.IOrganizationOfTradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class OrganizationOfTradeServiceImpl implements IOrganizationOfTradeService {
    @Autowired
    OrganizationOfTradeRepository repository;

    @PostConstruct
    void init(){
        //repository.saveAll(list);
    }

    @Override
    public OrganizationOfTrade save(OrganizationOfTrade organizationOfTrade) {
        organizationOfTrade.setDateOfCreation(LocalDateTime.now());
        organizationOfTrade.setDateOfModified(LocalDateTime.now());
        return repository.save(organizationOfTrade);
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
        organizationOfTrade.setDateOfModified(LocalDateTime.now());
        return repository.save(organizationOfTrade);
    }

    @Override
    public OrganizationOfTrade delete(String id) {
        OrganizationOfTrade organizationOfTrade = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return organizationOfTrade;
    }
}
