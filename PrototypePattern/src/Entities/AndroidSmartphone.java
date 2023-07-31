package Entities;

public class AndroidSmartphone extends Smartphone {
    public AndroidSmartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void displayInfo() {
        System.out.println("Android Smartphone: " + brand + " " + model);
    }

    // Override clone() for AndroidSmartphone
    @Override
    public AndroidSmartphone clone() throws CloneNotSupportedException {
        return (AndroidSmartphone) super.clone();
    }

    // Override deepCopy() for AndroidSmartphone
    @Override
    public AndroidSmartphone deepCopy() throws CloneNotSupportedException {
        return (AndroidSmartphone) super.deepCopy();
    }
}