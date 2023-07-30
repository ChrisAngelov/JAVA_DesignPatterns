import Classes.ChargerAdapter;
import Classes.USBCCharger;
import Interfaces.MicroUSBCharger;

public class Main {
    public static void main(String[] args) {

        //Example of using the adapter pattern when charging a phone
        USBCCharger usbCCharger = new USBCCharger();
        MicroUSBCharger microUSBCharger = new ChargerAdapter(usbCCharger);

        microUSBCharger.chargeWithMicroUSB(); // output: Charging with USB-C.
    }
}