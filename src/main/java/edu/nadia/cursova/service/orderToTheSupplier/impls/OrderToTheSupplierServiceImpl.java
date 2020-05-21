package edu.nadia.cursova.service.orderToTheSupplier.impls;

import edu.nadia.cursova.dao.repository.OrderToTheSupplierRepository;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.DirectoryOfGoodsNomenclature;
import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.model.OrderToTheSupplier;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import edu.nadia.cursova.service.directoryOfGoodsNomenclature.impls.DirectoryOfGoodsNomenclatureServiceImpl;
import edu.nadia.cursova.service.orderToTheSupplier.interfaces.IOrderToTheSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderToTheSupplierServiceImpl implements IOrderToTheSupplierService {
    @Autowired
    OrderToTheSupplierRepository repository;

    //@Autowired
    //DirectoryOfGoodsNomenclatureServiceImpl directoryOfGoodsNomenclatureService;

    @PostConstruct
    void init(){
        //repository.saveAll(list);
    }

    @Override
    public OrderToTheSupplier save(OrderToTheSupplier orderToTheSupplier) {
        orderToTheSupplier.setDateOfCreation(LocalDateTime.now());
        orderToTheSupplier.setDateOfModified(LocalDateTime.now());
        return repository.save(orderToTheSupplier);
    }

    @Override
    public OrderToTheSupplier get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<OrderToTheSupplier> getAll() {
        return repository.findAll();
    }

    @Override
    public OrderToTheSupplier edit(OrderToTheSupplier orderToTheSupplier) {
        orderToTheSupplier.setDateOfModified(LocalDateTime.now());
        return repository.save(orderToTheSupplier);
    }

    @Override
    public OrderToTheSupplier delete(String id) {
        OrderToTheSupplier orderToTheSupplier = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return orderToTheSupplier;
    }


    public List<OrderToTheSupplier> search(String word){
        List<OrderToTheSupplier> found = this.getAll().stream()
                .filter(orderToTheSupplier -> orderToTheSupplier.getTheNameOfTheProduct().contains(word))
                .collect(Collectors.toList());
        return found;
    }

    public List<OrderToTheSupplier> sortByName(List<OrderToTheSupplier> people){

        Collections.sort(people, new OrderToTheSupplierServiceImpl.OrderToTheSupplierNameComparator());

        return people;
    }

    private class OrderToTheSupplierNameComparator implements Comparator<OrderToTheSupplier> {
        public int compare(OrderToTheSupplier p1, OrderToTheSupplier p2) {
            return p1.getTheNameOfTheProduct().compareTo(p2.getTheNameOfTheProduct());
        }
    }

}
