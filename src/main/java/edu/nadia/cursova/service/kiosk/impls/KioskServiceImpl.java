package edu.nadia.cursova.service.kiosk.impls;

import edu.nadia.cursova.dao.kiosk.impls.KioskDaoImplFake;
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
    KioskDaoImplFake dao;

    //@Autowired
    //KioskRepository repository;

    @PostConstruct
    void init(){
        List<Kiosk> list = dao.getAll();

        //repository.saveAll(list);
    }

    @Override
    public Kiosk save(Kiosk kiosk) {
        return null;
    }

    @Override
    public Kiosk get(String id) {
        return dao.getAll().stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<Kiosk> getAll() {
        return dao.getAll();
        //return repository.findAll();
    }

    @Override
    public Kiosk edit(Kiosk kiosk) {
        return null;
    }

    @Override
    public Kiosk delete(String id) {
        Kiosk kiosk  = this.get(id);
        dao.getAll().remove(kiosk);
        return kiosk;
        //repository.deleteById(id);
        //return repository.findById(id).orElse(null);
    }
}
