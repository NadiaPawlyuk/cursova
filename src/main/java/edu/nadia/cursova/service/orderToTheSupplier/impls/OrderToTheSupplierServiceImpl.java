package edu.nadia.cursova.service.orderToTheSupplier.impls;

import edu.nadia.cursova.dao.repository.OrderToTheSupplierRepository;
import edu.nadia.cursova.model.OrderToTheSupplier;
import edu.nadia.cursova.service.orderToTheSupplier.interfaces.IOrderToTheSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service
public class OrderToTheSupplierServiceImpl implements IOrderToTheSupplierService {
    @Autowired
    OrderToTheSupplierRepository repository;

    @PostConstruct
    void init(){
        //repository.saveAll(list);
    }

    @Override
    public OrderToTheSupplier save(OrderToTheSupplier orderToTheSupplier) {
        return null;
    }

    @Override
    public OrderToTheSupplier get(String id) {
        return null;
    }

    @Override
    public List<OrderToTheSupplier> getAll() {
        return repository.findAll();
    }

    @Override
    public OrderToTheSupplier edit(OrderToTheSupplier orderToTheSupplier) {
        return null;
    }

    @Override
    public OrderToTheSupplier delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
