package edu.nadia.cursova.service.productsInOutlets.impls;

import edu.nadia.cursova.dao.repository.ProductsInOutletsRepository;
import edu.nadia.cursova.model.ProductsInOutlets;
import edu.nadia.cursova.service.productsInOutlets.interfaces.IProductsInOutletsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class ProductsInOutletsServiceImpl implements IProductsInOutletsService {
    @Autowired
    ProductsInOutletsRepository repository;

    @PostConstruct
    void init(){
        //repository.saveAll(list);
    }

    @Override
    public ProductsInOutlets save(ProductsInOutlets productsInOutlets) {
        productsInOutlets.setDateOfCreation(LocalDateTime.now());
        productsInOutlets.setDateOfModified(LocalDateTime.now());
        return repository.save(productsInOutlets);
    }

    @Override
    public ProductsInOutlets get(String id) {
        return null;
    }

    @Override
    public List<ProductsInOutlets> getAll() {
        return repository.findAll();
    }

    @Override
    public ProductsInOutlets edit(ProductsInOutlets productsInOutlets) {
        productsInOutlets.setDateOfModified(LocalDateTime.now());
        return repository.save(productsInOutlets);
    }

    @Override
    public ProductsInOutlets delete(String id) {
        ProductsInOutlets productsInOutlets = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return productsInOutlets;
    }
}
