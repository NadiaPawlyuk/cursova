package edu.nadia.cursova.service.directoryOfGoodsNomenclature.impls;

import edu.nadia.cursova.dao.repository.DirectoryOfGoodsNomenclatureRepository;
import edu.nadia.cursova.model.DirectoryOfGoodsNomenclature;
import edu.nadia.cursova.service.directoryOfGoodsNomenclature.interfaces.IDirectoryOfGoodsNomenclatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service
public class DirectoryOfGoodsNomenclatureServiceImpl implements IDirectoryOfGoodsNomenclatureService {
  @Autowired
    DirectoryOfGoodsNomenclatureRepository repository;

    @PostConstruct
    void init(){
        //repository.saveAll(list);
    }

    @Override
    public DirectoryOfGoodsNomenclature save(DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature) {
        return null;
    }

    @Override
    public DirectoryOfGoodsNomenclature get(String id) {
        return null;
    }

    @Override
    public List<DirectoryOfGoodsNomenclature> getAll() {
        return repository.findAll();
    }

    @Override
    public DirectoryOfGoodsNomenclature edit(DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature) {
        return null;
    }

    @Override
    public DirectoryOfGoodsNomenclature delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
