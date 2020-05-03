package edu.nadia.cursova.dao.hall.impls;

import edu.nadia.cursova.dao.hall.interfaces.IHallDao;
import edu.nadia.cursova.dataSet.DataSet;
import edu.nadia.cursova.model.Hall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class HallDaoImplFake implements IHallDao {
   @Autowired
    DataSet dataSet;

    @Override
    public Hall save(Hall hall) {
        return null;
    }

    @Override
    public Hall get(String id) {
        return null;
    }

    @Override
    public List<Hall> getAll() {
        return dataSet.getHall();
    }

    @Override
    public Hall edit(Hall hall) {
        return null;
    }

    @Override
    public Hall delete(String id) {
        return null;
    }
}
