package edu.nadia.cursova.service.accountingForGoodsSold.impls;

import edu.nadia.cursova.dao.repository.AccountingForGoodsSoldRepository;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.AccountingForGoodsSold;
import edu.nadia.cursova.service.accountingForGoodsSold.interfaces.IAccountingForGoodsSoldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class AccountingForGoodsSoldServiceImpl implements IAccountingForGoodsSoldService {
    @Autowired
    AccountingForGoodsSoldRepository repository;

    @PostConstruct
    void init(){
       //repository.saveAll(list);
    }
    @Override
    public AccountingForGoodsSold save(AccountingForGoodsSold accountingForGoodsSold) {
        accountingForGoodsSold.setDateOfCreation(LocalDateTime.now());
        accountingForGoodsSold.setDateOfModified(LocalDateTime.now());
        return repository.save(accountingForGoodsSold);
    }

    @Override
    public AccountingForGoodsSold get(String id) {
        return null;
    }

    @Override
    public List<AccountingForGoodsSold> getAll() {
        return repository.findAll();
    }

    @Override
    public AccountingForGoodsSold edit(AccountingForGoodsSold accountingForGoodsSold) {
        accountingForGoodsSold.setDateOfModified(LocalDateTime.now());
        return repository.save(accountingForGoodsSold);
    }

    @Override
    public AccountingForGoodsSold delete(String id) {
        AccountingForGoodsSold accountingForGoodsSold = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return accountingForGoodsSold;
    }
}
