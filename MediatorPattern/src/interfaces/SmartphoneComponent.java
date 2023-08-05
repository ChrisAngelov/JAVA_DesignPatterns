package interfaces;

public interface SmartphoneComponent {
    void setMediator(SmartphoneMediator mediator);

    void receive(String message);

    void send(String message);
}