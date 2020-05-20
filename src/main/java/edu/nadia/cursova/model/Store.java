package edu.nadia.cursova.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
public class Store {
    //Магазин
    @Id
    private String id;
    private Outlet nameOfTheStore;
    private String numberOfSellers;
    private String numberOfHalls;
    private String numberOfCounters;
    private String address;
    private String theSizeOfTheOutlet;
    private String rent;
    private String utilities;
    private LocalDateTime dateOfCreation;
    private LocalDateTime dateOfModified;
    private String description;

    public Store() {
    }

    public Store(String id, Outlet nameOfTheStore, String numberOfSellers, String numberOfHalls, String numberOfCounters, String address, String theSizeOfTheOutlet, String rent, String utilities, LocalDateTime dateOfCreation, LocalDateTime dateOfModified, String description) {
        this.id = id;
        this.nameOfTheStore = nameOfTheStore;
        this.numberOfSellers = numberOfSellers;
        this.numberOfHalls = numberOfHalls;
        this.numberOfCounters = numberOfCounters;
        this.address = address;
        this.theSizeOfTheOutlet = theSizeOfTheOutlet;
        this.rent = rent;
        this.utilities = utilities;
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

    public Outlet getNameOfTheStore() {
        return nameOfTheStore;
    }

    public void setNameOfTheStore(Outlet nameOfTheStore) {
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
        return "Store{" +
                "id='" + id + '\'' +
                ", nameOfTheStore='" + nameOfTheStore + '\'' +
                ", numberOfSellers=" + numberOfSellers +
                ", numberOfHalls=" + numberOfHalls +
                ", numberOfCounters=" + numberOfCounters +
                ", address='" + address + '\'' +
                ", theSizeOfTheOutlet='" + theSizeOfTheOutlet + '\'' +
                ", rent=" + rent +
                ", utilities=" + utilities +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", dateOfChange='" + dateOfModified + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
