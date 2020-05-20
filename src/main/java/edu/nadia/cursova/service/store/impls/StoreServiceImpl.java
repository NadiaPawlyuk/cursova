package edu.nadia.cursova.service.store.impls;

import edu.nadia.cursova.dao.repository.StoreRepository;
import edu.nadia.cursova.model.Seller;
import edu.nadia.cursova.model.Store;
import edu.nadia.cursova.service.store.interfaces.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;
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
}
