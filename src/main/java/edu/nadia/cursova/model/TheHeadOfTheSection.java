package edu.nadia.cursova.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
public class TheHeadOfTheSection {
    //Керівник секції
    @Id
    private String id;
    private String initials;
    private String dateOfBirth;
    private String dateOfHiring;
    private String numberOfPhone;
    private String address;
    private String salary;
    private Outlet externalCommunicationWithThePlaceOfWork;
    private LocalDateTime dateOfCreation;
    private LocalDateTime dateOfModified;
    private String description;

    public TheHeadOfTheSection() {
    }

    public TheHeadOfTheSection(String id, String initials, String dateOfBirth, String dateOfHiring, String numberOfPhone, String address, String salary, Outlet externalCommunicationWithThePlaceOfWork, LocalDateTime dateOfCreation, LocalDateTime dateOfModified, String description) {
        this.id = id;
        this.initials = initials;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHiring = dateOfHiring;
        this.numberOfPhone = numberOfPhone;
        this.address = address;
        this.salary = salary;
        this.externalCommunicationWithThePlaceOfWork = externalCommunicationWithThePlaceOfWork;
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

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfHiring() {
        return dateOfHiring;
    }

    public void setDateOfHiring(String dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    public String getNumberOfPhone() {
        return numberOfPhone;
    }

    public void setNumberOfPhone(String numberOfPhone) {
        this.numberOfPhone = numberOfPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Outlet getExternalCommunicationWithThePlaceOfWork() {
        return externalCommunicationWithThePlaceOfWork;
    }

    public void setExternalCommunicationWithThePlaceOfWork(Outlet externalCommunicationWithThePlaceOfWork) {
        this.externalCommunicationWithThePlaceOfWork = externalCommunicationWithThePlaceOfWork;
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
        return "TheHeadOfTheSection{" +
                "id='" + id + '\'' +
                ", initials='" + initials + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfHiring='" + dateOfHiring + '\'' +
                ", numberOfPhone='" + numberOfPhone + '\'' +
                ", address='" + address + '\'' +
                ", salary='" + salary + '\'' +
                ", externalCommunicationWithThePlaceOfWork='" + externalCommunicationWithThePlaceOfWork + '\'' +
                ", dateOfCreation=" + dateOfCreation +
                ", dateOfModified=" + dateOfModified +
                ", description='" + description + '\'' +
                '}';
    }
}
