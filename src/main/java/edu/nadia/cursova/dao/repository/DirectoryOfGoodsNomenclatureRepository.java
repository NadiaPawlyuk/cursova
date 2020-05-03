package edu.nadia.cursova.dao.repository;

import edu.nadia.cursova.model.DirectoryOfGoodsNomenclature;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectoryOfGoodsNomenclatureRepository extends MongoRepository<DirectoryOfGoodsNomenclature, String> {
}
