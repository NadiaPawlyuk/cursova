package edu.nadia.cursova.dao.accountingForBuyers.impls;

import edu.nadia.cursova.dao.accountingForBuyers.interfaces.IAccountingForBuyersDao;
import edu.nadia.cursova.dataSet.DataSet;
import edu.nadia.cursova.model.AccountingForBuyers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class AccountingForBuyersDaoImplFake implements IAccountingForBuyersDao {
    @Autowired
    DataSet dataSet;

    @Override
    public AccountingForBuyers save(AccountingForBuyers accountingForBuyers) {
        return null;
    }

    @Override
    public AccountingForBuyers get(String id) {
        return null;
    }

    @Override
    public List<AccountingForBuyers> getAll() {
        return dataSet.getAccountingForBuyers();
    }

    @Override
    public AccountingForBuyers edit(AccountingForBuyers accountingForBuyers) {
        return null;
    }

    @Override
    public AccountingForBuyers delete(String id) {
        return null;
    }
}
