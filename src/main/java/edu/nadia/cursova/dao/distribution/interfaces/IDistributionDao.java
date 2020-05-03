package edu.nadia.cursova.dao.distribution.interfaces;

import edu.nadia.cursova.model.Distribution;

import java.util.List;

public interface IDistributionDao {
    Distribution save(Distribution distribution);
    Distribution get(String id);
    List<Distribution> getAll();
    Distribution edit(Distribution distribution);
    Distribution delete(String id);
}
