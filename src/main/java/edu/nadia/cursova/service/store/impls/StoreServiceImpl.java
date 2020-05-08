package edu.nadia.cursova.service.store.impls;

import edu.nadia.cursova.dao.repository.StoreRepository;
import edu.nadia.cursova.dao.store.impls.StoreDaoImplFake;
import edu.nadia.cursova.model.Store;
import edu.nadia.cursova.service.store.interfaces.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service
public class StoreServiceImpl implements IStoreService {
    @Autowired
    StoreDaoImplFake dao;

    //@Autowired
    //StoreRepository repository;

    @PostConstruct
    void init(){
        List<Store> list = dao.getAll();

        //repository.saveAll(list);
    }

    @Override
    public Store save(Store store) {
        return null;
    }

    @Override
    public Store get(String id) {
        return dao.getAll().stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<Store> getAll() {
        return dao.getAll();
        //return repository.findAll();
    }

    @Override
    public Store edit(Store store) {
        return null;
    }

    @Override
    public Store delete(String id) {
        Store store = this.get(id);
        dao.getAll().remove(store);
        return store;
        //repository.deleteById(id);
        //return repository.findById(id).orElse(null);
    }
}
