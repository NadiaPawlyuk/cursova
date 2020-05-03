package edu.nadia.cursova.dao.repository;

import edu.nadia.cursova.model.OrderToTheSupplier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderToTheSupplierRepository extends MongoRepository<OrderToTheSupplier, String> {
}
