// Subclass representing an IOS type Phone
public class IOSPhone extends Smartphone {

    // Initialize the IOSPhone attributes using the base class constructor
    public IOSPhone(String brand, String model, int ram, int storage) {
        super(brand, model, ram, storage, "iOS");
    }

    //Override the displayInfo method to fit IOS Phones
    @Override
    public void displayInfo() {
        System.out.println("iOS Phone - Brand: " + brand + ", Model: " + model + ", RAM: " + ram + "GB, Storage: " + storage + "GB");
    }
}