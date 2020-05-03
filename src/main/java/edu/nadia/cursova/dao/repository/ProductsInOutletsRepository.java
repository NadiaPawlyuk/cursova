package edu.nadia.cursova.dao.repository;

import edu.nadia.cursova.model.ProductsInOutlets;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsInOutletsRepository extends MongoRepository<ProductsInOutlets, String> {
}
