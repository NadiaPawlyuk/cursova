package edu.nadia.cursova.service.supplier.impls;

import edu.nadia.cursova.dao.repository.SupplierRepository;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.model.Supplier;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import edu.nadia.cursova.service.supplier.interfaces.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SupplierServiceImpl implements ISupplierService {
    @Autowired
    SupplierRepository repository;

    @PostConstruct
    void init(){
       //repository.saveAll(list);
    }

    @Override
    public Supplier save(Supplier supplier) {
        supplier.setDateOfCreation(LocalDateTime.now());
        supplier.setDateOfModified(LocalDateTime.now());
        return repository.save(supplier);
    }

    @Override
    public Supplier get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Supplier> getAll() {
        return repository.findAll();
    }

    @Override
    public Supplier edit(Supplier supplier) {
        supplier.setDateOfModified(LocalDateTime.now());
        return repository.save(supplier);
    }

    @Override
    public Supplier delete(String id) {
        Supplier supplier = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return supplier;
    }


    public List<Supplier> search(String word){
        List<Supplier> found = this.getAll().stream()
                .filter(supplier -> supplier.getInitials().contains(word))
                .collect(Collectors.toList());
        return found;
    }

    public List<Supplier> sortByName(List<Supplier> people){

        Collections.sort(people, new SupplierServiceImpl.SupplierNameComparator());

        return people;
    }

    private class SupplierNameComparator implements Comparator<Supplier> {
        public int compare(Supplier p1, Supplier p2) {
            return p1.getInitials().compareTo(p2.getInitials());
        }
    }

}
