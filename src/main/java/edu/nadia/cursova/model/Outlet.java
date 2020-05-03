package edu.nadia.cursova.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
public class Outlet {
    //Торговельна точка
    @Id
    private String id;
    private String externalCommunicationWithTheDepartmentStore;
    private String externalCommunicationWithTheStore;
    private String externalCommunicationWithTheKiosk;
    private String numberOfManagers;
    private LocalDateTime dateOfCreation;
    private LocalDateTime dateOfModified;
    private String description;

    public Outlet() {
    }

    public Outlet(String id, String externalCommunicationWithTheDepartmentStore, String externalCommunicationWithTheStore, String externalCommunicationWithTheKiosk, String numberOfManagers, LocalDateTime dateOfCreation, LocalDateTime dateOfModified, String description) {
        this.id = id;
        this.externalCommunicationWithTheDepartmentStore = externalCommunicationWithTheDepartmentStore;
        this.externalCommunicationWithTheStore = externalCommunicationWithTheStore;
        this.externalCommunicationWithTheKiosk = externalCommunicationWithTheKiosk;
        this.numberOfManagers = numberOfManagers;
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

    public String getExternalCommunicationWithTheDepartmentStore() {
        return externalCommunicationWithTheDepartmentStore;
    }

    public void setExternalCommunicationWithTheDepartmentStore(String externalCommunicationWithTheDepartmentStore) {
        this.externalCommunicationWithTheDepartmentStore = externalCommunicationWithTheDepartmentStore;
    }

    public String getExternalCommunicationWithTheStore() {
        return externalCommunicationWithTheStore;
    }

    public void setExternalCommunicationWithTheStore(String externalCommunicationWithTheStore) {
        this.externalCommunicationWithTheStore = externalCommunicationWithTheStore;
    }

    public String getExternalCommunicationWithTheKiosk() {
        return externalCommunicationWithTheKiosk;
    }

    public void setExternalCommunicationWithTheKiosk(String externalCommunicationWithTheKiosk) {
        this.externalCommunicationWithTheKiosk = externalCommunicationWithTheKiosk;
    }

    public String getNumberOfManagers() {
        return numberOfManagers;
    }

    public void setNumberOfManagers(String numberOfManagers) {
        this.numberOfManagers = numberOfManagers;
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
        return "Outlet{" +
                "id=" + id +
                ", externalCommunicationWithTheDepartmentStore='" + externalCommunicationWithTheDepartmentStore + '\'' +
                ", externalCommunicationWithTheStore='" + externalCommunicationWithTheStore + '\'' +
                ", externalCommunicationWithTheKiosk='" + externalCommunicationWithTheKiosk + '\'' +
                ", numberOfManagers='" + numberOfManagers + '\'' +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", dateOfModified='" + dateOfModified + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
