import Classes.Composite.InternalComponents;
import Classes.Leafs.*;
import Interfaces.SmartphoneComponent;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Battery battery = new Battery();
        Screen screen = new Screen();
        Camera camera = new Camera();
        Ram ram = new Ram();

        InternalComponents internalComponents = new InternalComponents();
        internalComponents.addComponent(processor);
        internalComponents.addComponent(ram);
        internalComponents.addComponent(battery);
        internalComponents.addComponent(screen);
        internalComponents.addComponent(camera);

        SmartphoneComponent smartphone = internalComponents; // Store the root composite
        smartphone.displayInfo();
    }
}