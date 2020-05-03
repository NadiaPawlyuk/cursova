package edu.nadia.cursova.dao.repository;

import edu.nadia.cursova.model.Distribution;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistributionRepository extends MongoRepository<Distribution, String> {
}
