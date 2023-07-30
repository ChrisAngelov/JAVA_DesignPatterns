package Classes;

import Interfaces.MicroUSBCharger;

public class ChargerAdapter implements MicroUSBCharger {
    public USBCCharger usbCCharger;

    public ChargerAdapter(USBCCharger usbCCharger) {
        this.usbCCharger = usbCCharger;
    }

    @Override
    public void chargeWithMicroUSB() {
        usbCCharger.chargeWithUSBC();
    }
}