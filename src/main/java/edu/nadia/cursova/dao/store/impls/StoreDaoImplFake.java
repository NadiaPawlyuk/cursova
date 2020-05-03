package edu.nadia.cursova.dao.store.impls;

import edu.nadia.cursova.dao.store.interfaces.IStoreDao;
import edu.nadia.cursova.dataSet.DataSet;
import edu.nadia.cursova.model.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class StoreDaoImplFake implements IStoreDao {
    @Autowired
    DataSet dataSet;

    @Override
    public Store save(Store store) {
        return null;
    }

    @Override
    public Store get(String id) {
        return null;
    }

    @Override
    public List<Store> getAll() {
        return dataSet.getStore();
    }

    @Override
    public Store edit(Store store) {
        return null;
    }

    @Override
    public Store delete(String id) {
        return null;
    }
}
