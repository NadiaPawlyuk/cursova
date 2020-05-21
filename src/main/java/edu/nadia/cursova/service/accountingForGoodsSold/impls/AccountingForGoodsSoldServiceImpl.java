package edu.nadia.cursova.service.accountingForGoodsSold.impls;

import edu.nadia.cursova.dao.repository.AccountingForGoodsSoldRepository;
import edu.nadia.cursova.model.AccountingForBuyers;
import edu.nadia.cursova.model.AccountingForGoodsSold;
import edu.nadia.cursova.service.accountingForBuyers.impls.AccountingForBuyersServiceImpl;
import edu.nadia.cursova.service.accountingForGoodsSold.interfaces.IAccountingForGoodsSoldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        return repository.findById(id).orElse(null);
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

    public List<AccountingForGoodsSold> search(String word){
        List<AccountingForGoodsSold> found = this.getAll().stream()
                .filter(accountingForGoodsSold -> accountingForGoodsSold.getNameOfGoods().contains(word))
                .collect(Collectors.toList());
        return found;
    }

    public List<AccountingForGoodsSold> sortByName(List<AccountingForGoodsSold> people){

        Collections.sort(people, new AccountingForGoodsSoldServiceImpl.AccountingForGoodsSoldNameComparator());

        return people;
    }

    private class AccountingForGoodsSoldNameComparator implements Comparator<AccountingForGoodsSold> {
        public int compare(AccountingForGoodsSold p1, AccountingForGoodsSold p2) {
            return p1.getNameOfGoods().compareTo(p2.getNameOfGoods());
        }
    }
}
