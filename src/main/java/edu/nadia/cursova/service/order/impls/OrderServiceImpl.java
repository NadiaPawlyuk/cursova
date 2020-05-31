package edu.nadia.cursova.service.order.impls;

import edu.nadia.cursova.dao.repository.OrderRepository;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.model.Order;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import edu.nadia.cursova.service.order.interfaces.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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


    public List<Order> search(String word){
        List<Order> found = this.getAll().stream()
                .filter(order -> order.getExternalCommunicationWithNomenclature().getTheNameOfTheProduct().contains(word))
                .collect(Collectors.toList());
        return found;
    }


    public List<Order> sortByName(List<Order> people){

        Collections.sort(people, new OrderServiceImpl.OrderNameComparator());

        return people;
    }

    private class OrderNameComparator implements Comparator<Order> {
        public int compare(Order p1, Order p2) {
            return p1.getExternalCommunicationWithNomenclature().getTheNameOfTheProduct().compareTo(p2.getExternalCommunicationWithNomenclature().getTheNameOfTheProduct());
        }
    }
}
