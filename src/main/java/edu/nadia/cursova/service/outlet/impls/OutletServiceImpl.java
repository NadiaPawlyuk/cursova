package edu.nadia.cursova.service.outlet.impls;

import edu.nadia.cursova.dao.outlet.impls.OutletDaoImplFake;
import edu.nadia.cursova.dao.repository.OutletRepository;
import edu.nadia.cursova.model.Outlet;
import edu.nadia.cursova.service.outlet.interfaces.IOutletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service
public class OutletServiceImpl implements IOutletService {
    @Autowired
    OutletDaoImplFake dao;

    @Autowired
    OutletRepository repository;

    @PostConstruct
    void init(){
        List<Outlet> list = dao.getAll();

        repository.saveAll(list);
    }

    @Override
    public Outlet save(Outlet outlet) {
        return null;
    }

    @Override
    public Outlet get(String id) {
        return null;
    }

    @Override
    public List<Outlet> getAll() {
        return repository.findAll();
    }

    @Override
    public Outlet edit(Outlet outlet) {
        return null;
    }

    @Override
    public Outlet delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
