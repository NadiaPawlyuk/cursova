package edu.nadia.cursova.service.order.interfaces;

import edu.nadia.cursova.model.Order;

import java.util.List;

public interface IOrderService {
    Order save(Order order);
    Order get(String id);
    List<Order> getAll();
    Order edit(Order order);
    Order delete(String id);
}
