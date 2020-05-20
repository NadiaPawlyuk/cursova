package edu.nadia.cursova.form;

import java.time.LocalDateTime;

public class SupplierForm {
    private String initials;
    private String dateOfBirthday;
    private String numberOfPhone;
    private String address;
    private String description;

    public SupplierForm() {
    }

    public SupplierForm(String initials, String dateOfBirthday, String numberOfPhone, String address, String description) {
        this.initials = initials;
        this.dateOfBirthday = dateOfBirthday;
        this.numberOfPhone = numberOfPhone;
        this.address = address;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SupplierForm{" +
                "initials='" + initials + '\'' +
                ", dateOfBirthday='" + dateOfBirthday + '\'' +
                ", numberOfPhone='" + numberOfPhone + '\'' +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
