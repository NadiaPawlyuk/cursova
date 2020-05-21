package edu.nadia.cursova.service.outlet.impls;

import edu.nadia.cursova.dao.repository.OutletRepository;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.model.Outlet;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import edu.nadia.cursova.service.outlet.interfaces.IOutletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OutletServiceImpl implements IOutletService {
    @Autowired
    OutletRepository repository;

    @PostConstruct
    void init(){
       //repository.saveAll(list);
    }

    @Override
    public Outlet save(Outlet outlet) {
        outlet.setDateOfCreation(LocalDateTime.now());
        outlet.setDateOfModified(LocalDateTime.now());
        return repository.save(outlet);
    }

    @Override
    public Outlet get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Outlet> getAll() {
        return repository.findAll();
    }

    @Override
    public Outlet edit(Outlet outlet) {
        outlet.setDateOfModified(LocalDateTime.now());
        return repository.save(outlet);
    }

    @Override
    public Outlet delete(String id) {
        Outlet outlet = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return outlet;
    }


    public List<Outlet> search(String word){
        List<Outlet> found = this.getAll().stream()
                .filter(outlet -> outlet.getName().contains(word))
                .collect(Collectors.toList());
        return found;
    }

    public List<Outlet> sortByName(List<Outlet> people){

        Collections.sort(people, new OutletServiceImpl.OutletNameComparator());

        return people;
    }

    private class OutletNameComparator implements Comparator<Outlet> {
        public int compare(Outlet p1, Outlet p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }

}
