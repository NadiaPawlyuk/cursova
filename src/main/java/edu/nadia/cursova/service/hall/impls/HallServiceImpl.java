package edu.nadia.cursova.service.hall.impls;

import edu.nadia.cursova.dao.repository.HallRepository;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.model.Hall;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import edu.nadia.cursova.service.hall.interfaces.IHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        return repository.findById(id).orElse(null);
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


    public List<Hall> search(String word){
        List<Hall> found = this.getAll().stream()
                .filter(hall -> hall.getNameOfTheHall().getName().contains(word))
                .collect(Collectors.toList());
        return found;
    }

    public List<Hall> sortByName(List<Hall> people){

        Collections.sort(people, new HallServiceImpl.HallNameComparator());

        return people;
    }

    private class HallNameComparator implements Comparator<Hall> {
        public int compare(Hall p1, Hall p2) {
            return p1.getNameOfTheHall().getName().compareTo(p2.getNameOfTheHall().getName());
        }
    }
}
