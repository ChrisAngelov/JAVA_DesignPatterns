
//Factory responsible for the creation of instances
public class SmartphoneFactory {

    public static Smartphone createSmartphone(String brand, String model, int ram, int storage, String operatingSystem) {
        if ("Android".equalsIgnoreCase(operatingSystem)) {
            return new AndroidPhone(brand, model, ram, storage);
        } else if ("iOS".equalsIgnoreCase(operatingSystem)) {
            return new IOSPhone(brand, model, ram, storage);
        } else {
            throw new IllegalArgumentException("Invalid operating system: " + operatingSystem);
        }
    }
}