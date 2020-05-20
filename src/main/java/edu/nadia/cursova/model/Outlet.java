package edu.nadia.cursova.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
public class Outlet {
    //Торговельна точка
    @Id
    private String id;
    private String name;
    private String kindOfOutlet;
    private LocalDateTime dateOfCreation;
    private LocalDateTime dateOfModified;
    private String description;

    public Outlet() {
    }

    public Outlet(String id, String name, String kindOfOutlet, LocalDateTime dateOfCreation, LocalDateTime dateOfModified, String description) {
        this.id = id;
        this.name = name;
        this.kindOfOutlet = kindOfOutlet;
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

    public String getKindOfOutlet() {
        return kindOfOutlet;
    }

    public void setKindOfOutlet(String kindOfOutlet) {
        this.kindOfOutlet = kindOfOutlet;
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
        return "Outlet{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", kindOfOutlet='" + kindOfOutlet + '\'' +
                ", dateOfCreation=" + dateOfCreation +
                ", dateOfModified=" + dateOfModified +
                ", description='" + description + '\'' +
                '}';
    }
}
