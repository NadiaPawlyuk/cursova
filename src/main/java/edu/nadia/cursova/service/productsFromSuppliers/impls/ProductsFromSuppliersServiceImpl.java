package edu.nadia.cursova.service.productsFromSuppliers.impls;

import edu.nadia.cursova.dao.repository.ProductsFromSuppliersRepository;
import edu.nadia.cursova.model.ProductsFromSuppliers;
import edu.nadia.cursova.service.productsFromSuppliers.interfaces.IProductsFromSuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class ProductsFromSuppliersServiceImpl implements IProductsFromSuppliersService {
   @Autowired
    ProductsFromSuppliersRepository repository;

    @PostConstruct
    void init(){
       // repository.saveAll(list);
    }

    @Override
    public ProductsFromSuppliers save(ProductsFromSuppliers productsFromSuppliers) {
        productsFromSuppliers.setDateOfCreation(LocalDateTime.now());
        productsFromSuppliers.setDateOfModified(LocalDateTime.now());
        return repository.save(productsFromSuppliers);
    }

    @Override
    public ProductsFromSuppliers get(String id) {
        return null;
    }

    @Override
    public List<ProductsFromSuppliers> getAll() {
        return repository.findAll();
    }

    @Override
    public ProductsFromSuppliers edit(ProductsFromSuppliers productsFromSuppliers) {
        productsFromSuppliers.setDateOfModified(LocalDateTime.now());
        return repository.save(productsFromSuppliers);
    }

    @Override
    public ProductsFromSuppliers delete(String id) {
        ProductsFromSuppliers productsFromSuppliers = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return productsFromSuppliers;
    }
}
