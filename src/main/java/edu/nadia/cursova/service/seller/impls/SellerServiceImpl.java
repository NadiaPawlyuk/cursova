package edu.nadia.cursova.service.seller.impls;

import edu.nadia.cursova.dao.repository.SellerRepository;
import edu.nadia.cursova.model.Seller;
import edu.nadia.cursova.service.seller.interfaces.ISellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;
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
        return null;
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
}
