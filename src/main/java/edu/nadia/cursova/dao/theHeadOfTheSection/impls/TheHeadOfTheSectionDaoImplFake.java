package edu.nadia.cursova.dao.theHeadOfTheSection.impls;

import edu.nadia.cursova.dao.theHeadOfTheSection.interfaces.ITheHeadOfTheSectionDao;
import edu.nadia.cursova.dataSet.DataSet;
import edu.nadia.cursova.model.TheHeadOfTheSection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class TheHeadOfTheSectionDaoImplFake implements ITheHeadOfTheSectionDao {
    @Autowired
    DataSet dataSet;

    @Override
    public TheHeadOfTheSection save(TheHeadOfTheSection theHeadOfTheSection) {
        return null;
    }

    @Override
    public TheHeadOfTheSection get(String id) {
        return null;
    }

    @Override
    public List<TheHeadOfTheSection> getAll() {
        return dataSet.getTheHeadOfTheSection();
    }

    @Override
    public TheHeadOfTheSection edit(TheHeadOfTheSection theHeadOfTheSection) {
        return null;
    }

    @Override
    public TheHeadOfTheSection delete(String id) {
        return null;
    }
}
