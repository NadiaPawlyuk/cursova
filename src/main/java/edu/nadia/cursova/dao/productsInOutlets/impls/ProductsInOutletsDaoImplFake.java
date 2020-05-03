package edu.nadia.cursova.dao.productsInOutlets.impls;

import edu.nadia.cursova.dao.productsInOutlets.interfaces.IProductsInOutletsDao;
import edu.nadia.cursova.dataSet.DataSet;
import edu.nadia.cursova.model.ProductsInOutlets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class ProductsInOutletsDaoImplFake implements IProductsInOutletsDao {
    @Autowired
    DataSet dataSet;

    @Override
    public ProductsInOutlets save(ProductsInOutlets productsInOutlets) {
        return null;
    }

    @Override
    public ProductsInOutlets get(String id) {
        return null;
    }

    @Override
    public List<ProductsInOutlets> getAll() {
        return dataSet.getProductsInOutlets();
    }

    @Override
    public ProductsInOutlets edit(ProductsInOutlets productsInOutlets) {
        return null;
    }

    @Override
    public ProductsInOutlets delete(String id) {
        return null;
    }
}
