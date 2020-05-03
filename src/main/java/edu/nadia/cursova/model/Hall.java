package edu.nadia.cursova.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
public class Hall {
    //Зал
    @Id
    private String id;
    private String nameOfTheHall;
    private String numberOfSellers;
    private String externalCommunicationWithDepartmentStore;
    private LocalDateTime dateOfCreation;
    private LocalDateTime dateOfModified;
    private String description;

    public Hall() {
    }

    public Hall(String id, String nameOfTheHall, String numberOfSellers, String externalCommunicationWithDepartmentStore, LocalDateTime dateOfCreation, LocalDateTime dateOfModified, String description) {
        this.id = id;
        this.nameOfTheHall = nameOfTheHall;
        this.numberOfSellers = numberOfSellers;
        this.externalCommunicationWithDepartmentStore = externalCommunicationWithDepartmentStore;
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

    public String getNameOfTheHall() {
        return nameOfTheHall;
    }

    public void setNameOfTheHall(String nameOfTheHall) {
        this.nameOfTheHall = nameOfTheHall;
    }

    public String getNumberOfSellers() {
        return numberOfSellers;
    }

    public void setNumberOfSellers(String numberOfSellers) {
        this.numberOfSellers = numberOfSellers;
    }

    public String getExternalCommunicationWithDepartmentStore() {
        return externalCommunicationWithDepartmentStore;
    }

    public void setExternalCommunicationWithDepartmentStore(String externalCommunicationWithDepartmentStore) {
        this.externalCommunicationWithDepartmentStore = externalCommunicationWithDepartmentStore;
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
        return "Hall{" +
                "id=" + id +
                ", nameOfTheHall='" + nameOfTheHall + '\'' +
                ", numberOfSellers=" + numberOfSellers +
                ", externalCommunicationWithDepartmentStore=" + externalCommunicationWithDepartmentStore +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", dateOfModified='" + dateOfModified + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
