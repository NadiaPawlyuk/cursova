package edu.nadia.cursova.service.theHeadOfTheSection.impls;

import edu.nadia.cursova.dao.repository.TheHeadOfTheSectionRepository;
import edu.nadia.cursova.model.TheHeadOfTheSection;
import edu.nadia.cursova.service.theHeadOfTheSection.interfaces.ITheHeadOfTheSectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
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
        return null;
    }

    @Override
    public TheHeadOfTheSection get(String id) {
        return null;
    }

    @Override
    public List<TheHeadOfTheSection> getAll() {
        return repository.findAll();
    }

    @Override
    public TheHeadOfTheSection edit(TheHeadOfTheSection theHeadOfTheSection) {
        return null;
    }

    @Override
    public TheHeadOfTheSection delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
