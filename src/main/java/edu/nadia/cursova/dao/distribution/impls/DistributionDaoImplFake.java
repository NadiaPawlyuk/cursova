package edu.nadia.cursova.dao.distribution.impls;

import edu.nadia.cursova.dao.distribution.interfaces.IDistributionDao;
import edu.nadia.cursova.dataSet.DataSet;
import edu.nadia.cursova.model.Distribution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class DistributionDaoImplFake implements IDistributionDao {
   @Autowired
    DataSet dataSet;

    @Override
    public Distribution save(Distribution distribution) {
        return null;
    }

    @Override
    public Distribution get(String id) {
        return null;
    }

    @Override
    public List<Distribution> getAll() {
        return dataSet.getDistribution();
    }

    @Override
    public Distribution edit(Distribution distribution) {
        return null;
    }

    @Override
    public Distribution delete(String id) {
        return null;
    }
}
