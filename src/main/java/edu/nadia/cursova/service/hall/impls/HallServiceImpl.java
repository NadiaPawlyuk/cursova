package edu.nadia.cursova.service.hall.impls;

import edu.nadia.cursova.dao.hall.impls.HallDaoImplFake;
import edu.nadia.cursova.dao.repository.HallRepository;
import edu.nadia.cursova.model.Hall;
import edu.nadia.cursova.service.hall.interfaces.IHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service
public class HallServiceImpl implements IHallService {
    @Autowired
    HallDaoImplFake dao;

    //@Autowired
    //HallRepository repository;

    @PostConstruct
    void init(){
        List<Hall> list = dao.getAll();

        //repository.saveAll(list);
    }

    @Override
    public Hall save(Hall hall) {
        return null;
    }

    @Override
    public Hall get(String id) {
        return dao.getAll().stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<Hall> getAll() {
        return dao.getAll();
        //return repository.findAll();
    }

    @Override
    public Hall edit(Hall hall) {
        return null;
    }

    @Override
    public Hall delete(String id) {
        Hall hall  = this.get(id);
        dao.getAll().remove(hall);
        return hall;
        //repository.deleteById(id);
        //return repository.findById(id).orElse(null);
    }
}
