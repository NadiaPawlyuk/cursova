package edu.nadia.cursova.dao.directoryOfGoodsNomenclature.impls;

import edu.nadia.cursova.dao.directoryOfGoodsNomenclature.interfaces.IDirectoryOfGoodsNomenclatureDao;
import edu.nadia.cursova.dataSet.DataSet;
import edu.nadia.cursova.model.DirectoryOfGoodsNomenclature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class DirectoryOfGoodsNomenclatureDaoImplFake implements IDirectoryOfGoodsNomenclatureDao {

    @Autowired
    DataSet dataSet;

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
        return dataSet.getDirectoryOfGoodsNomenclature();
    }

    @Override
    public DirectoryOfGoodsNomenclature edit(DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature) {
        return null;
    }

    @Override
    public DirectoryOfGoodsNomenclature delete(String id) {
        return null;
    }
}
