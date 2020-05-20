package edu.nadia.cursova.form;

import java.time.LocalDateTime;

public class OrderToTheSupplierForm {
    private String theNameOfTheProduct;
    private String numberOfGoods;
    private String externalCommunicationWithNomenclature;
    private String description;

    public OrderToTheSupplierForm() {
    }

    public OrderToTheSupplierForm(String theNameOfTheProduct, String numberOfGoods, String externalCommunicationWithNomenclature, String description) {
        this.theNameOfTheProduct = theNameOfTheProduct;
        this.numberOfGoods = numberOfGoods;
        this.externalCommunicationWithNomenclature = externalCommunicationWithNomenclature;
        this.description = description;
    }

    public String getTheNameOfTheProduct() {
        return theNameOfTheProduct;
    }

    public void setTheNameOfTheProduct(String theNameOfTheProduct) {
        this.theNameOfTheProduct = theNameOfTheProduct;
    }

    public String getNumberOfGoods() {
        return numberOfGoods;
    }

    public void setNumberOfGoods(String numberOfGoods) {
        this.numberOfGoods = numberOfGoods;
    }

    public String getExternalCommunicationWithNomenclature() {
        return externalCommunicationWithNomenclature;
    }

    public void setExternalCommunicationWithNomenclature(String externalCommunicationWithNomenclature) {
        this.externalCommunicationWithNomenclature = externalCommunicationWithNomenclature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "OrderToTheSupplierForm{" +
                "theNameOfTheProduct='" + theNameOfTheProduct + '\'' +
                ", numberOfGoods='" + numberOfGoods + '\'' +
                ", externalCommunicationWithNomenclature='" + externalCommunicationWithNomenclature + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
