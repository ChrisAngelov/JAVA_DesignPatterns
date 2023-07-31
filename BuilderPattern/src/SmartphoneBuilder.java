public class SmartphoneBuilder {
    private String brand;
    private String model;
    private String os;
    private String screenSize;
    private int batteryCapacity;
    private String cameraResolution;

    public SmartphoneBuilder(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public SmartphoneBuilder setOS(String os) {
        this.os = os;
        return this;
    }

    public SmartphoneBuilder setScreenSize(String screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public SmartphoneBuilder setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    public SmartphoneBuilder setCameraResolution(String cameraResolution) {
        this.cameraResolution = cameraResolution;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getOs() {
        return os;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getCameraResolution() {
        return cameraResolution;
    }

    public Smartphone build() {
        return new Smartphone(this);
    }
}