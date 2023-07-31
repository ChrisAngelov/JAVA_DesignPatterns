public class Smartphone {
    private String brand;
    private String model;
    private String os;
    private String screenSize;
    private int batteryCapacity;
    private String cameraResolution;

    public Smartphone(SmartphoneBuilder builder) {
        this.brand = builder.getBrand();
        this.model = builder.getModel();
        this.os = builder.getOs();
        this.screenSize = builder.getScreenSize();
        this.batteryCapacity = builder.getBatteryCapacity();
        this.cameraResolution = builder.getCameraResolution();
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
}