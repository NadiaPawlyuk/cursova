package edu.nadia.cursova.dao.accountingForGoodsSold.impls;

import edu.nadia.cursova.dao.accountingForGoodsSold.interfaces.IAccountingForGoodsSoldDao;
import edu.nadia.cursova.dataSet.DataSet;
import edu.nadia.cursova.model.AccountingForGoodsSold;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class AccountingForGoodsSoldDaoImplFake implements IAccountingForGoodsSoldDao {
    @Autowired
    DataSet dataSet;

    @Override
    public AccountingForGoodsSold save(AccountingForGoodsSold accountingForGoodsSold) {
        return null;
    }

    @Override
    public AccountingForGoodsSold get(String id) {
        return null;
    }

    @Override
    public List<AccountingForGoodsSold> getAll() {
        return dataSet.getAccountingForGoodsSold();
    }

    @Override
    public AccountingForGoodsSold edit(AccountingForGoodsSold accountingForGoodsSold) {
        return null;
    }

    @Override
    public AccountingForGoodsSold delete(String id) {
        return null;
    }
}
