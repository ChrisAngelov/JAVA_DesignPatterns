package Entities;
public class IPhone extends Smartphone {
    public IPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void displayInfo() {
        System.out.println("iPhone: " + brand + " " + model);
    }

    // Override clone() for IPhone
    @Override
    public IPhone clone() throws CloneNotSupportedException {
        return (IPhone) super.clone();
    }

    @Override
    public IPhone deepCopy() throws CloneNotSupportedException {
        return (IPhone) super.deepCopy();
    }
}