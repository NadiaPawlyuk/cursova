package edu.nadia.cursova.form;

import java.time.LocalDateTime;

public class DistributionForm {
    private String externalCommunicationWithTheNomenclature;
    private String numberOfGoods;
    private String price;
    private String externalCommunicationWithTheOutlet;
    private String description;

    public DistributionForm() {
    }

    public DistributionForm(String externalCommunicationWithTheNomenclature, String numberOfGoods, String price, String externalCommunicationWithTheOutlet, String description) {
        this.externalCommunicationWithTheNomenclature = externalCommunicationWithTheNomenclature;
        this.numberOfGoods = numberOfGoods;
        this.price = price;
        this.externalCommunicationWithTheOutlet = externalCommunicationWithTheOutlet;
        this.description = description;
    }

    public String getExternalCommunicationWithTheNomenclature() {
        return externalCommunicationWithTheNomenclature;
    }

    public void setExternalCommunicationWithTheNomenclature(String externalCommunicationWithTheNomenclature) {
        this.externalCommunicationWithTheNomenclature = externalCommunicationWithTheNomenclature;
    }

    public String getNumberOfGoods() {
        return numberOfGoods;
    }

    public void setNumberOfGoods(String numberOfGoods) {
        this.numberOfGoods = numberOfGoods;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getExternalCommunicationWithTheOutlet() {
        return externalCommunicationWithTheOutlet;
    }

    public void setExternalCommunicationWithTheOutlet(String externalCommunicationWithTheOutlet) {
        this.externalCommunicationWithTheOutlet = externalCommunicationWithTheOutlet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "DistributionForm{" +
                "externalCommunicationWithTheNomenclature='" + externalCommunicationWithTheNomenclature + '\'' +
                ", numberOfGoods='" + numberOfGoods + '\'' +
                ", price='" + price + '\'' +
                ", externalCommunicationWithTheOutlet='" + externalCommunicationWithTheOutlet + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
