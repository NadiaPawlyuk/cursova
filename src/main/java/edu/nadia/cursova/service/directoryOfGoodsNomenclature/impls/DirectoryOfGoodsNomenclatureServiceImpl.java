package edu.nadia.cursova.service.directoryOfGoodsNomenclature.impls;

import edu.nadia.cursova.dao.directoryOfGoodsNomenclature.impls.DirectoryOfGoodsNomenclatureDaoImplFake;
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
    DirectoryOfGoodsNomenclatureDaoImplFake dao;

    //@Autowired
    //DirectoryOfGoodsNomenclatureRepository repository;

    @PostConstruct
    void init(){
        List<DirectoryOfGoodsNomenclature> list = dao.getAll();

        //repository.saveAll(list);
    }

    @Override
    public DirectoryOfGoodsNomenclature save(DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature) {
        return null;
    }

    @Override
    public DirectoryOfGoodsNomenclature get(String id) {
        return dao.getAll().stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<DirectoryOfGoodsNomenclature> getAll() {
        return dao.getAll();
        //return repository.findAll();
    }

    @Override
    public DirectoryOfGoodsNomenclature edit(DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature) {
        return null;
    }

    @Override
    public DirectoryOfGoodsNomenclature delete(String id) {
        DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature = this.get(id);
        dao.getAll().remove(directoryOfGoodsNomenclature);
        return directoryOfGoodsNomenclature;
        //repository.deleteById(id);
        //return repository.findById(id).orElse(null);
    }
}
