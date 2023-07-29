public class Main {
    public static void main(String[] args) {
        Smartphone androidPhone = SmartphoneFactory.createSmartphone("Samsung", "Galaxy S21", 8, 128, "Android");
        Smartphone iOSPhone = SmartphoneFactory.createSmartphone("Apple", "iPhone 13", 6, 256, "iOS");

        androidPhone.displayInfo();
        iOSPhone.displayInfo();
    }
}