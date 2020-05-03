package edu.nadia.cursova.dao.repository;

import edu.nadia.cursova.model.ProductsFromSuppliers;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsFromSuppliersRepository extends MongoRepository<ProductsFromSuppliers, String> {
}
