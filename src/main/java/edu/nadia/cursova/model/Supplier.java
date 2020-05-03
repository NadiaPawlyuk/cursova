package edu.nadia.cursova.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
public class Supplier {
    //Постачальники
    @Id
    private String id;
    private String initials;
    private String dateOfBirthday;
    private String numberOfPhone;
    private String address;
    private LocalDateTime dateOfCreation;
    private LocalDateTime dateOfModified;
    private String description;

    public Supplier() {
    }

    public Supplier(String id, String initials, String dateOfBirthday, String numberOfPhone, String address, LocalDateTime dateOfCreation, LocalDateTime dateOfModified, String description) {
        this.id = id;
        this.initials = initials;
        this.dateOfBirthday = dateOfBirthday;
        this.numberOfPhone = numberOfPhone;
        this.address = address;
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

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
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
        return "Supplier{" +
                "id='" + id + '\'' +
                ", initials='" + initials + '\'' +
                ", dateOfBirthday='" + dateOfBirthday + '\'' +
                ", numberOfPhone='" + numberOfPhone + '\'' +
                ", address='" + address + '\'' +
                ", dateOfCreation=" + dateOfCreation +
                ", dateOfModified=" + dateOfModified +
                ", description='" + description + '\'' +
                '}';
    }
}
