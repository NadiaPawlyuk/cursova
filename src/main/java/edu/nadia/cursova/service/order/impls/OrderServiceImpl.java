package edu.nadia.cursova.service.order.impls;

import edu.nadia.cursova.dao.order.impls.OrderDaoImplFake;
import edu.nadia.cursova.dao.repository.OrderRepository;
import edu.nadia.cursova.model.Order;
import edu.nadia.cursova.service.order.interfaces.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    OrderDaoImplFake dao;

    //@Autowired
    //OrderRepository repository;

    @PostConstruct
    void init(){
        List<Order> list = dao.getAll();

        //repository.saveAll(list);
    }

    @Override
    public Order save(Order order) {
        return null;
    }

    @Override
    public Order get(String id) {
        return dao.getAll().stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<Order> getAll() {
        return dao.getAll();
        //return repository.findAll();
    }

    @Override
    public Order edit(Order order) {
        return null;
    }

    @Override
    public Order delete(String id) {
        Order order = this.get(id);
        dao.getAll().remove(order);
        return order;
        //repository.deleteById(id);
        //return repository.findById(id).orElse(null);
    }
}
