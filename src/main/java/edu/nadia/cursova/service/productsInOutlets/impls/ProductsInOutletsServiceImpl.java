package edu.nadia.cursova.service.productsInOutlets.impls;

import edu.nadia.cursova.dao.productsInOutlets.impls.ProductsInOutletsDaoImplFake;
import edu.nadia.cursova.dao.repository.ProductsInOutletsRepository;
import edu.nadia.cursova.model.ProductsInOutlets;
import edu.nadia.cursova.service.productsInOutlets.interfaces.IProductsInOutletsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service
public class ProductsInOutletsServiceImpl implements IProductsInOutletsService {
    @Autowired
    ProductsInOutletsDaoImplFake dao;

    //@Autowired
    //ProductsInOutletsRepository repository;

    @PostConstruct
    void init(){
        List<ProductsInOutlets> list = dao.getAll();

        //repository.saveAll(list);
    }

    @Override
    public ProductsInOutlets save(ProductsInOutlets productsInOutlets) {
        return null;
    }

    @Override
    public ProductsInOutlets get(String id) {
        return dao.getAll().stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<ProductsInOutlets> getAll() {
        return dao.getAll();
        //return repository.findAll();
    }

    @Override
    public ProductsInOutlets edit(ProductsInOutlets productsInOutlets) {
        return null;
    }

    @Override
    public ProductsInOutlets delete(String id) {
        ProductsInOutlets productsInOutlets = this.get(id);
        dao.getAll().remove(productsInOutlets);
        return productsInOutlets;
        //repository.deleteById(id);
        //return repository.findById(id).orElse(null);
    }
}
