package edu.nadia.cursova.service.orderToTheSupplier.interfaces;

import edu.nadia.cursova.model.OrderToTheSupplier;

import java.util.List;

public interface IOrderToTheSupplierService {
    OrderToTheSupplier save(OrderToTheSupplier orderToTheSupplier);
    OrderToTheSupplier get(String id);
    List<OrderToTheSupplier> getAll();
    OrderToTheSupplier edit(OrderToTheSupplier orderToTheSupplier);
    OrderToTheSupplier delete(String id);
}
