package edu.nadia.cursova.form;

import java.time.LocalDateTime;

public class DirectoryOfGoodsNomenclatureForm {

    private String theNameOfTheProduct;
    private String description;

    public DirectoryOfGoodsNomenclatureForm() {
    }

    public DirectoryOfGoodsNomenclatureForm(String theNameOfTheProduct, String description) {
        this.theNameOfTheProduct = theNameOfTheProduct;
        this.description = description;
    }

    public String getTheNameOfTheProduct() {
        return theNameOfTheProduct;
    }

    public void setTheNameOfTheProduct(String theNameOfTheProduct) {
        this.theNameOfTheProduct = theNameOfTheProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "DirectoryOfGoodsNomenclatureForm{" +
                "theNameOfTheProduct='" + theNameOfTheProduct + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
