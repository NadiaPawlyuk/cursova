package edu.nadia.cursova.dao.accountingForGoodsSold.interfaces;

import edu.nadia.cursova.model.AccountingForGoodsSold;

import java.util.List;

public interface IAccountingForGoodsSoldDao {
    AccountingForGoodsSold save(AccountingForGoodsSold accountingForGoodsSold);
    AccountingForGoodsSold get(String id);
    List<AccountingForGoodsSold> getAll();
    AccountingForGoodsSold edit(AccountingForGoodsSold accountingForGoodsSold);
    AccountingForGoodsSold delete(String id);
}
