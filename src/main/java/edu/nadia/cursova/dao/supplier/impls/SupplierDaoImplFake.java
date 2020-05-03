package edu.nadia.cursova.dao.supplier.impls;

import edu.nadia.cursova.dao.supplier.interfaces.ISupplierDao;
import edu.nadia.cursova.dataSet.DataSet;
import edu.nadia.cursova.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class SupplierDaoImplFake implements ISupplierDao {
    @Autowired
    DataSet dataSet;

    @Override
    public Supplier save(Supplier supplier) {
        return null;
    }

    @Override
    public Supplier get(String id) {
        return null;
    }

    @Override
    public List<Supplier> getAll() {
        return dataSet.getSupplier();
    }

    @Override
    public Supplier edit(Supplier supplier) {
        return null;
    }

    @Override
    public Supplier delete(String id) {
        return null;
    }
}
