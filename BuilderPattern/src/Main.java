public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new SmartphoneBuilder("Example Brand", "Example Model")
                .setOS("Android")
                .setScreenSize("6.2 inches")
                .setBatteryCapacity(4000)
                .setCameraResolution("12 MP")
                .build();

        System.out.println("Brand: " + smartphone.getBrand());
        System.out.println("Model: " + smartphone.getModel());
        System.out.println("OS: " + smartphone.getOs());
        System.out.println("Screen Size: " + smartphone.getScreenSize());
        System.out.println("Battery Capacity: " + smartphone.getBatteryCapacity() + " mAh");
        System.out.println("Camera Resolution: " + smartphone.getCameraResolution());
    }
}