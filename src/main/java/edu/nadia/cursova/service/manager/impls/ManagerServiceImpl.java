package edu.nadia.cursova.service.manager.impls;

import edu.nadia.cursova.dao.manager.impls.ManagerDaoImplFake;
import edu.nadia.cursova.dao.repository.ManagerRepository;
import edu.nadia.cursova.model.Manager;
import edu.nadia.cursova.service.manager.interfaces.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service
public class ManagerServiceImpl implements IManagerService {
    @Autowired
    ManagerDaoImplFake dao;

    @Autowired
    ManagerRepository repository;

    @PostConstruct
    void init(){
        List<Manager> list = dao.getAll();

        repository.saveAll(list);
    }

    @Override
    public Manager save(Manager manager) {
        return null;
    }

    @Override
    public Manager get(String id) {
        return null;
    }

    @Override
    public List<Manager> getAll() {
        return repository.findAll();
    }

    @Override
    public Manager edit(Manager manager) {
        return null;
    }

    @Override
    public Manager delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
