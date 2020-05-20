package edu.nadia.cursova.form;

import java.time.LocalDateTime;

public class TheHeadOfTheSectionForm {
    private String initials;
    private String dateOfBirth;
    private String dateOfHiring;
    private String numberOfPhone;
    private String address;
    private String salary;
    private String externalCommunicationWithThePlaceOfWork;
    private String description;

    public TheHeadOfTheSectionForm() {
    }


    public TheHeadOfTheSectionForm(String initials, String dateOfBirth, String dateOfHiring, String numberOfPhone, String address, String salary, String externalCommunicationWithThePlaceOfWork, String description) {
        this.initials = initials;
        this.dateOfBirth = dateOfBirth;
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
        return "TheHeadOfTheSectionForm{" +
                "initials='" + initials + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfHiring='" + dateOfHiring + '\'' +
                ", numberOfPhone='" + numberOfPhone + '\'' +
                ", address='" + address + '\'' +
                ", salary='" + salary + '\'' +
                ", externalCommunicationWithThePlaceOfWork='" + externalCommunicationWithThePlaceOfWork + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
