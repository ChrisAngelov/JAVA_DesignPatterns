import Entities.Smartphone;
import Entities.SmartphoneCollection;
import Interfaces.SmartphoneIterator;

public class Main {
    public static void main(String[] args) {
        SmartphoneCollection smartphoneCollection = new SmartphoneCollection(5);
        smartphoneCollection.addSmartphone(new Smartphone("Apple", "iPhone 12"));
        smartphoneCollection.addSmartphone(new Smartphone("Samsung", "Galaxy S23"));
        smartphoneCollection.addSmartphone(new Smartphone("Google", "Pixel 5s"));
        smartphoneCollection.addSmartphone(new Smartphone("OnePlus", "9 Pro"));
        smartphoneCollection.addSmartphone(new Smartphone("Xiaomi", "Mi 11"));

        SmartphoneIterator iterator = smartphoneCollection.createIterator();

        System.out.println("Smartphone Collection:");
        while (iterator.hasNext()) {
            Smartphone smartphone = iterator.next();
            System.out.println(smartphone);
        }
    }
}