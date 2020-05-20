package edu.nadia.cursova.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
public class OrderToTheSupplier {
    //Заява на замовлення постачальникові
    @Id
    private String id;
    private String theNameOfTheProduct;
    private String numberOfGoods;
    private Outlet externalCommunicationWithNomenclature;
    private LocalDateTime dateOfCreation;
    private LocalDateTime dateOfModified;
    private String description;

    public OrderToTheSupplier() {
    }

    public OrderToTheSupplier(String id, String theNameOfTheProduct, String numberOfGoods, Outlet externalCommunicationWithNomenclature, LocalDateTime dateOfCreation, LocalDateTime dateOfModified, String description) {
        this.id = id;
        this.theNameOfTheProduct = theNameOfTheProduct;
        this.numberOfGoods = numberOfGoods;
        this.externalCommunicationWithNomenclature = externalCommunicationWithNomenclature;
        this.dateOfCreation = dateOfCreation;
        this.dateOfModified = dateOfModified;
        this.description = description;
    }

    public Outlet getExternalCommunicationWithNomenclature() {
        return externalCommunicationWithNomenclature;
    }

    public void setExternalCommunicationWithNomenclature(Outlet externalCommunicationWithNomenclature) {
        this.externalCommunicationWithNomenclature = externalCommunicationWithNomenclature;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "OrderToTheSupplier{" +
                "id=" + id +
                ", theNameOfTheProduct='" + theNameOfTheProduct + '\'' +
                ", numberOfGoods='" + numberOfGoods + '\'' +
                ", externalCommunicationWithNomenclature='" + externalCommunicationWithNomenclature + '\'' +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", dateOfModified='" + dateOfModified + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
