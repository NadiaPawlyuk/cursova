package edu.nadia.cursova.dao.accountingForBuyers.interfaces;

import edu.nadia.cursova.model.AccountingForBuyers;

import java.util.List;

public interface IAccountingForBuyersDao {
    AccountingForBuyers save(AccountingForBuyers accountingForBuyers);
    AccountingForBuyers get(String id);
    List<AccountingForBuyers> getAll();
    AccountingForBuyers edit(AccountingForBuyers accountingForBuyers);
    AccountingForBuyers delete(String id);
}
