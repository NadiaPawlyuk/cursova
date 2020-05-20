package edu.nadia.cursova.form;

import java.time.LocalDateTime;

public class ProductsInOutletsForm {
    private String externalCommunicationWithTheNomenclature;
    private String price;
    private String numberOfGoods;
    private String outlet;
    private String description;

    public ProductsInOutletsForm() {
    }

    public ProductsInOutletsForm(String externalCommunicationWithTheNomenclature, String price, String numberOfGoods, String outlet, String description) {
        this.externalCommunicationWithTheNomenclature = externalCommunicationWithTheNomenclature;
        this.price = price;
        this.numberOfGoods = numberOfGoods;
        this.outlet = outlet;
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

    public String getOutlet() {
        return outlet;
    }

    public void setOutlet(String outlet) {
        this.outlet = outlet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ProductsInOutletsForm{" +
                "externalCommunicationWithTheNomenclature='" + externalCommunicationWithTheNomenclature + '\'' +
                ", price='" + price + '\'' +
                ", numberOfGoods='" + numberOfGoods + '\'' +
                ", outlet='" + outlet + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
