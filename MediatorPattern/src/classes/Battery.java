package classes;

import interfaces.SmartphoneComponent;
import interfaces.SmartphoneMediator;

public class Battery implements SmartphoneComponent {
    private SmartphoneMediator mediator;

    @Override
    public void setMediator(SmartphoneMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void receive(String message) {
        System.out.println("Battery received: " + message);
    }

    @Override
    public void send(String message) {
        System.out.println("Battery sending: " + message);
        mediator.send(message, this);
    }
}