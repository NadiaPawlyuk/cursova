package edu.nadia.cursova.dao.repository;

import edu.nadia.cursova.model.Kiosk;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KioskRepository extends MongoRepository<Kiosk, String> {
}
