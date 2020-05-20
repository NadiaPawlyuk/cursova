package edu.nadia.cursova.form;

import java.time.LocalDateTime;

public class OrganizationOfTradeForm {
    private String nameOfOrganization;
    private String phoneNumber;
    private String address;
    private String numberOfManagers;
    private String description;

    public OrganizationOfTradeForm() {
    }

    public OrganizationOfTradeForm(String nameOfOrganization, String phoneNumber, String address, String numberOfManagers, String description) {
        this.nameOfOrganization = nameOfOrganization;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.numberOfManagers = numberOfManagers;
        this.description = description;
    }

    public String getNameOfOrganization() {
        return nameOfOrganization;
    }

    public void setNameOfOrganization(String nameOfOrganization) {
        this.nameOfOrganization = nameOfOrganization;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberOfManagers() {
        return numberOfManagers;
    }

    public void setNumberOfManagers(String numberOfManagers) {
        this.numberOfManagers = numberOfManagers;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "OrganizationOfTradeForm{" +
                "nameOfOrganization='" + nameOfOrganization + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", numberOfManagers='" + numberOfManagers + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
