package edu.nadia.cursova.service.directoryOfGoodsNomenclature.impls;

import edu.nadia.cursova.dao.repository.DirectoryOfGoodsNomenclatureRepository;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.DepartmentStore;
import edu.nadia.cursova.model.DirectoryOfGoodsNomenclature;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import edu.nadia.cursova.service.directoryOfGoodsNomenclature.interfaces.IDirectoryOfGoodsNomenclatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<DirectoryOfGoodsNomenclature> search(String word){
        List<DirectoryOfGoodsNomenclature> found = this.getAll().stream()
                .filter(directoryOfGoodsNomenclature -> directoryOfGoodsNomenclature.getTheNameOfTheProduct().contains(word))
                .collect(Collectors.toList());
        return found;
    }

    public List<DirectoryOfGoodsNomenclature> sortByName(List<DirectoryOfGoodsNomenclature> people){

        Collections.sort(people, new DirectoryOfGoodsNomenclatureServiceImpl.DirectoryOfGoodsNomenclatureNameComparator());

        return people;
    }

    private class DirectoryOfGoodsNomenclatureNameComparator implements Comparator<DirectoryOfGoodsNomenclature> {
        public int compare(DirectoryOfGoodsNomenclature p1, DirectoryOfGoodsNomenclature p2) {
            return p1.getTheNameOfTheProduct().compareTo(p2.getTheNameOfTheProduct());
        }
    }
}
