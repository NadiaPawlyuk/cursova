package edu.nadia.cursova.dao.repository;

import edu.nadia.cursova.model.OrganizationOfTrade;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationOfTradeRepository extends MongoRepository<OrganizationOfTrade, String> {
}
