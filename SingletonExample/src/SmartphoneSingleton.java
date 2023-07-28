public class SmartphoneSingleton {

    // Private static instance of the class
    private static SmartphoneSingleton instance;

    // Variables to store smartphone data
    private String brand;
    private String model;
    private int batteryPercentage;

    //<editor-fold desc="Private constructor to prevent direct instantiation">
    private SmartphoneSingleton() {
        // Initialize default values
        brand = "Unknown";
        model = "Unknown";
        batteryPercentage = 100;
    }
    //</editor-fold>

    //<editor-fold desc="Public static method to get the instance (thread-safe)">
    public static SmartphoneSingleton getInstance() {
        if (instance == null) {
            synchronized (SmartphoneSingleton.class) {
                if (instance == null) {
                    instance = new SmartphoneSingleton();
                }
            }
        }
        return instance;
    }
    //</editor-fold>

    //<editor-fold desc="Getters and setters for the smartphone">
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

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }
    //</editor-fold>

    //<editor-fold desc="Other methods to interact with smartphone">

    public void chargeBattery(int amount) {
        batteryPercentage += amount;
        if (batteryPercentage > 100) {
            batteryPercentage = 100;
        }
    }

    public void useBattery(int amount) {
        batteryPercentage -= amount;
        if (batteryPercentage < 0) {
            batteryPercentage = 0;
        }
    }
    //</editor-fold>

}