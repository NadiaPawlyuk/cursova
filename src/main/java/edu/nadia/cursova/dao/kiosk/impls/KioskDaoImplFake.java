package edu.nadia.cursova.dao.kiosk.impls;

import edu.nadia.cursova.dao.kiosk.interfaces.IKioskDao;
import edu.nadia.cursova.dataSet.DataSet;
import edu.nadia.cursova.model.Kiosk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class KioskDaoImplFake implements IKioskDao {
    @Autowired
    DataSet dataSet;

    @Override
    public Kiosk save(Kiosk kiosk) {
        return null;
    }

    @Override
    public Kiosk get(String id) {
        return null;
    }

    @Override
    public List<Kiosk> getAll() {
        return dataSet.getKiosk();
    }

    @Override
    public Kiosk edit(Kiosk kiosk) {
        return null;
    }

    @Override
    public Kiosk delete(String id) {
        return null;
    }
}
