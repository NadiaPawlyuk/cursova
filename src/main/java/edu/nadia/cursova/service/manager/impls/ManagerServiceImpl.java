package edu.nadia.cursova.service.manager.impls;

import edu.nadia.cursova.dao.repository.ManagerRepository;
import edu.nadia.cursova.model.Manager;
import edu.nadia.cursova.service.manager.interfaces.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;
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
}
