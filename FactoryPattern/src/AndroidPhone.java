// Subclass representing an Android type Phone
public class AndroidPhone extends Smartphone {
    // Initialize the AndroidPhone attributes using the base class constructor
    public AndroidPhone(String brand, String model, int ram, int storage) {
        super(brand, model, ram, storage, "Android");
    }

    //Override the displayInfo method to fit Android Phones
    @Override
    public void displayInfo() {
        System.out.println("Android Phone - Brand: " + brand + ", Model: " + model + ", RAM: " + ram + "GB, Storage: " + storage + "GB");
    }
}