package edu.nadia.cursova.form;

import java.time.LocalDateTime;

public class OrderForm {
    private String externalCommunicationWithNomenclature;
    private String numberOfGoods;
    private String externalCommunicationWithSupplier;
    private String externalCommunicationWithManagers;
    private String price;
    private String description;

    public OrderForm() {
    }

    public OrderForm(String externalCommunicationWithNomenclature, String numberOfGoods, String externalCommunicationWithSupplier, String externalCommunicationWithManagers, String price, String description) {
        this.externalCommunicationWithNomenclature = externalCommunicationWithNomenclature;
        this.numberOfGoods = numberOfGoods;
        this.externalCommunicationWithSupplier = externalCommunicationWithSupplier;
        this.externalCommunicationWithManagers = externalCommunicationWithManagers;
        this.price = price;
        this.description = description;
    }

    public String getExternalCommunicationWithNomenclature() {
        return externalCommunicationWithNomenclature;
    }

    public void setExternalCommunicationWithNomenclature(String externalCommunicationWithNomenclature) {
        this.externalCommunicationWithNomenclature = externalCommunicationWithNomenclature;
    }

    public String getNumberOfGoods() {
        return numberOfGoods;
    }

    public void setNumberOfGoods(String numberOfGoods) {
        this.numberOfGoods = numberOfGoods;
    }

    public String getExternalCommunicationWithSupplier() {
        return externalCommunicationWithSupplier;
    }

    public void setExternalCommunicationWithSupplier(String externalCommunicationWithSupplier) {
        this.externalCommunicationWithSupplier = externalCommunicationWithSupplier;
    }

    public String getExternalCommunicationWithManagers() {
        return externalCommunicationWithManagers;
    }

    public void setExternalCommunicationWithManagers(String externalCommunicationWithManagers) {
        this.externalCommunicationWithManagers = externalCommunicationWithManagers;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "OrderForm{" +
                "externalCommunicationWithNomenclature='" + externalCommunicationWithNomenclature + '\'' +
                ", numberOfGoods='" + numberOfGoods + '\'' +
                ", externalCommunicationWithSupplier='" + externalCommunicationWithSupplier + '\'' +
                ", externalCommunicationWithManagers='" + externalCommunicationWithManagers + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
