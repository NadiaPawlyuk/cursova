package edu.nadia.cursova.form;

import java.time.LocalDateTime;

public class OutletForm {
    private String name;
    private String kindOfOutlet;
    private String description;

    public OutletForm() {
    }

    public OutletForm(String name, String kindOfOutlet, String description) {
        this.name = name;
        this.kindOfOutlet = kindOfOutlet;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKindOfOutlet() {
        return kindOfOutlet;
    }

    public void setKindOfOutlet(String kindOfOutlet) {
        this.kindOfOutlet = kindOfOutlet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "OutletForm{" +
                "name='" + name + '\'' +
                ", kindOfOutlet='" + kindOfOutlet + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
