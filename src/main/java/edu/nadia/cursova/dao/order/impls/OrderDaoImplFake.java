package edu.nadia.cursova.dao.order.impls;

import edu.nadia.cursova.dao.order.interfaces.IOrderDao;
import edu.nadia.cursova.dataSet.DataSet;
import edu.nadia.cursova.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class OrderDaoImplFake implements IOrderDao {
    @Autowired
    DataSet dataSet;

    @Override
    public Order save(Order order) {
        return null;
    }

    @Override
    public Order get(String id) {
        return null;
    }

    @Override
    public List<Order> getAll() {
        return dataSet.getOrder();
    }

    @Override
    public Order edit(Order order) {
        return null;
    }

    @Override
    public Order delete(String id) {
        return null;
    }
}
