package edu.nadia.cursova.service.accountingForBuyers.impls;

import edu.nadia.cursova.dao.repository.AccountingForBuyersRepository;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.service.accountingForBuyers.interfaces.IAccountingForBuyersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountingForBuyersServiceImpl implements IAccountingForBuyersService {
    @Autowired
    AccountingForBuyersRepository repository;

    @PostConstruct
    void init(){
        //repository.saveAll(list);
    }

    @Override
    public AccountingForBuyers save(AccountingForBuyers accountingForBuyers) {
        accountingForBuyers.setDateOfCreation(LocalDateTime.now());
        accountingForBuyers.setDateOfModified(LocalDateTime.now());
        return repository.save(accountingForBuyers);
    }

    @Override
    public AccountingForBuyers get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<AccountingForBuyers> getAll() {
        return repository.findAll();
    }

    @Override
    public AccountingForBuyers edit(AccountingForBuyers accountingForBuyers) {
        accountingForBuyers.setDateOfModified(LocalDateTime.now());
        return repository.save(accountingForBuyers);
    }

    @Override
    public AccountingForBuyers delete(String id) {
        AccountingForBuyers accountingForBuyers = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return accountingForBuyers;
    }

    public List<AccountingForBuyers> search(String word){
        List<AccountingForBuyers> found = this.getAll().stream()
                .filter(accountingForBuyers -> accountingForBuyers.getInitials().contains(word))
                .collect(Collectors.toList());
        return found;
    }


    public List<AccountingForBuyers> sortByName(List<AccountingForBuyers> people){

        Collections.sort(people, new AccountingForBuyersNameComparator());

        return people;
    }

    private class AccountingForBuyersNameComparator implements Comparator<AccountingForBuyers> {
        public int compare(AccountingForBuyers p1, AccountingForBuyers p2) {
            return p1.getInitials().compareTo(p2.getInitials());
        }
    }


}
