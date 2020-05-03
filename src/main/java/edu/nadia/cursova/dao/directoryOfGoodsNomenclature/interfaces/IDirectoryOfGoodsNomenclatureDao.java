package edu.nadia.cursova.dao.directoryOfGoodsNomenclature.interfaces;

import edu.nadia.cursova.model.DirectoryOfGoodsNomenclature;

import java.util.List;

public interface IDirectoryOfGoodsNomenclatureDao {
    DirectoryOfGoodsNomenclature save(DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature);
    DirectoryOfGoodsNomenclature get(String id);
    List<DirectoryOfGoodsNomenclature> getAll();
    DirectoryOfGoodsNomenclature edit(DirectoryOfGoodsNomenclature directoryOfGoodsNomenclature);
    DirectoryOfGoodsNomenclature delete(String id);
}
