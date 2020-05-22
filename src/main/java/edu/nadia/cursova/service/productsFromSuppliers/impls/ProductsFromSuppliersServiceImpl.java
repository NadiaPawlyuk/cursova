package edu.nadia.cursova.service.productsFromSuppliers.impls;

import edu.nadia.cursova.dao.repository.ProductsFromSuppliersRepository;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.model.ProductsFromSuppliers;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import edu.nadia.cursova.service.productsFromSuppliers.interfaces.IProductsFromSuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        return repository.findById(id).orElse(null);
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


    public List<ProductsFromSuppliers> search(String word){
        List<ProductsFromSuppliers> found = this.getAll().stream()
                .filter(productsFromSuppliers -> productsFromSuppliers.getPrice().contains(word))
                .collect(Collectors.toList());
        return found;
    }

    public List<ProductsFromSuppliers> sortByName(List<ProductsFromSuppliers> people){

        Collections.sort(people, new ProductsFromSuppliersServiceImpl.ProductsFromSuppliersNameComparator());

        return people;
    }

    private class ProductsFromSuppliersNameComparator implements Comparator<ProductsFromSuppliers> {
        public int compare(ProductsFromSuppliers p1, ProductsFromSuppliers p2) {
            return p1.getDescription().compareTo(p2.getDescription());
        }
    }

}
