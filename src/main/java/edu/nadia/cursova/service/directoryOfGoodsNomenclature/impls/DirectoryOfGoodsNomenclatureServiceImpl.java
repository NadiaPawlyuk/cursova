package edu.nadia.cursova.service.directoryOfGoodsNomenclature.impls;

import edu.nadia.cursova.dao.repository.DirectoryOfGoodsNomenclatureRepository;
import edu.nadia.cursova.model.DirectoryOfGoodsNomenclature;
import edu.nadia.cursova.service.directoryOfGoodsNomenclature.interfaces.IDirectoryOfGoodsNomenclatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
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
        directoryOfGoodsNomenclature.setDateOfCreation(LocalDateTime.now());
        directoryOfGoodsNomenclature.setDateOfModified(LocalDateTime.now());
        return repository.save(directoryOfGoodsNomenclature);
    }

    @Override
    public DirectoryOfGoodsNomenclature get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<DirectoryOfGoodsNomenclature> getAll() {
        return repository.findAll();
    }

    @Override
    public DirectoryOfGoodsNomenclature edit(DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature) {
        directoryOfGoodsNomenclature.setDateOfModified(LocalDateTime.now());
        return repository.save(directoryOfGoodsNomenclature);
    }

    @Override
    public DirectoryOfGoodsNomenclature delete(String id) {
        DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return directoryOfGoodsNomenclature;
    }
}
