package edu.nadia.cursova.service.departmentStore.impls;

import edu.nadia.cursova.dao.departmentStore.impls.DepartmentStoreDaoImplFake;
import edu.nadia.cursova.dao.repository.DepartmentStoreRepository;
import edu.nadia.cursova.model.DepartmentStore;
import edu.nadia.cursova.service.departmentStore.interfaces.IDepartmentStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service
public class DepartmentStoreServiceImpl implements IDepartmentStoreService {
    @Autowired
    DepartmentStoreDaoImplFake dao;

    @Autowired
    DepartmentStoreRepository repository;

    @PostConstruct
    void init(){
        List<DepartmentStore> list = dao.getAll();

        repository.saveAll(list);
    }

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
        return repository.findAll();
    }

    @Override
    public DepartmentStore edit(DepartmentStore departmentStore) {
        return null;
    }

    @Override
    public DepartmentStore delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
