package edu.nadia.cursova.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
public class AccountingForGoodsSold {
    //Облік проданих товарів
    @Id
    private String id;
    private String offtake;
    private String nameOfGoods;
    private DirectoryOfGoodsNomenclature externalCommunicationWithTheDirectoryOfNomenclatureGoods;
    private Seller externalCommunicationWithTheSeller;
    private AccountingForBuyers externalCommunicationWithCustomerAccounting;
    private LocalDateTime dateOfCreation;
    private LocalDateTime dateOfModified;
    private String description;

    public AccountingForGoodsSold() {
    }

    public AccountingForGoodsSold(String id, String offtake, String nameOfGoods, DirectoryOfGoodsNomenclature externalCommunicationWithTheDirectoryOfNomenclatureGoods, Seller externalCommunicationWithTheSeller, AccountingForBuyers externalCommunicationWithCustomerAccounting, LocalDateTime dateOfCreation, LocalDateTime dateOfModified, String description) {
        this.id = id;
        this.offtake = offtake;
        this.nameOfGoods = nameOfGoods;
        this.externalCommunicationWithTheDirectoryOfNomenclatureGoods = externalCommunicationWithTheDirectoryOfNomenclatureGoods;
        this.externalCommunicationWithTheSeller = externalCommunicationWithTheSeller;
        this.externalCommunicationWithCustomerAccounting = externalCommunicationWithCustomerAccounting;
        this.dateOfCreation = dateOfCreation;
        this.dateOfModified = dateOfModified;
        this.description = description;
    }

    public String getOfftake() {
        return offtake;
    }

    public void setOfftake(String offtake) {
        this.offtake = offtake;
    }

    public DirectoryOfGoodsNomenclature getExternalCommunicationWithTheDirectoryOfNomenclatureGoods() {
        return externalCommunicationWithTheDirectoryOfNomenclatureGoods;
    }

    public void setExternalCommunicationWithTheDirectoryOfNomenclatureGoods(DirectoryOfGoodsNomenclature externalCommunicationWithTheDirectoryOfNomenclatureGoods) {
        this.externalCommunicationWithTheDirectoryOfNomenclatureGoods = externalCommunicationWithTheDirectoryOfNomenclatureGoods;
    }

    public Seller getExternalCommunicationWithTheSeller() {
        return externalCommunicationWithTheSeller;
    }

    public void setExternalCommunicationWithTheSeller(Seller externalCommunicationWithTheSeller) {
        this.externalCommunicationWithTheSeller = externalCommunicationWithTheSeller;
    }

    public AccountingForBuyers getExternalCommunicationWithCustomerAccounting() {
        return externalCommunicationWithCustomerAccounting;
    }

    public void setExternalCommunicationWithCustomerAccounting(AccountingForBuyers externalCommunicationWithCustomerAccounting) {
        this.externalCommunicationWithCustomerAccounting = externalCommunicationWithCustomerAccounting;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDateTime dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public LocalDateTime getDateOfModified() {
        return dateOfModified;
    }

    public void setDateOfModified(LocalDateTime dateOfModified) {
        this.dateOfModified = dateOfModified;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNameOfGoods() {
        return nameOfGoods;
    }

    public void setNameOfGoods(String nameOfGoods) {
        this.nameOfGoods = nameOfGoods;
    }

    @Override
    public String toString() {
        return "AccountingForGoodsSold{" +
                "id='" + id + '\'' +
                ", offtake='" + offtake + '\'' +
                ", nameOfGoods='" + nameOfGoods + '\'' +
                ", externalCommunicationWithTheDirectoryOfNomenclatureGoods=" + externalCommunicationWithTheDirectoryOfNomenclatureGoods +
                ", externalCommunicationWithTheSeller=" + externalCommunicationWithTheSeller +
                ", externalCommunicationWithCustomerAccounting=" + externalCommunicationWithCustomerAccounting +
                ", dateOfCreation=" + dateOfCreation +
                ", dateOfModified=" + dateOfModified +
                ", description='" + description + '\'' +
                '}';
    }
}