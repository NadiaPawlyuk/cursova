package edu.nadia.cursova.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
public class ProductsFromSuppliers {
    //Товари у постачальників
    @Id
    private String id;
    private DirectoryOfGoodsNomenclature externalCommunicationWithTheNomenclature;
    private String price;
    private String numberOfGoods;
    private Supplier externalCommunicationWithTheSupplier;
    private LocalDateTime dateOfCreation;
    private LocalDateTime dateOfModified;
    private String description;

    public ProductsFromSuppliers() {
    }

    public ProductsFromSuppliers(String id, DirectoryOfGoodsNomenclature externalCommunicationWithTheNomenclature, String price, String numberOfGoods, Supplier externalCommunicationWithTheSupplier, LocalDateTime dateOfCreation, LocalDateTime dateOfModified, String description) {
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

    public DirectoryOfGoodsNomenclature getExternalCommunicationWithTheNomenclature() {
        return externalCommunicationWithTheNomenclature;
    }

    public void setExternalCommunicationWithTheNomenclature(DirectoryOfGoodsNomenclature externalCommunicationWithTheNomenclature) {
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

    public Supplier getExternalCommunicationWithTheSupplier() {
        return externalCommunicationWithTheSupplier;
    }

    public void setExternalCommunicationWithTheSupplier(Supplier externalCommunicationWithTheSupplier) {
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
        return "ProductsFromSuppliers{" +
                "id='" + id + '\'' +
                ", externalCommunicationWithTheNomenclature='" + externalCommunicationWithTheNomenclature + '\'' +
                ", price='" + price + '\'' +
                ", numberOfGoods='" + numberOfGoods + '\'' +
                ", externalCommunicationWithTheSupplier='" + externalCommunicationWithTheSupplier + '\'' +
                ", dateOfCreation=" + dateOfCreation +
                ", dateOfModified=" + dateOfModified +
                ", description='" + description + '\'' +
                '}';
    }
}
