package edu.nadia.cursova.service.accountingForGoodsSold.impls;

import edu.nadia.cursova.dao.accountingForGoodsSold.impls.AccountingForGoodsSoldDaoImplFake;
import edu.nadia.cursova.dao.repository.AccountingForGoodsSoldRepository;
import edu.nadia.cursova.model.AccountingForGoodsSold;
import edu.nadia.cursova.service.accountingForGoodsSold.interfaces.IAccountingForGoodsSoldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service
public class AccountingForGoodsSoldServiceImpl implements IAccountingForGoodsSoldService {
    @Autowired
    AccountingForGoodsSoldDaoImplFake dao;

    //@Autowired
    //AccountingForGoodsSoldRepository repository;

    @PostConstruct
    void init(){
        List<AccountingForGoodsSold> list = dao.getAll();

       //repository.saveAll(list);
    }
    @Override
    public AccountingForGoodsSold save(AccountingForGoodsSold accountingForGoodsSold) {
        return null;
    }

    @Override
    public AccountingForGoodsSold get(String id) {
        return dao.getAll().stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<AccountingForGoodsSold> getAll() {
        return dao.getAll();
        //return repository.findAll();
    }

    @Override
    public AccountingForGoodsSold edit(AccountingForGoodsSold accountingForGoodsSold) {
        return null;
    }

    @Override
    public AccountingForGoodsSold delete(String id) {
        AccountingForGoodsSold accountingForGoodsSold = this.get(id);
        dao.getAll().remove(accountingForGoodsSold);
        return accountingForGoodsSold;
        //  repository.deleteById(id);
        //return repository.findById(id).orElse(null);
    }
}
