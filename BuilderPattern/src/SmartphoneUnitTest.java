import org.junit.Test;
import static org.junit.Assert.*;
public class SmartphoneUnitTest {

    @Test
    public void testSmartphoneBuilder() {
        Smartphone smartphone = new SmartphoneBuilder("Samsung", "Galaxy 10")
                .setOS("Android")
                .setScreenSize("6.0 inches")
                .setBatteryCapacity(4000)
                .setCameraResolution("12 MP")
                .build();

        // Test the values set by the builder
        assertEquals("Samsung", smartphone.getBrand());
        assertEquals("Galaxy 10", smartphone.getModel());
        assertEquals("Android", smartphone.getOs());
        assertEquals("6.0 inches", smartphone.getScreenSize());
        assertEquals(4000, smartphone.getBatteryCapacity());
        assertEquals("12 MP", smartphone.getCameraResolution());
    }

    @Test
    public void testSmartphoneBuilderWithMissingData() {
        // Test the builder when some data is not set
        Smartphone smartphone = new SmartphoneBuilder("Apple", "Iphone 11")
                .setOS("iOS")
                .setBatteryCapacity(3500)
                .build();

        assertEquals("Apple", smartphone.getBrand());
        assertEquals("Iphone 11", smartphone.getModel());
        assertEquals("iOS", smartphone.getOs());
        assertNull(smartphone.getScreenSize());
        assertEquals(3500, smartphone.getBatteryCapacity());
        assertNull(smartphone.getCameraResolution());
    }
}