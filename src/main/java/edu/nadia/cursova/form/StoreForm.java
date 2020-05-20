package edu.nadia.cursova.form;

import java.time.LocalDateTime;

public class StoreForm {
    private String nameOfTheStore;
    private String numberOfSellers;
    private String numberOfHalls;
    private String numberOfCounters;
    private String address;
    private String theSizeOfTheOutlet;
    private String rent;
    private String utilities;
    private String description;

    public StoreForm() {
    }

    public StoreForm(String nameOfTheStore, String numberOfSellers, String numberOfHalls, String numberOfCounters, String address, String theSizeOfTheOutlet, String rent, String utilities, String description) {
        this.nameOfTheStore = nameOfTheStore;
        this.numberOfSellers = numberOfSellers;
        this.numberOfHalls = numberOfHalls;
        this.numberOfCounters = numberOfCounters;
        this.address = address;
        this.theSizeOfTheOutlet = theSizeOfTheOutlet;
        this.rent = rent;
        this.utilities = utilities;
        this.description = description;
    }

    public String getNameOfTheStore() {
        return nameOfTheStore;
    }

    public void setNameOfTheStore(String nameOfTheStore) {
        this.nameOfTheStore = nameOfTheStore;
    }

    public String getNumberOfSellers() {
        return numberOfSellers;
    }

    public void setNumberOfSellers(String numberOfSellers) {
        this.numberOfSellers = numberOfSellers;
    }

    public String getNumberOfHalls() {
        return numberOfHalls;
    }

    public void setNumberOfHalls(String numberOfHalls) {
        this.numberOfHalls = numberOfHalls;
    }

    public String getNumberOfCounters() {
        return numberOfCounters;
    }

    public void setNumberOfCounters(String numberOfCounters) {
        this.numberOfCounters = numberOfCounters;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTheSizeOfTheOutlet() {
        return theSizeOfTheOutlet;
    }

    public void setTheSizeOfTheOutlet(String theSizeOfTheOutlet) {
        this.theSizeOfTheOutlet = theSizeOfTheOutlet;
    }

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }

    public String getUtilities() {
        return utilities;
    }

    public void setUtilities(String utilities) {
        this.utilities = utilities;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "StoreForm{" +
                "nameOfTheStore='" + nameOfTheStore + '\'' +
                ", numberOfSellers='" + numberOfSellers + '\'' +
                ", numberOfHalls='" + numberOfHalls + '\'' +
                ", numberOfCounters='" + numberOfCounters + '\'' +
                ", address='" + address + '\'' +
                ", theSizeOfTheOutlet='" + theSizeOfTheOutlet + '\'' +
                ", rent='" + rent + '\'' +
                ", utilities='" + utilities + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
