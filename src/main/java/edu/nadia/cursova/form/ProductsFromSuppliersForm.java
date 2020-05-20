package edu.nadia.cursova.form;

import java.time.LocalDateTime;

public class ProductsFromSuppliersForm {
    private String externalCommunicationWithTheNomenclature;
    private String price;
    private String numberOfGoods;
    private String externalCommunicationWithTheSupplier;
    private String description;

    public ProductsFromSuppliersForm() {
    }

    public ProductsFromSuppliersForm(String externalCommunicationWithTheNomenclature, String price, String numberOfGoods, String externalCommunicationWithTheSupplier, String description) {
        this.externalCommunicationWithTheNomenclature = externalCommunicationWithTheNomenclature;
        this.price = price;
        this.numberOfGoods = numberOfGoods;
        this.externalCommunicationWithTheSupplier = externalCommunicationWithTheSupplier;
        this.description = description;
    }

    public String getExternalCommunicationWithTheNomenclature() {
        return externalCommunicationWithTheNomenclature;
    }

    public void setExternalCommunicationWithTheNomenclature(String externalCommunicationWithTheNomenclature) {
        this.externalCommunicationWithTheNomenclature = externalCommunicationWithTheNomenclature;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNumberOfGoods() {
        return numberOfGoods;
    }

    public void setNumberOfGoods(String numberOfGoods) {
        this.numberOfGoods = numberOfGoods;
    }

    public String getExternalCommunicationWithTheSupplier() {
        return externalCommunicationWithTheSupplier;
    }

    public void setExternalCommunicationWithTheSupplier(String externalCommunicationWithTheSupplier) {
        this.externalCommunicationWithTheSupplier = externalCommunicationWithTheSupplier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ProductsFromSuppliersForm{" +
                "externalCommunicationWithTheNomenclature='" + externalCommunicationWithTheNomenclature + '\'' +
                ", price='" + price + '\'' +
                ", numberOfGoods='" + numberOfGoods + '\'' +
                ", externalCommunicationWithTheSupplier='" + externalCommunicationWithTheSupplier + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
