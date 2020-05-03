package edu.nadia.cursova.dao.manager.impls;

import edu.nadia.cursova.dao.manager.interfaces.IManagerDao;
import edu.nadia.cursova.dataSet.DataSet;
import edu.nadia.cursova.model.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class ManagerDaoImplFake implements IManagerDao {
    @Autowired
    DataSet dataSet;

    @Override
    public Manager save(Manager manager) {
        return null;
    }

    @Override
    public Manager get(String id) {
        return null;
    }

    @Override
    public List<Manager> getAll() {
        return dataSet.getManager();
    }

    @Override
    public Manager edit(Manager manager) {
        return null;
    }

    @Override
    public Manager delete(String id) {
        return null;
    }
}
