package edu.nadia.cursova.dao.store.interfaces;

import edu.nadia.cursova.model.Store;

import java.util.List;

public interface IStoreDao {
    Store save(Store store);
    Store get(String id);
    List<Store> getAll();
    Store edit(Store store);
    Store delete(String id);
}
