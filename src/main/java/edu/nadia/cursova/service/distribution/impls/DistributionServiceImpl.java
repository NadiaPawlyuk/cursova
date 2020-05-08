package edu.nadia.cursova.service.distribution.impls;

import edu.nadia.cursova.dao.distribution.impls.DistributionDaoImplFake;
import edu.nadia.cursova.dao.repository.DistributionRepository;
import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.service.distribution.interfaces.IDistributionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service
public class DistributionServiceImpl implements IDistributionService {
    @Autowired
    DistributionDaoImplFake dao;

    //@Autowired
    //DistributionRepository repository;

    @PostConstruct
    void init(){
        List<Distribution> list = dao.getAll();

        //repository.saveAll(list);
    }

    @Override
    public Distribution save(Distribution distribution) {
        return null;
    }

    @Override
    public Distribution get(String id) {
        return dao.getAll().stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<Distribution> getAll() {
        return dao.getAll();
        //return repository.findAll();
    }

    @Override
    public Distribution edit(Distribution distribution) {
        return null;
    }

    @Override
    public Distribution delete(String id) {
        Distribution distribution = this.get(id);
        dao.getAll().remove(distribution);
        return distribution;
        //repository.deleteById(id);
        //return repository.findById(id).orElse(null);
    }
}
