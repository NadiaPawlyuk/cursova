package edu.nadia.cursova.service.outlet.impls;

import edu.nadia.cursova.dao.repository.OutletRepository;
import edu.nadia.cursova.model.Outlet;
import edu.nadia.cursova.service.outlet.interfaces.IOutletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class OutletServiceImpl implements IOutletService {
    @Autowired
    OutletRepository repository;

    @PostConstruct
    void init(){
       //repository.saveAll(list);
    }

    @Override
    public Outlet save(Outlet outlet) {
        outlet.setDateOfCreation(LocalDateTime.now());
        outlet.setDateOfModified(LocalDateTime.now());
        return repository.save(outlet);
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
        outlet.setDateOfModified(LocalDateTime.now());
        return repository.save(outlet);
    }

    @Override
    public Outlet delete(String id) {
        Outlet outlet = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return outlet;
    }
}
