package edu.nadia.cursova.form;

import java.time.LocalDateTime;

public class SectionForm {
    private String nameOfTheSection;
    private String externalCommunicationWithTheHeadOfTheSection;
    private String theFloor;
    private String externalCommunicationWithDepartmentStore;
    private String description;

    public SectionForm() {
    }

    public SectionForm(String nameOfTheSection, String externalCommunicationWithTheHeadOfTheSection, String theFloor, String externalCommunicationWithDepartmentStore, String description) {
        this.nameOfTheSection = nameOfTheSection;
        this.externalCommunicationWithTheHeadOfTheSection = externalCommunicationWithTheHeadOfTheSection;
        this.theFloor = theFloor;
        this.externalCommunicationWithDepartmentStore = externalCommunicationWithDepartmentStore;
        this.description = description;
    }

    public String getNameOfTheSection() {
        return nameOfTheSection;
    }

    public void setNameOfTheSection(String nameOfTheSection) {
        this.nameOfTheSection = nameOfTheSection;
    }

    public String getExternalCommunicationWithTheHeadOfTheSection() {
        return externalCommunicationWithTheHeadOfTheSection;
    }

    public void setExternalCommunicationWithTheHeadOfTheSection(String externalCommunicationWithTheHeadOfTheSection) {
        this.externalCommunicationWithTheHeadOfTheSection = externalCommunicationWithTheHeadOfTheSection;
    }

    public String getTheFloor() {
        return theFloor;
    }

    public void setTheFloor(String theFloor) {
        this.theFloor = theFloor;
    }

    public String getExternalCommunicationWithDepartmentStore() {
        return externalCommunicationWithDepartmentStore;
    }

    public void setExternalCommunicationWithDepartmentStore(String externalCommunicationWithDepartmentStore) {
        this.externalCommunicationWithDepartmentStore = externalCommunicationWithDepartmentStore;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SectionForm{" +
                "nameOfTheSection='" + nameOfTheSection + '\'' +
                ", externalCommunicationWithTheHeadOfTheSection='" + externalCommunicationWithTheHeadOfTheSection + '\'' +
                ", theFloor='" + theFloor + '\'' +
                ", externalCommunicationWithDepartmentStore='" + externalCommunicationWithDepartmentStore + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
