package edu.nadia.cursova.dao.productsFromSuppliers.impls;

import edu.nadia.cursova.dao.productsFromSuppliers.interfaces.IProductsFromSuppliersDao;
import edu.nadia.cursova.dataSet.DataSet;
import edu.nadia.cursova.model.ProductsFromSuppliers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class ProductsFromSuppliersDaoImplFake implements IProductsFromSuppliersDao {
    @Autowired
    DataSet dataSet;

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
        return dataSet.getProductsFromSuppliers();
    }

    @Override
    public ProductsFromSuppliers edit(ProductsFromSuppliers productsFromSuppliers) {
        return null;
    }

    @Override
    public ProductsFromSuppliers delete(String id) {
        return null;
    }
}
