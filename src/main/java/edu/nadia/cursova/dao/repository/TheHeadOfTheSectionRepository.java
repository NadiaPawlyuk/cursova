package edu.nadia.cursova.dao.repository;

import edu.nadia.cursova.model.TheHeadOfTheSection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheHeadOfTheSectionRepository extends MongoRepository<TheHeadOfTheSection, String> {
}
