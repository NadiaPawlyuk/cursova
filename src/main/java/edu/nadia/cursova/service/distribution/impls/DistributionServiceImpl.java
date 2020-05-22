package edu.nadia.cursova.service.distribution.impls;

import edu.nadia.cursova.dao.repository.DistributionRepository;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.DirectoryOfGoodsNomenclature;
import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import edu.nadia.cursova.service.distribution.interfaces.IDistributionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DistributionServiceImpl implements IDistributionService {
    @Autowired
    DistributionRepository repository;

    @PostConstruct
    void init(){
        //repository.saveAll(list);
    }

    @Override
    public Distribution save(Distribution distribution) {
        distribution.setDateOfCreation(LocalDateTime.now());
        distribution.setDateOfModified(LocalDateTime.now());
        return repository.save(distribution);
    }

    @Override
    public Distribution get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Distribution> getAll() {
        return repository.findAll();
    }

    @Override
    public Distribution edit(Distribution distribution) {
        distribution.setDateOfModified(LocalDateTime.now());
        return repository.save(distribution);
    }

    @Override
    public Distribution delete(String id) {
        Distribution distribution = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return distribution;
    }


    public List<Distribution> search(String word){
        List<Distribution> found = this.getAll().stream()
                .filter(distribution -> distribution.getPrice().contains(word))
                .collect(Collectors.toList());
        return found;
    }

    public List<Distribution> sortByName(List<Distribution> people){

        Collections.sort(people, new DistributionServiceImpl.DistributionNameComparator());

        return people;
    }

    private class DistributionNameComparator implements Comparator<Distribution> {
        public int compare(Distribution p1, Distribution p2) {
            return p1.getDescription().compareTo(p2.getDescription());
        }
    }
}
