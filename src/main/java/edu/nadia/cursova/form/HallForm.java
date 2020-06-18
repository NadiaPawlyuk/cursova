package edu.nadia.cursova.form;

import java.time.LocalDateTime;

public class HallForm {

    private String nameOfTheHall;
    private String numberOfSellers;
    private String description;

    public HallForm() {
    }

    public HallForm(String nameOfTheHall, String numberOfSellers, String description) {
        this.nameOfTheHall = nameOfTheHall;
        this.numberOfSellers = numberOfSellers;
        this.description = description;
    }

    public String getNameOfTheHall() {
        return nameOfTheHall;
    }

    public void setNameOfTheHall(String nameOfTheHall) {
        this.nameOfTheHall = nameOfTheHall;
    }

    public String getNumberOfSellers() {
        return numberOfSellers;
    }

    public void setNumberOfSellers(String numberOfSellers) {
        this.numberOfSellers = numberOfSellers;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "HallForm{" +
                "nameOfTheHall='" + nameOfTheHall + '\'' +
                ", numberOfSellers='" + numberOfSellers + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
