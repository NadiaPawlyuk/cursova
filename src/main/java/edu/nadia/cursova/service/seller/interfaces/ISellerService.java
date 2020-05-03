package edu.nadia.cursova.service.seller.interfaces;

import edu.nadia.cursova.model.Seller;

import java.util.List;

public interface ISellerService {
    Seller save(Seller seller);
    Seller get(String id);
    List<Seller> getAll();
    Seller edit(Seller seller);
    Seller delete(String id);
}
