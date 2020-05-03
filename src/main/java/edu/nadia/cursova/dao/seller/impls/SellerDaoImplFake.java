package edu.nadia.cursova.dao.seller.impls;

import edu.nadia.cursova.dao.seller.interfaces.ISellerDao;
import edu.nadia.cursova.dataSet.DataSet;
import edu.nadia.cursova.model.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class SellerDaoImplFake implements ISellerDao {
    @Autowired
    DataSet dataSet;

    @Override
    public Seller save(Seller seller) {
        return null;
    }

    @Override
    public Seller get(String id) {
        return null;
    }

    @Override
    public List<Seller> getAll() {
        return dataSet.getSeller();
    }

    @Override
    public Seller edit(Seller seller) {
        return null;
    }

    @Override
    public Seller delete(String id) {
        return null;
    }
}
