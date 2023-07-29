// Abstract class used for the implementation of different types of phones
public abstract class Smartphone {
    protected String operatingSystem;
    protected String brand;
    protected String model;
    protected int ram;
    protected int storage;

    public Smartphone(String brand, String model, int ram, int storage, String operatingSystem) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
    }

    public abstract void displayInfo();
}