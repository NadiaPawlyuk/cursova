package edu.nadia.cursova.service.manager.impls;

import edu.nadia.cursova.dao.repository.ManagerRepository;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.model.Manager;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import edu.nadia.cursova.service.manager.interfaces.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ManagerServiceImpl implements IManagerService {
     @Autowired
    ManagerRepository repository;

    @PostConstruct
    void init(){
        //repository.saveAll(list);
    }

    @Override
    public Manager save(Manager manager) {
        manager.setDateOfCreation(LocalDateTime.now());
        manager.setDateOfModified(LocalDateTime.now());
        return repository.save(manager);
    }

    @Override
    public Manager get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Manager> getAll() {
        return repository.findAll();
    }

    @Override
    public Manager edit(Manager manager) {
        manager.setDateOfModified(LocalDateTime.now());
        return repository.save(manager);
    }

    @Override
    public Manager delete(String id) {
        Manager manager = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return manager;
    }


    public List<Manager> search(String word){
        List<Manager> found = this.getAll().stream()
                .filter(manager -> manager.getInitials().contains(word))
                .collect(Collectors.toList());
        return found;
    }

    public List<Manager> sortByName(List<Manager> people){

        Collections.sort(people, new ManagerServiceImpl.ManagerNameComparator());

        return people;
    }

    private class ManagerNameComparator implements Comparator<Manager> {
        public int compare(Manager p1, Manager p2) {
            return p1.getInitials().compareTo(p2.getInitials());
        }
    }
}
