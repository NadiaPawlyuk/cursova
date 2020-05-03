package edu.nadia.cursova.service.store.interfaces;

import edu.nadia.cursova.model.Store;

import java.util.List;

public interface IStoreService {
    Store save(Store store);
    Store get(String id);
    List<Store> getAll();
    Store edit(Store store);
    Store delete(String id);
}
