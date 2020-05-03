package edu.nadia.cursova.dao.repository;

import edu.nadia.cursova.model.DepartmentStore;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentStoreRepository extends MongoRepository<DepartmentStore, String> {
}
