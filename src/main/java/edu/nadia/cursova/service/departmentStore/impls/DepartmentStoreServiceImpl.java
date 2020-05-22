package edu.nadia.cursova.service.departmentStore.impls;

import edu.nadia.cursova.dao.repository.DepartmentStoreRepository;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.AccountingForGoodsSold;
import edu.nadia.cursova.model.DepartmentStore;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import edu.nadia.cursova.service.departmentStore.interfaces.IDepartmentStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<DepartmentStore> search(String word){
        List<DepartmentStore> found = this.getAll().stream()
                .filter(departmentStore -> departmentStore.getNameOfTheStore().contains(word))
                .collect(Collectors.toList());
        return found;
    }

    public List<DepartmentStore> sortByName(List<DepartmentStore> people){

        Collections.sort(people, new DepartmentStoreServiceImpl.DepartmentStoreNameComparator());

        return people;
    }

    private class DepartmentStoreNameComparator implements Comparator<DepartmentStore> {
        public int compare(DepartmentStore p1, DepartmentStore p2) {
            return p1.getNameOfTheStore().compareTo(p2.getNameOfTheStore());
        }
    }

}
