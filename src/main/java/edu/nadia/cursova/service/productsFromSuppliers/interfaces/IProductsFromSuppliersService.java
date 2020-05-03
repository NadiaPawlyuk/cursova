package edu.nadia.cursova.service.productsFromSuppliers.interfaces;

import edu.nadia.cursova.model.ProductsFromSuppliers;

import java.util.List;

public interface IProductsFromSuppliersService {
    ProductsFromSuppliers save(ProductsFromSuppliers productsFromSuppliers);
    ProductsFromSuppliers get(String id);
    List<ProductsFromSuppliers> getAll();
    ProductsFromSuppliers edit(ProductsFromSuppliers productsFromSuppliers);
    ProductsFromSuppliers delete(String id);
}
