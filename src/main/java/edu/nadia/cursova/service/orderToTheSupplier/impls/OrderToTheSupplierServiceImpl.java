package edu.nadia.cursova.service.orderToTheSupplier.impls;

import edu.nadia.cursova.dao.orderToTheSupplier.impls.OrderToTheSupplierDaoImplFake;
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
    OrderToTheSupplierDaoImplFake dao;

    //@Autowired
    //OrderToTheSupplierRepository repository;

    @PostConstruct
    void init(){
        List<OrderToTheSupplier> list = dao.getAll();

        //repository.saveAll(list);
    }

    @Override
    public OrderToTheSupplier save(OrderToTheSupplier orderToTheSupplier) {
        return null;
    }

    @Override
    public OrderToTheSupplier get(String id) {
        return dao.getAll().stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<OrderToTheSupplier> getAll() {
        return dao.getAll();
        //return repository.findAll();
    }

    @Override
    public OrderToTheSupplier edit(OrderToTheSupplier orderToTheSupplier) {
        return null;
    }

    @Override
    public OrderToTheSupplier delete(String id) {
        OrderToTheSupplier orderToTheSupplier = this.get(id);
        dao.getAll().remove(orderToTheSupplier);
        return orderToTheSupplier;
        //repository.deleteById(id);
        //return repository.findById(id).orElse(null);
    }
}
