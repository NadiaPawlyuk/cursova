package edu.nadia.cursova.form;

import java.time.LocalDateTime;

public class DepartmentStoreForm {

    private String nameOfTheStore;
    private String name;
    private String numberOfSections;
    private String numberOfFloors;
    private String numberOfHalls;
    private String numberOfCounters;
    private String address;
    private String theSizeOfTheOutlet;
    private String rent;
    private String utilities;
    private String description;

    public DepartmentStoreForm() {
    }

    public DepartmentStoreForm(String nameOfTheStore, String name, String numberOfSections, String numberOfFloors, String numberOfHalls, String numberOfCounters, String address, String theSizeOfTheOutlet, String rent, String utilities, String description) {
        this.nameOfTheStore = nameOfTheStore;
        this.name = name;
        this.numberOfSections = numberOfSections;
        this.numberOfFloors = numberOfFloors;
        this.numberOfHalls = numberOfHalls;
        this.numberOfCounters = numberOfCounters;
        this.address = address;
        this.theSizeOfTheOutlet = theSizeOfTheOutlet;
        this.rent = rent;
        this.utilities = utilities;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberOfSections() {
        return numberOfSections;
    }

    public void setNumberOfSections(String numberOfSections) {
        this.numberOfSections = numberOfSections;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
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

    public String getNameOfTheStore() {
        return nameOfTheStore;
    }

    public void setNameOfTheStore(String nameOfTheStore) {
        this.nameOfTheStore = nameOfTheStore;
    }

    @Override
    public String toString() {
        return "DepartmentStoreForm{" +
                "nameOfTheStore='" + nameOfTheStore + '\'' +
                ", name='" + name + '\'' +
                ", numberOfSections='" + numberOfSections + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
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
