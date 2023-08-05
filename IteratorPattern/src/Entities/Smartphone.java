package Entities;

public class Smartphone {
    private String brand;
    private String model;

    public Smartphone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }
}
