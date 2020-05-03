package edu.nadia.cursova.service.accountingForGoodsSold.interfaces;

import edu.nadia.cursova.model.AccountingForGoodsSold;

import java.util.List;

public interface IAccountingForGoodsSoldService {
    AccountingForGoodsSold save(AccountingForGoodsSold accountingForGoodsSold);
    AccountingForGoodsSold get(String id);
    List<AccountingForGoodsSold> getAll();
    AccountingForGoodsSold edit(AccountingForGoodsSold accountingForGoodsSold);
    AccountingForGoodsSold delete(String id);
}
