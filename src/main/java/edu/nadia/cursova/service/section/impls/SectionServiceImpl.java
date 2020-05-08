package edu.nadia.cursova.service.section.impls;

import edu.nadia.cursova.dao.repository.SectionRepository;
import edu.nadia.cursova.dao.section.impls.SectionDaoImplFake;
import edu.nadia.cursova.model.Section;
import edu.nadia.cursova.service.section.interfaces.ISectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service
public class SectionServiceImpl implements ISectionService {
    @Autowired
    SectionDaoImplFake dao;

    //@Autowired
    //SectionRepository repository;

    @PostConstruct
    void init(){
        List<Section> list = dao.getAll();

        //repository.saveAll(list);
    }

    @Override
    public Section save(Section section) {
        return null;
    }

    @Override
    public Section get(String id) {
        return dao.getAll().stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<Section> getAll() {
        return dao.getAll();
        //return repository.findAll();
    }

    @Override
    public Section edit(Section section) {
        return null;
    }

    @Override
    public Section delete(String id) {
        Section section = this.get(id);
        dao.getAll().remove(section);
        return section;
        //repository.deleteById(id);
        //return repository.findById(id).orElse(null);
    }
}
