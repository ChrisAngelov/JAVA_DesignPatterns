package classes;

import interfaces.SmartphoneComponent;
import interfaces.SmartphoneMediator;

public class ConcreteSmartphoneMediator implements SmartphoneMediator {
    private Screen screen;
    private Battery battery;
    private Processor processor;

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public void send(String message, SmartphoneComponent sender) {
        if (sender == screen) {
            // Screen logic here
            battery.receive(message);
            processor.receive(message);
        } else if (sender == battery) {
            // Battery logic here
            screen.receive(message);
        } else if (sender == processor) {
            // Processor logic here
            screen.receive(message);
        }
    }
}