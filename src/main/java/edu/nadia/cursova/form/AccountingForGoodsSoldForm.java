package edu.nadia.cursova.form;

import java.time.LocalDateTime;

public class AccountingForGoodsSoldForm {
    private String offtake;
    private String nameOfGoods;
    private String externalCommunicationWithTheDirectoryOfNomenclatureGoods;
    private String externalCommunicationWithTheSeller;
    private String externalCommunicationWithCustomerAccounting;
    private String description;

    public AccountingForGoodsSoldForm() {
    }

    public AccountingForGoodsSoldForm(String offtake, String nameOfGoods, String externalCommunicationWithTheDirectoryOfNomenclatureGoods, String externalCommunicationWithTheSeller, String externalCommunicationWithCustomerAccounting, String description) {
        this.offtake = offtake;
        this.nameOfGoods = nameOfGoods;
        this.externalCommunicationWithTheDirectoryOfNomenclatureGoods = externalCommunicationWithTheDirectoryOfNomenclatureGoods;
        this.externalCommunicationWithTheSeller = externalCommunicationWithTheSeller;
        this.externalCommunicationWithCustomerAccounting = externalCommunicationWithCustomerAccounting;
        this.description = description;
    }

    public String getNameOfGoods() {
        return nameOfGoods;
    }

    public void setNameOfGoods(String nameOfGoods) {
        this.nameOfGoods = nameOfGoods;
    }

    public String getOfftake() {
        return offtake;
    }

    public void setOfftake(String offtake) {
        this.offtake = offtake;
    }

    public String getExternalCommunicationWithTheDirectoryOfNomenclatureGoods() {
        return externalCommunicationWithTheDirectoryOfNomenclatureGoods;
    }

    public void setExternalCommunicationWithTheDirectoryOfNomenclatureGoods(String externalCommunicationWithTheDirectoryOfNomenclatureGoods) {
        this.externalCommunicationWithTheDirectoryOfNomenclatureGoods = externalCommunicationWithTheDirectoryOfNomenclatureGoods;
    }

    public String getExternalCommunicationWithTheSeller() {
        return externalCommunicationWithTheSeller;
    }

    public void setExternalCommunicationWithTheSeller(String externalCommunicationWithTheSeller) {
        this.externalCommunicationWithTheSeller = externalCommunicationWithTheSeller;
    }

    public String getExternalCommunicationWithCustomerAccounting() {
        return externalCommunicationWithCustomerAccounting;
    }

    public void setExternalCommunicationWithCustomerAccounting(String externalCommunicationWithCustomerAccounting) {
        this.externalCommunicationWithCustomerAccounting = externalCommunicationWithCustomerAccounting;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AccountingForGoodsSoldForm{" +
                "offtake='" + offtake + '\'' +
                ", nameOfGoods='" + nameOfGoods + '\'' +
                ", externalCommunicationWithTheDirectoryOfNomenclatureGoods='" + externalCommunicationWithTheDirectoryOfNomenclatureGoods + '\'' +
                ", externalCommunicationWithTheSeller='" + externalCommunicationWithTheSeller + '\'' +
                ", externalCommunicationWithCustomerAccounting='" + externalCommunicationWithCustomerAccounting + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
