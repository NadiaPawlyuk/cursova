package edu.nadia.cursova.service.store.impls;

import edu.nadia.cursova.dao.repository.StoreRepository;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.model.Seller;
import edu.nadia.cursova.model.Store;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import edu.nadia.cursova.service.store.interfaces.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StoreServiceImpl implements IStoreService {
   @Autowired
    StoreRepository repository;

    @PostConstruct
    void init(){
        //repository.saveAll(list);
    }

    @Override
    public Store save(Store store) {
        store.setDateOfCreation(LocalDateTime.now());
        store.setDateOfModified(LocalDateTime.now());
        return repository.save(store);
    }

    @Override
    public Store get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Store> getAll() {
        return repository.findAll();
    }

    @Override
    public Store edit(Store store) {
        store.setDateOfModified(LocalDateTime.now());
        return repository.save(store);
    }

    @Override
    public Store delete(String id) {
        Store store = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return store;
    }


    public List<Store> search(String word){
        List<Store> found = this.getAll().stream()
                .filter(store -> store.getAddress().contains(word))
                .collect(Collectors.toList());
        return found;
    }

    public List<Store> sortByName(List<Store> people){

        Collections.sort(people, new StoreServiceImpl.StoreNameComparator());

        return people;
    }

    private class StoreNameComparator implements Comparator<Store> {
        public int compare(Store p1, Store p2) {
            return p1.getAddress().compareTo(p2.getAddress());
        }
    }

}
