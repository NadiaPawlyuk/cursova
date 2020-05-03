package edu.nadia.cursova.dao.repository;

import edu.nadia.cursova.model.AccountingForGoodsSold;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountingForGoodsSoldRepository extends MongoRepository<AccountingForGoodsSold, String>
{
}
