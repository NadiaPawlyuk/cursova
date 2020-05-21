package edu.nadia.cursova.service.seller.impls;

import edu.nadia.cursova.dao.repository.SellerRepository;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.model.Seller;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import edu.nadia.cursova.service.seller.interfaces.ISellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerServiceImpl implements ISellerService {
    @Autowired
    SellerRepository repository;

    @PostConstruct
    void init(){
        //repository.saveAll(list);
    }

    @Override
    public Seller save(Seller seller) {
        seller.setDateOfCreation(LocalDateTime.now());
        seller.setDateOfModified(LocalDateTime.now());
        return repository.save(seller);
    }

    @Override
    public Seller get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Seller> getAll() {
        return repository.findAll();
    }

    @Override
    public Seller edit(Seller seller) {
        seller.setDateOfModified(LocalDateTime.now());
        return repository.save(seller);
    }

    @Override
    public Seller delete(String id) {
        Seller seller = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return seller;
    }


    public List<Seller> search(String word){
        List<Seller> found = this.getAll().stream()
                .filter(seller -> seller.getInitials().contains(word))
                .collect(Collectors.toList());
        return found;
    }

    public List<Seller> sortByName(List<Seller> people){

        Collections.sort(people, new SellerServiceImpl.SellerNameComparator());

        return people;
    }

    private class SellerNameComparator implements Comparator<Seller> {
        public int compare(Seller p1, Seller p2) {
            return p1.getInitials().compareTo(p2.getInitials());
        }
    }

}
