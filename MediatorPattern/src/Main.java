import classes.Battery;
import classes.ConcreteSmartphoneMediator;
import classes.Processor;
import classes.Screen;

public class Main {
    public static void main(String[] args) {
        ConcreteSmartphoneMediator mediator = new ConcreteSmartphoneMediator();

        Screen screen = new Screen();
        Battery battery = new Battery();
        Processor processor = new Processor();

        mediator.setScreen(screen);
        mediator.setBattery(battery);
        mediator.setProcessor(processor);

        screen.setMediator(mediator);
        battery.setMediator(mediator);
        processor.setMediator(mediator);

        screen.send("Hello from Screen!");
        System.out.println();
        battery.send("Battery status: 50%");
        System.out.println();
        processor.send("Processing data...");
    }
}