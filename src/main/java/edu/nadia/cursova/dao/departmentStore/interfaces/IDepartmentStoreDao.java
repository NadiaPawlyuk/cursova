package edu.nadia.cursova.dao.departmentStore.interfaces;

import edu.nadia.cursova.model.DepartmentStore;

import java.util.List;

public interface IDepartmentStoreDao {
    DepartmentStore save(DepartmentStore departmentStore);
    DepartmentStore get(String id);
    List<DepartmentStore> getAll();
    DepartmentStore edit(DepartmentStore departmentStore);
    DepartmentStore delete(String id);
}
