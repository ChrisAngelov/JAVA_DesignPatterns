package Entities;
abstract class Smartphone implements Cloneable {
    protected String brand;
    protected String model;

    public Smartphone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void displayInfo();

    // Shallow copy method
    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        return (Smartphone) super.clone();
    }

    // Public deep copy method
    public Smartphone deepCopy() throws CloneNotSupportedException {
        Smartphone clone = clone(); // Shallow copy first
        clone.brand = new String(brand); // Create new brand String (deep copy)
        clone.model = new String(model); // Create new model String (deep copy)
        return clone;
    }


    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}