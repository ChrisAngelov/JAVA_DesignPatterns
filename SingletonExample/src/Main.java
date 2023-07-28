public class Main {
    public static void main(String[] args) {

        SmartphoneSingleton smartphone = SmartphoneSingleton.getInstance();

        smartphone.setBrand("Samsung");
        smartphone.setModel("Galaxy S21");

        System.out.println("Brand: " + smartphone.getBrand());
        System.out.println("Model: " + smartphone.getModel());
        System.out.println("Battery Percentage: " + smartphone.getBatteryPercentage());

        smartphone.chargeBattery(20);

        System.out.println("Battery Percentage after charging: " + smartphone.getBatteryPercentage());

        smartphone.useBattery(10);

        System.out.println("Battery Percentage after usage: " + smartphone.getBatteryPercentage());

        SmartphoneSingleton anotherSmartphone = SmartphoneSingleton.getInstance();

        if (smartphone == anotherSmartphone) {
            System.out.println("Both instances are the same (singleton works).");
        } else {
            System.out.println("Something went wrong with singleton implementation.");
        }

    }
}