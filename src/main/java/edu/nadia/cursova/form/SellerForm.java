package edu.nadia.cursova.form;

import java.time.LocalDateTime;

public class SellerForm {
    private String initials;
    private String dateOfBirthday;
    private String dateOfHiring;
    private String numberOfPhone;
    private String address;
    private String salary;
    private String externalCommunicationWithThePlaceOfWork;
    private String description;

    public SellerForm() {
    }

    public SellerForm(String initials, String dateOfBirthday, String dateOfHiring, String numberOfPhone, String address, String salary, String externalCommunicationWithThePlaceOfWork, String description) {
        this.initials = initials;
        this.dateOfBirthday = dateOfBirthday;
        this.dateOfHiring = dateOfHiring;
        this.numberOfPhone = numberOfPhone;
        this.address = address;
        this.salary = salary;
        this.externalCommunicationWithThePlaceOfWork = externalCommunicationWithThePlaceOfWork;
        this.description = description;
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

    public String getExternalCommunicationWithThePlaceOfWork() {
        return externalCommunicationWithThePlaceOfWork;
    }

    public void setExternalCommunicationWithThePlaceOfWork(String externalCommunicationWithThePlaceOfWork) {
        this.externalCommunicationWithThePlaceOfWork = externalCommunicationWithThePlaceOfWork;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SellerForm{" +
                "initials='" + initials + '\'' +
                ", dateOfBirthday='" + dateOfBirthday + '\'' +
                ", dateOfHiring='" + dateOfHiring + '\'' +
                ", numberOfPhone='" + numberOfPhone + '\'' +
                ", address='" + address + '\'' +
                ", salary='" + salary + '\'' +
                ", externalCommunicationWithThePlaceOfWork='" + externalCommunicationWithThePlaceOfWork + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
