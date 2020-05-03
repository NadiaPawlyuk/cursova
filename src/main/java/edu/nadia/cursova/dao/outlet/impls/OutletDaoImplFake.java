package edu.nadia.cursova.dao.outlet.impls;

import edu.nadia.cursova.dao.outlet.interfaces.IOutletDao;
import edu.nadia.cursova.dataSet.DataSet;
import edu.nadia.cursova.model.Outlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class OutletDaoImplFake implements IOutletDao {
    @Autowired
    DataSet dataSet;

    @Override
    public Outlet save(Outlet outlet) {
        return null;
    }

    @Override
    public Outlet get(String id) {
        return null;
    }

    @Override
    public List<Outlet> getAll() {
        return dataSet.getOutlet();
    }

    @Override
    public Outlet edit(Outlet outlet) {
        return null;
    }

    @Override
    public Outlet delete(String id) {
        return null;
    }
}
