package edu.nadia.cursova.dao.repository;

import edu.nadia.cursova.model.Hall;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallRepository extends MongoRepository<Hall, String> {
}
