package edu.nadia.cursova.service.distribution.impls;

import edu.nadia.cursova.dao.repository.DistributionRepository;
import edu.nadia.cursova.model.Distribution;
import edu.nadia.cursova.service.distribution.interfaces.IDistributionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class DistributionServiceImpl implements IDistributionService {
    @Autowired
    DistributionRepository repository;

    @PostConstruct
    void init(){
        //repository.saveAll(list);
    }

    @Override
    public Distribution save(Distribution distribution) {
        distribution.setDateOfCreation(LocalDateTime.now());
        distribution.setDateOfModified(LocalDateTime.now());
        return repository.save(distribution);
    }

    @Override
    public Distribution get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Distribution> getAll() {
        return repository.findAll();
    }

    @Override
    public Distribution edit(Distribution distribution) {
        distribution.setDateOfModified(LocalDateTime.now());
        return repository.save(distribution);
    }

    @Override
    public Distribution delete(String id) {
        Distribution distribution = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return distribution;
    }
}
