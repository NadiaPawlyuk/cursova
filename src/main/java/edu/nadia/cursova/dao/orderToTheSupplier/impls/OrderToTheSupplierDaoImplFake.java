package edu.nadia.cursova.dao.orderToTheSupplier.impls;

import edu.nadia.cursova.dao.orderToTheSupplier.interfaces.IOrderToTheSupplierDao;
import edu.nadia.cursova.dataSet.DataSet;
import edu.nadia.cursova.model.OrderToTheSupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class OrderToTheSupplierDaoImplFake implements IOrderToTheSupplierDao {
    @Autowired
    DataSet dataSet;

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
        return dataSet.getOrderToTheSupplier();
    }

    @Override
    public OrderToTheSupplier edit(OrderToTheSupplier orderToTheSupplier) {
        return null;
    }

    @Override
    public OrderToTheSupplier delete(String id) {
        return null;
    }
}
