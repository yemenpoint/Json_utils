package com.yemenpoint.gson;

import com.google.gson.annotations.SerializedName;

public class Slider {
    @SerializedName("ID_Products")
    String ID_Products;
    @SerializedName("P_Name")
    String P_Name;
    @SerializedName("ID_Scientific")
    String ID_Scientific;
    @SerializedName("creator_name")
    String creator_name;
    @SerializedName("stored_name")
    String stored_name;
    @SerializedName("Scientific_Name")
    String Scientific_Name;
    @SerializedName("Image")
    String Image;
    @SerializedName("Description")
    String Description;
    @SerializedName("P_Price")
    String P_Price;
    @SerializedName("unit")
    String unit;

    public String getID_Products() {
        return ID_Products;
    }

    public void setID_Products(String ID_Products) {
        this.ID_Products = ID_Products;
    }

    public String getP_Name() {
        return P_Name;
    }

    public void setP_Name(String p_Name) {
        P_Name = p_Name;
    }

    public String getID_Scientific() {
        return ID_Scientific;
    }

    public void setID_Scientific(String ID_Scientific) {
        this.ID_Scientific = ID_Scientific;
    }

    public String getCreator_name() {
        return creator_name;
    }

    public void setCreator_name(String creator_name) {
        this.creator_name = creator_name;
    }

    public String getStored_name() {
        return stored_name;
    }

    public void setStored_name(String stored_name) {
        this.stored_name = stored_name;
    }

    public String getScientific_Name() {
        return Scientific_Name;
    }

    public void setScientific_Name(String scientific_Name) {
        Scientific_Name = scientific_Name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getP_Price() {
        return P_Price;
    }

    public void setP_Price(String p_Price) {
        P_Price = p_Price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Slider(String ID_Products, String p_Name, String ID_Scientific, String creator_name, String stored_name, String scientific_Name, String image, String description, String p_Price, String unit) {
        this.ID_Products = ID_Products;
        P_Name = p_Name;
        this.ID_Scientific = ID_Scientific;
        this.creator_name = creator_name;
        this.stored_name = stored_name;
        Scientific_Name = scientific_Name;
        Image = image;
        Description = description;
        P_Price = p_Price;
        this.unit = unit;
    }
}
