package edu.nadia.cursova.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
public class Section {
    //Секція
    @Id
    private String id;
    private String nameOfTheSection;
    private TheHeadOfTheSection externalCommunicationWithTheHeadOfTheSection;
    private String theFloor;
    private Outlet externalCommunicationWithDepartmentStore;
    private LocalDateTime dateOfCreation;
    private LocalDateTime dateOfModified;
    private String description;

    public Section() {
    }

    public Section(String id, String nameOfTheSection, TheHeadOfTheSection externalCommunicationWithTheHeadOfTheSection, String theFloor, Outlet externalCommunicationWithDepartmentStore, LocalDateTime dateOfCreation, LocalDateTime dateOfModified, String description) {
        this.id = id;
        this.nameOfTheSection = nameOfTheSection;
        this.externalCommunicationWithTheHeadOfTheSection = externalCommunicationWithTheHeadOfTheSection;
        this.theFloor = theFloor;
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

    public String getNameOfTheSection() {
        return nameOfTheSection;
    }

    public void setNameOfTheSection(String nameOfTheSection) {
        this.nameOfTheSection = nameOfTheSection;
    }

    public TheHeadOfTheSection getExternalCommunicationWithTheHeadOfTheSection() {
        return externalCommunicationWithTheHeadOfTheSection;
    }

    public void setExternalCommunicationWithTheHeadOfTheSection(TheHeadOfTheSection externalCommunicationWithTheHeadOfTheSection) {
        this.externalCommunicationWithTheHeadOfTheSection = externalCommunicationWithTheHeadOfTheSection;
    }

    public String getTheFloor() {
        return theFloor;
    }

    public void setTheFloor(String theFloor) {
        this.theFloor = theFloor;
    }

    public Outlet getExternalCommunicationWithDepartmentStore() {
        return externalCommunicationWithDepartmentStore;
    }

    public void setExternalCommunicationWithDepartmentStore(Outlet externalCommunicationWithDepartmentStore) {
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
        return "Section{" +
                "id=" + id +
                ", nameOfTheSection='" + nameOfTheSection + '\'' +
                ", externalCommunicationWithTheHeadOfTheSection=" + externalCommunicationWithTheHeadOfTheSection +
                ", theFloor=" + theFloor +
                ", externalCommunicationWithDepartmentStore=" + externalCommunicationWithDepartmentStore +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", dateOfChange='" + dateOfModified + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
