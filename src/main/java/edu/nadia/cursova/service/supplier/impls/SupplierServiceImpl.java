package edu.nadia.cursova.service.supplier.impls;

import edu.nadia.cursova.dao.repository.SupplierRepository;
import edu.nadia.cursova.model.Supplier;
import edu.nadia.cursova.service.supplier.interfaces.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;
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
        return null;
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
}
