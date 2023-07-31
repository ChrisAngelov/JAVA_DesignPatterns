import Facades.SmartphoneFacade;

public class Main {
    public static void main(String[] args) {
        SmartphoneFacade smartphone = new SmartphoneFacade();

        // Here we are using the simplified interface provided by the facade
        smartphone.takePhoto();
        smartphone.displayImage();
    }
}