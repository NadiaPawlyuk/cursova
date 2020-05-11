package edu.nadia.cursova.service.hall.impls;

import edu.nadia.cursova.dao.repository.HallRepository;
import edu.nadia.cursova.model.Hall;
import edu.nadia.cursova.service.hall.interfaces.IHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class HallServiceImpl implements IHallService {
   @Autowired
    HallRepository repository;

    @PostConstruct
    void init(){
       //repository.saveAll(list);
    }

    @Override
    public Hall save(Hall hall) {
        hall.setDateOfCreation(LocalDateTime.now());
        hall.setDateOfModified(LocalDateTime.now());
        return repository.save(hall);
    }

    @Override
    public Hall get(String id) {
        return null;
    }

    @Override
    public List<Hall> getAll() {
        return repository.findAll();
    }

    @Override
    public Hall edit(Hall hall) {
        hall.setDateOfModified(LocalDateTime.now());
        return repository.save(hall);
    }

    @Override
    public Hall delete(String id) {
        Hall hall = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return hall;
    }
}
