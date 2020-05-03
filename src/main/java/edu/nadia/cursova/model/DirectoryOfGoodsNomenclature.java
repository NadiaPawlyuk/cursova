package edu.nadia.cursova.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Document
public class DirectoryOfGoodsNomenclature {
    //Номенклатура
    @Id
    private String id;
    private String theNameOfTheProduct;
    private LocalDateTime dateOfCreation;
    private LocalDateTime dateOfModified;
    private String description;

    public DirectoryOfGoodsNomenclature() {
    }

    public DirectoryOfGoodsNomenclature(String id, String theNameOfTheProduct, LocalDateTime dateOfCreation, LocalDateTime dateOfModified, String description) {
        this.id = id;
        this.theNameOfTheProduct = theNameOfTheProduct;
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

    public String getTheNameOfTheProduct() {
        return theNameOfTheProduct;
    }

    public void setTheNameOfTheProduct(String theNameOfTheProduct) {
        this.theNameOfTheProduct = theNameOfTheProduct;
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
        return "DirectoryOfGoodsNomenclature{" +
                "id=" + id +
                ", theNameOfTheProduct='" + theNameOfTheProduct + '\'' +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", dateOfModified='" + dateOfModified + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
