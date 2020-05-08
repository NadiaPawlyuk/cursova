package edu.nadia.cursova.service.section.impls;

import edu.nadia.cursova.dao.repository.SectionRepository;
import edu.nadia.cursova.model.Section;
import edu.nadia.cursova.service.section.interfaces.ISectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
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
        return null;
    }

    @Override
    public Section get(String id) {
        return null;
    }

    @Override
    public List<Section> getAll() {
        return repository.findAll();
    }

    @Override
    public Section edit(Section section) {
        return null;
    }

    @Override
    public Section delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
