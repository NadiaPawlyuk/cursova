package edu.nadia.cursova.dao.repository;

import edu.nadia.cursova.model.AccountingForBuyers;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountingForBuyersRepository extends MongoRepository<AccountingForBuyers, String> {

    /*List<AccountingForBuyers> findByInitials(String initials);
    List<AccountingForBuyers> findByInitialsIsLike(String regex);*/
}
