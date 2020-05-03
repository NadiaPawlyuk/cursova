package edu.nadia.cursova.dao.productsInOutlets.interfaces;

import edu.nadia.cursova.model.ProductsInOutlets;

import java.util.List;

public interface IProductsInOutletsDao {
    ProductsInOutlets save(ProductsInOutlets productsInOutlets);
    ProductsInOutlets get(String id);
    List<ProductsInOutlets> getAll();
    ProductsInOutlets edit(ProductsInOutlets productsInOutlets);
    ProductsInOutlets delete(String id);
}
