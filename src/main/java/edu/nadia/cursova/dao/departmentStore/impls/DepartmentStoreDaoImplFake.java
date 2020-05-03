package edu.nadia.cursova.dao.departmentStore.impls;

import edu.nadia.cursova.dao.departmentStore.interfaces.IDepartmentStoreDao;
import edu.nadia.cursova.dataSet.DataSet;
import edu.nadia.cursova.model.DepartmentStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class DepartmentStoreDaoImplFake implements IDepartmentStoreDao {
    @Autowired
    DataSet dataSet;

    @Override
    public DepartmentStore save(DepartmentStore departmentStore) {
        return null;
    }

    @Override
    public DepartmentStore get(String id) {
        return null;
    }

    @Override
    public List<DepartmentStore> getAll() {
        return dataSet.getDepartmentStore();
    }

    @Override
    public DepartmentStore edit(DepartmentStore departmentStore) {
        return null;
    }

    @Override
    public DepartmentStore delete(String id) {
        return null;
    }
}
