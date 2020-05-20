package edu.nadia.cursova.form;

import java.time.LocalDateTime;

public class HallForm {

    private String nameOfTheHall;
    private String numberOfSellers;
    private String externalCommunicationWithDepartmentStore;
    private String description;

    public HallForm() {
    }

    public HallForm(String nameOfTheHall, String numberOfSellers, String externalCommunicationWithDepartmentStore, String description) {
        this.nameOfTheHall = nameOfTheHall;
        this.numberOfSellers = numberOfSellers;
        this.externalCommunicationWithDepartmentStore = externalCommunicationWithDepartmentStore;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "HallForm{" +
                "nameOfTheHall='" + nameOfTheHall + '\'' +
                ", numberOfSellers='" + numberOfSellers + '\'' +
                ", externalCommunicationWithDepartmentStore='" + externalCommunicationWithDepartmentStore + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
