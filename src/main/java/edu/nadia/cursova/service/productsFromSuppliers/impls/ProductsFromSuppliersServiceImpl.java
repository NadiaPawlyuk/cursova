package edu.nadia.cursova.service.productsFromSuppliers.impls;

import edu.nadia.cursova.dao.productsFromSuppliers.impls.ProductsFromSuppliersDaoImplFake;
import edu.nadia.cursova.dao.repository.ProductsFromSuppliersRepository;
import edu.nadia.cursova.model.ProductsFromSuppliers;
import edu.nadia.cursova.service.productsFromSuppliers.interfaces.IProductsFromSuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service
public class ProductsFromSuppliersServiceImpl implements IProductsFromSuppliersService {
    @Autowired
    ProductsFromSuppliersDaoImplFake dao;

    @Autowired
    ProductsFromSuppliersRepository repository;

    @PostConstruct
    void init(){
        List<ProductsFromSuppliers> list = dao.getAll();

        repository.saveAll(list);
    }

    @Override
    public ProductsFromSuppliers save(ProductsFromSuppliers productsFromSuppliers) {
        return null;
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
        return null;
    }

    @Override
    public ProductsFromSuppliers delete(String id) { repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
