package Facades;

import subsystemComponents.Battery;
import subsystemComponents.Camera;
import subsystemComponents.Display;
import subsystemComponents.Processor;

public class SmartphoneFacade {

    private Camera camera;
    private Display display;
    private Battery battery;
    private Processor processor;

    public SmartphoneFacade() {
        camera = new Camera();
        display = new Display();
        battery = new Battery();
        processor = new Processor();
    }

    //Facade methods
    public void takePhoto() {
        camera.takePhoto();
    }

    public void displayImage() {
        battery.charge();
        processor.process();
        display.showImage();
    }
}
