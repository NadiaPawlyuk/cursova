package edu.nadia.cursova.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
public class Order {
    //Замовлення
    @Id
    private String id;
    private String externalCommunicationWithNomenclature;
    private String numberOfGoods;
    private String externalCommunicationWithSupplier;
    private String externalCommunicationWithManagers;
    private String price;
    private LocalDateTime dateOfCreation;
    private LocalDateTime dateOfModified;
    private String description;

    public Order() {
    }

    public Order(String id, String externalCommunicationWithNomenclature, String numberOfGoods, String externalCommunicationWithSupplier, String externalCommunicationWithManagers, String price, LocalDateTime dateOfCreation, LocalDateTime dateOfModified, String description) {
        this.id = id;
        this.externalCommunicationWithNomenclature = externalCommunicationWithNomenclature;
        this.numberOfGoods = numberOfGoods;
        this.externalCommunicationWithSupplier = externalCommunicationWithSupplier;
        this.externalCommunicationWithManagers = externalCommunicationWithManagers;
        this.price = price;
        this.dateOfCreation = dateOfCreation;
        this.dateOfModified = dateOfModified;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return "Order{" +
                "id=" + id +
                ", externalCommunicationWithNomenclature='" + externalCommunicationWithNomenclature + '\'' +
                ", numberOfGoods='" + numberOfGoods + '\'' +
                ", externalCommunicationWithSupplier='" + externalCommunicationWithSupplier + '\'' +
                ", externalCommunicationWithManagers='" + externalCommunicationWithManagers + '\'' +
                ", price=" + price +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", dateOfModified='" + dateOfModified + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
