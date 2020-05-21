package edu.nadia.cursova.service.organizationOfTrade.impls;

import edu.nadia.cursova.dao.repository.OrganizationOfTradeRepository;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.model.OrganizationOfTrade;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import edu.nadia.cursova.service.organizationOfTrade.interfaces.IOrganizationOfTradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        return repository.findById(id).orElse(null);
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


    public List<OrganizationOfTrade> search(String word){
        List<OrganizationOfTrade> found = this.getAll().stream()
                .filter(organizationOfTrade -> organizationOfTrade.getNameOfOrganization().contains(word))
                .collect(Collectors.toList());
        return found;
    }

    public List<OrganizationOfTrade> sortByName(List<OrganizationOfTrade> people){

        Collections.sort(people, new OrganizationOfTradeServiceImpl.OrganizationOfTradeNameComparator());

        return people;
    }

    private class OrganizationOfTradeNameComparator implements Comparator<OrganizationOfTrade> {
        public int compare(OrganizationOfTrade p1, OrganizationOfTrade p2) {
            return p1.getNameOfOrganization().compareTo(p2.getNameOfOrganization());
        }
    }

}
