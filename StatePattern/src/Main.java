import Classes.Entities.Smartphone;



public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();

        smartphone.pressButton();  // Changes state from Idle to Ringing
        smartphone.pressButton();  // Changes state from Ringing to Silent
        smartphone.pressButton();  // Changes state from Silent to Vibration
        smartphone.pressButton();  // Changes state from Vibration to Idle
    }
}