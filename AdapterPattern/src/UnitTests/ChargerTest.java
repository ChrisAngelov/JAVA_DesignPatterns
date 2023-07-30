package UnitTests;

import Classes.ChargerAdapter;
import Classes.USBCCharger;
import Interfaces.MicroUSBCharger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChargerTest {
    @Test
    public void testChargeWithMicroUSB() {
        USBCCharger usbCCharger = new USBCCharger();
        MicroUSBCharger microUSBCharger = new ChargerAdapter(usbCCharger);
        assertTrue(microUSBCharger instanceof ChargerAdapter);
    }

    @Test
    public void testUSBCCharger() {
        USBCCharger usbCCharger = new USBCCharger();
        assertNotNull(usbCCharger);
    }

    @Test
    public void testAdapterChargesWithUSBC() {
        USBCCharger usbCCharger = new USBCCharger();
        ChargerAdapter adapter = new ChargerAdapter(usbCCharger);
        assertNotNull(adapter);
        assertEquals(usbCCharger, adapter.usbCCharger);
    }
}