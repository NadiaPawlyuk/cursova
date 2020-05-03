package edu.nadia.cursova.service.accountingForBuyers.impls;

import edu.nadia.cursova.dao.accountingForBuyers.impls.AccountingForBuyersDaoImplFake;
import edu.nadia.cursova.dao.accountingForBuyers.interfaces.IAccountingForBuyersDao;
import edu.nadia.cursova.dao.repository.AccountingForBuyersRepository;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.service.accountingForBuyers.interfaces.IAccountingForBuyersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class AccountingForBuyersServiceImpl implements IAccountingForBuyersService {
    @Autowired
    AccountingForBuyersDaoImplFake dao;

    @Autowired
    AccountingForBuyersRepository repository;

    @PostConstruct
    void init(){
        List<AccountingForBuyers> list = dao.getAll();

        repository.saveAll(list);
    }

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
        return repository.findAll();
    }

    @Override
    public AccountingForBuyers edit(AccountingForBuyers accountingForBuyers) {
        return null;
    }

    @Override
    public AccountingForBuyers delete(String id) {

        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
