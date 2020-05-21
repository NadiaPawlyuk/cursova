package edu.nadia.cursova.service.theHeadOfTheSection.impls;

import edu.nadia.cursova.dao.repository.TheHeadOfTheSectionRepository;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.model.TheHeadOfTheSection;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import edu.nadia.cursova.service.theHeadOfTheSection.interfaces.ITheHeadOfTheSectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TheHeadOfTheSectionServiceImpl implements ITheHeadOfTheSectionService {
    @Autowired
    TheHeadOfTheSectionRepository repository;

    @PostConstruct
    void init(){
       //repository.saveAll(list);
    }

    @Override
    public TheHeadOfTheSection save(TheHeadOfTheSection theHeadOfTheSection) {
        theHeadOfTheSection.setDateOfCreation(LocalDateTime.now());
        theHeadOfTheSection.setDateOfModified(LocalDateTime.now());
        return repository.save(theHeadOfTheSection);
    }

    @Override
    public TheHeadOfTheSection get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<TheHeadOfTheSection> getAll() {
        return repository.findAll();
    }

    @Override
    public TheHeadOfTheSection edit(TheHeadOfTheSection theHeadOfTheSection) {
        theHeadOfTheSection.setDateOfModified(LocalDateTime.now());
        return repository.save(theHeadOfTheSection);
    }

    @Override
    public TheHeadOfTheSection delete(String id) {
        TheHeadOfTheSection theHeadOfTheSection = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return theHeadOfTheSection;
    }


    public List<TheHeadOfTheSection> search(String word){
        List<TheHeadOfTheSection> found = this.getAll().stream()
                .filter(theHeadOfTheSection -> theHeadOfTheSection.getInitials().contains(word))
                .collect(Collectors.toList());
        return found;
    }

    public List<TheHeadOfTheSection> sortByName(List<TheHeadOfTheSection> people){

        Collections.sort(people, new TheHeadOfTheSectionServiceImpl.TheHeadOfTheSectionNameComparator());

        return people;
    }

    private class TheHeadOfTheSectionNameComparator implements Comparator<TheHeadOfTheSection> {
        public int compare(TheHeadOfTheSection p1, TheHeadOfTheSection p2) {
            return p1.getInitials().compareTo(p2.getInitials());
        }
    }

}
