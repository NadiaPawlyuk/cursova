package edu.nadia.cursova.service.section.impls;

import edu.nadia.cursova.dao.repository.SectionRepository;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.model.Section;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import edu.nadia.cursova.service.section.interfaces.ISectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SectionServiceImpl implements ISectionService {
    @Autowired
    SectionRepository repository;

    @PostConstruct
    void init(){
        //repository.saveAll(list);
    }

    @Override
    public Section save(Section section) {
        section.setDateOfCreation(LocalDateTime.now());
        section.setDateOfModified(LocalDateTime.now());
        return repository.save(section);
    }

    @Override
    public Section get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Section> getAll() {
        return repository.findAll();
    }

    @Override
    public Section edit(Section section) {
        section.setDateOfModified(LocalDateTime.now());
        return repository.save(section);
    }

    @Override
    public Section delete(String id) {
        Section section = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return section;
    }


    public List<Section> search(String word){
        List<Section> found = this.getAll().stream()
                .filter(section -> section.getNameOfTheSection().contains(word))
                .collect(Collectors.toList());
        return found;
    }

    public List<Section> sortByName(List<Section> people){

        Collections.sort(people, new SectionServiceImpl.SectionNameComparator());

        return people;
    }

    private class SectionNameComparator implements Comparator<Section> {
        public int compare(Section p1, Section p2) {
            return p1.getNameOfTheSection().compareTo(p2.getNameOfTheSection());
        }
    }
}
