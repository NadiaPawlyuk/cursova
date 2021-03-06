package edu.nadia.cursova.dao.supplier.interfaces;

import edu.nadia.cursova.model.Supplier;

import java.util.List;

public interface ISupplierDao {
    Supplier save(Supplier supplier);
    Supplier get(String id);
    List<Supplier> getAll();
    Supplier edit(Supplier supplier);
    Supplier delete(String id);
}
