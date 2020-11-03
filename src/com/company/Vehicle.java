package com.company;

public abstract class Vehicle {

    private String manufacturer;
    private String modelName;


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public abstract void Move(int speed, String direction);


}