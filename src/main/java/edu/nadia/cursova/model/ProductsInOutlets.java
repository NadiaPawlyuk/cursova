package edu.nadia.cursova.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
public class ProductsInOutlets {
    //Товари у торговельних точках
    @Id
    private String id;
    private String externalCommunicationWithTheNomenclature;
    private String price;
    private String numberOfGoods;
    private String externalCommunicationWithTheSupplier;
    private LocalDateTime dateOfCreation;
    private LocalDateTime dateOfModified;
    private String description;

    public ProductsInOutlets() {
    }

    public ProductsInOutlets(String id, String externalCommunicationWithTheNomenclature, String price, String numberOfGoods, String externalCommunicationWithTheSupplier, LocalDateTime dateOfCreation, LocalDateTime dateOfModified, String description) {
        this.id = id;
        this.externalCommunicationWithTheNomenclature = externalCommunicationWithTheNomenclature;
        this.price = price;
        this.numberOfGoods = numberOfGoods;
        this.externalCommunicationWithTheSupplier = externalCommunicationWithTheSupplier;
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
        return "ProductsInOutlets{" +
                "id=" + id +
                ", externalCommunicationWithTheNomenclature=" + externalCommunicationWithTheNomenclature +
                ", price=" + price +
                ", numberOfGoods=" + numberOfGoods +
                ", externalCommunicationWithTheSupplier=" + externalCommunicationWithTheSupplier +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", dateOfChange='" + dateOfModified + '\'' +
                '}';
    }
}
