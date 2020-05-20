package edu.nadia.cursova.service.section.impls;

import edu.nadia.cursova.dao.repository.SectionRepository;
import edu.nadia.cursova.model.Section;
import edu.nadia.cursova.service.section.interfaces.ISectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
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
}
