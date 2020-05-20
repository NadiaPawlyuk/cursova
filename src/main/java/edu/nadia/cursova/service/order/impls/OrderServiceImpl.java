package edu.nadia.cursova.service.order.impls;

import edu.nadia.cursova.dao.repository.OrderRepository;
import edu.nadia.cursova.model.Order;
import edu.nadia.cursova.service.order.interfaces.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    OrderRepository repository;

    @PostConstruct
    void init(){
       //repository.saveAll(list);
    }

    @Override
    public Order save(Order order) {
        order.setDateOfCreation(LocalDateTime.now());
        order.setDateOfModified(LocalDateTime.now());
        return repository.save(order);
    }

    @Override
    public Order get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Order> getAll() {
        return repository.findAll();
    }

    @Override
    public Order edit(Order order) {
        order.setDateOfModified(LocalDateTime.now());
        return repository.save(order);
    }

    @Override
    public Order delete(String id) {
        Order order = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return order;
    }
}
