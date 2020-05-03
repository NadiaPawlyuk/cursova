package edu.nadia.cursova.dao.seller.interfaces;

import edu.nadia.cursova.model.Seller;

import java.util.List;

public interface ISellerDao {
    Seller save(Seller seller);
    Seller get(String id);
    List<Seller> getAll();
    Seller edit(Seller seller);
    Seller delete(String id);
}
