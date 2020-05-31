package edu.nadia.cursova.service.productsInOutlets.impls;

import edu.nadia.cursova.dao.repository.ProductsInOutletsRepository;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.model.ProductsInOutlets;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import edu.nadia.cursova.service.productsInOutlets.interfaces.IProductsInOutletsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        return repository.findById(id).orElse(null);
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


    public List<ProductsInOutlets> search(String word){
        List<ProductsInOutlets> found = this.getAll().stream()
                .filter(productsInOutlets -> productsInOutlets.getExternalCommunicationWithTheNomenclature().getTheNameOfTheProduct().contains(word))
                .collect(Collectors.toList());
        return found;
    }

    public List<ProductsInOutlets> sortByName(List<ProductsInOutlets> people){

        Collections.sort(people, new ProductsInOutletsServiceImpl.ProductsInOutletsNameComparator());

        return people;
    }

    private class ProductsInOutletsNameComparator implements Comparator<ProductsInOutlets> {
        public int compare(ProductsInOutlets p1, ProductsInOutlets p2) {
            return p1.getExternalCommunicationWithTheNomenclature().getTheNameOfTheProduct().compareTo(p2.getExternalCommunicationWithTheNomenclature().getTheNameOfTheProduct());
        }
    }
}
