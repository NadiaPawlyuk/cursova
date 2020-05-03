package edu.nadia.cursova.dao.repository;

import edu.nadia.cursova.model.Outlet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutletRepository extends MongoRepository<Outlet, String> {
}
