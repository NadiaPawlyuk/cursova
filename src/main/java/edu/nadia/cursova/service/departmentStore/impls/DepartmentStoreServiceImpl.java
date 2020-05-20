package edu.nadia.cursova.service.departmentStore.impls;

import edu.nadia.cursova.dao.repository.DepartmentStoreRepository;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.DepartmentStore;
import edu.nadia.cursova.service.departmentStore.interfaces.IDepartmentStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class DepartmentStoreServiceImpl implements IDepartmentStoreService {
   @Autowired
    DepartmentStoreRepository repository;

    @PostConstruct
    void init(){
       //repository.saveAll(list);
    }

    @Override
    public DepartmentStore save(DepartmentStore departmentStore) {
        departmentStore.setDateOfCreation(LocalDateTime.now());
        departmentStore.setDateOfModified(LocalDateTime.now());
        return repository.save(departmentStore);
    }


    @Override
    public DepartmentStore get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<DepartmentStore> getAll() {
        return repository.findAll();
    }

    @Override
    public DepartmentStore edit(DepartmentStore departmentStore) {
        departmentStore.setDateOfModified(LocalDateTime.now());
        return repository.save(departmentStore);
    }

    @Override
    public DepartmentStore delete(String id) {
        DepartmentStore departmentStore =  repository.findById(id).orElse(null);
        repository.deleteById(id);
        return departmentStore;
    }
}
