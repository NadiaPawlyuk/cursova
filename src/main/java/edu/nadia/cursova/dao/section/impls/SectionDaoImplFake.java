package edu.nadia.cursova.dao.section.impls;

import edu.nadia.cursova.dao.section.interfaces.ISectionDao;
import edu.nadia.cursova.dataSet.DataSet;
import edu.nadia.cursova.model.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class SectionDaoImplFake implements ISectionDao {
    @Autowired
    DataSet dataSet;

    @Override
    public Section save(Section section) {
        return null;
    }

    @Override
    public Section get(String id) {
        return null;
    }

    @Override
    public List<Section> getAll() {
        return dataSet.getSection();
    }

    @Override
    public Section edit(Section section) {
        return null;
    }

    @Override
    public Section delete(String id) {
        return null;
    }
}
