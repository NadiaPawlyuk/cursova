package edu.nadia.cursova.form;

import java.time.LocalDateTime;

public class AccountingForBuyersForm {
    private String initials;
    private String numberOfPhone;
    private String dateOfBirthday;
    private String description;

    public AccountingForBuyersForm() {
    }

    public AccountingForBuyersForm(String initials, String numberOfPhone, String dateOfBirthday, String description) {
        this.initials = initials;
        this.numberOfPhone = numberOfPhone;
        this.dateOfBirthday = dateOfBirthday;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AccountingForBuyersForm{" +
                "initials='" + initials + '\'' +
                ", numberOfPhone='" + numberOfPhone + '\'' +
                ", dateOfBirthday='" + dateOfBirthday + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
