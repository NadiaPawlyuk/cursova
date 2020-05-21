package edu.nadia.cursova.service.kiosk.impls;

import edu.nadia.cursova.dao.repository.KioskRepository;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.model.Kiosk;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import edu.nadia.cursova.service.kiosk.interfaces.IKioskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        kiosk.setDateOfCreation(LocalDateTime.now());
        kiosk.setDateOfModified(LocalDateTime.now());
        return repository.save(kiosk);
    }

    @Override
    public Kiosk get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Kiosk> getAll() {
        return repository.findAll();
    }

    @Override
    public Kiosk edit(Kiosk kiosk) {
        kiosk.setDateOfModified(LocalDateTime.now());
        return repository.save(kiosk);
    }

    @Override
    public Kiosk delete(String id) {
        Kiosk kiosk = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return kiosk;
    }


    public List<Kiosk> search(String word){
        List<Kiosk> found = this.getAll().stream()
                .filter(kiosk -> kiosk.getDescription().contains(word))
                .collect(Collectors.toList());
        return found;
    }

    public List<Kiosk> sortByName(List<Kiosk> people){

        Collections.sort(people, new KioskServiceImpl.KioskNameComparator());

        return people;
    }

    private class KioskNameComparator implements Comparator<Kiosk> {
        public int compare(Kiosk p1, Kiosk p2) {
            return p1.getAddress().compareTo(p2.getAddress());
        }
    }
}
