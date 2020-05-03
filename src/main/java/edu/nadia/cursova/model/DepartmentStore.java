package edu.nadia.cursova.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
public class DepartmentStore {
    //Універмаг
    @Id
    private String id;
    private String name;
    private String numberOfSections;
    private String numberOfFloors;
    private String numberOfHalls;
    private String numberOfCounters;
    private String address;
    private String theSizeOfTheOutlet;
    private String rent;
    private String utilities;
    private LocalDateTime dateOfCreation;
    private LocalDateTime dateOfModified;
    private String description;

    public DepartmentStore() {
    }

    public DepartmentStore(String id, String name, String numberOfSections, String numberOfFloors, String numberOfHalls, String numberOfCounters, String address, String theSizeOfTheOutlet, String rent, String utilities, LocalDateTime dateOfCreation, LocalDateTime dateOfModified, String description) {
        this.id = id;
        this.name = name;
        this.numberOfSections = numberOfSections;
        this.numberOfFloors = numberOfFloors;
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
        return "DepartmentStore{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberOfSections=" + numberOfSections +
                ", numberOfFloors=" + numberOfFloors +
                ", numberOfHalls=" + numberOfHalls +
                ", numberOfCounters=" + numberOfCounters +
                ", address='" + address + '\'' +
                ", theSizeOfTheOutlet='" + theSizeOfTheOutlet + '\'' +
                ", rent=" + rent +
                ", utilities=" + utilities +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", dateOfModified='" + dateOfModified + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
