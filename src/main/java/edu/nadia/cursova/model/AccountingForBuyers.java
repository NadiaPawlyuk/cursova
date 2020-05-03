package edu.nadia.cursova.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
    @Document
public class AccountingForBuyers {
    //Облік покупців
    @Id
    private String id;
    private String initials;
    private String numberOfPhone;
    private String dateOfBirthday;
    private LocalDateTime dateOfCreation;
    private LocalDateTime dateOfModified;
    private String description;

    public AccountingForBuyers() {
    }

    public AccountingForBuyers(String id, String initials, String numberOfPhone, String dateOfBirthday, LocalDateTime dateOfCreation, LocalDateTime dateOfModified, String description) {
        this.id = id;
        this.initials = initials;
        this.numberOfPhone = numberOfPhone;
        this.dateOfBirthday = dateOfBirthday;
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

    public String getNumberOfPhone() {
        return numberOfPhone;
    }

    public void setNumberOfPhone(String numberOfPhone) {
        this.numberOfPhone = numberOfPhone;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
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
        return "AccountingForBuyers{" +
                "id=" + id +
                ", initials='" + initials + '\'' +
                ", numberOfPhone='" + numberOfPhone + '\'' +
                ", dateOfBirthday='" + dateOfBirthday + '\'' +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", dateOfModified='" + dateOfModified + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
