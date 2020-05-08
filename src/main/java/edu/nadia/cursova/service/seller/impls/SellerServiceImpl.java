package edu.nadia.cursova.service.seller.impls;

import edu.nadia.cursova.dao.repository.SellerRepository;
import edu.nadia.cursova.dao.seller.impls.SellerDaoImplFake;
import edu.nadia.cursova.model.Seller;
import edu.nadia.cursova.service.seller.interfaces.ISellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service
public class SellerServiceImpl implements ISellerService {
    @Autowired
    SellerDaoImplFake dao;

    //@Autowired
    //SellerRepository repository;

    @PostConstruct
    void init(){
        List<Seller> list = dao.getAll();

        //repository.saveAll(list);
    }

    @Override
    public Seller save(Seller seller) {
        return null;
    }

    @Override
    public Seller get(String id) {
        return dao.getAll().stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<Seller> getAll() {
        return dao.getAll();
        //return repository.findAll();
    }

    @Override
    public Seller edit(Seller seller) {
        return null;
    }

    @Override
    public Seller delete(String id) {
        Seller seller = this.get(id);
        dao.getAll().remove(seller);
        return seller;
        //repository.deleteById(id);
        //return repository.findById(id).orElse(null);
    }
}
