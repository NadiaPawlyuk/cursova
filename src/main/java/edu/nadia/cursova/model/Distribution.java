package edu.nadia.cursova.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
public class Distribution {
    //Розподіл
    @Id
    private String id;
    private DirectoryOfGoodsNomenclature externalCommunicationWithTheNomenclature;
    private String numberOfGoods;
    private String price;
    private Outlet externalCommunicationWithTheOutlet;
    private LocalDateTime dateOfCreation;
    private LocalDateTime dateOfModified;
    private String description;

    public Distribution() {
    }

    public Distribution(String id, DirectoryOfGoodsNomenclature externalCommunicationWithTheNomenclature, String numberOfGoods, String price, Outlet externalCommunicationWithTheOutlet, LocalDateTime dateOfCreation, LocalDateTime dateOfModified, String description) {
        this.id = id;
        this.externalCommunicationWithTheNomenclature = externalCommunicationWithTheNomenclature;
        this.numberOfGoods = numberOfGoods;
        this.price = price;
        this.externalCommunicationWithTheOutlet = externalCommunicationWithTheOutlet;
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

    public DirectoryOfGoodsNomenclature getExternalCommunicationWithTheNomenclature() {
        return externalCommunicationWithTheNomenclature;
    }

    public void setExternalCommunicationWithTheNomenclature(DirectoryOfGoodsNomenclature externalCommunicationWithTheNomenclature) {
        this.externalCommunicationWithTheNomenclature = externalCommunicationWithTheNomenclature;
    }

    public Outlet getExternalCommunicationWithTheOutlet() {
        return externalCommunicationWithTheOutlet;
    }

    public void setExternalCommunicationWithTheOutlet(Outlet externalCommunicationWithTheOutlet) {
        this.externalCommunicationWithTheOutlet = externalCommunicationWithTheOutlet;
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
        return "Distribution{" +
                "id=" + id +
                ", externalCommunicationWithTheNomenclature=" + externalCommunicationWithTheNomenclature +
                ", numberOfGoods=" + numberOfGoods +
                ", price=" + price +
                ", externalCommunicationWithTheOutlet=" + externalCommunicationWithTheOutlet +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", dateOfModified='" + dateOfModified + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
