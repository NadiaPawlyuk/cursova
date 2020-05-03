package edu.nadia.cursova.service.supplier.impls;

import edu.nadia.cursova.dao.repository.SupplierRepository;
import edu.nadia.cursova.dao.supplier.impls.SupplierDaoImplFake;
import edu.nadia.cursova.model.Supplier;
import edu.nadia.cursova.service.supplier.interfaces.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service
public class SupplierServiceImpl implements ISupplierService {
    @Autowired
    SupplierDaoImplFake dao;

    @Autowired
    SupplierRepository repository;

    @PostConstruct
    void init(){
        List<Supplier> list = dao.getAll();

        repository.saveAll(list);
    }

    @Override
    public Supplier save(Supplier supplier) {
        return null;
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
        return null;
    }

    @Override
    public Supplier delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
