package edu.nadia.cursova.service.kiosk.impls;

import edu.nadia.cursova.dao.repository.KioskRepository;
import edu.nadia.cursova.model.Kiosk;
import edu.nadia.cursova.service.kiosk.interfaces.IKioskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service
public class KioskServiceImpl implements IKioskService {
    @Autowired
    KioskRepository repository;

    @PostConstruct
    void init(){
        //repository.saveAll(list);
    }

    @Override
    public Kiosk save(Kiosk kiosk) {
        return null;
    }

    @Override
    public Kiosk get(String id) {
        return null;
    }

    @Override
    public List<Kiosk> getAll() {
        return repository.findAll();
    }

    @Override
    public Kiosk edit(Kiosk kiosk) {
        return null;
    }

    @Override
    public Kiosk delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
