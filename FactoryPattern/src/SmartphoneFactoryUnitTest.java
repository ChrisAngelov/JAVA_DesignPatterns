import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmartphoneFactoryUnitTest {

    @Test
    public void testCreateAndroidPhone() {
        // Arrange
        String brand = "Samsung";
        String model = "Galaxy S21";
        int ram = 8;
        int storage = 128;
        String operatingSystem = "Android";

        // Act
        Smartphone androidPhone = SmartphoneFactory.createSmartphone(brand, model, ram, storage, operatingSystem);

        // Assert
        Assertions.assertNotNull(androidPhone);
        Assertions.assertTrue(androidPhone instanceof AndroidPhone);
        Assertions.assertEquals(brand, androidPhone.brand);
        Assertions.assertEquals(model, androidPhone.model);
        Assertions.assertEquals(ram, androidPhone.ram);
        Assertions.assertEquals(storage, androidPhone.storage);
    }

    @Test
    public void testCreateIOSPhone() {
        // Arrange
        String brand = "Apple";
        String model = "iPhone 13";
        int ram = 6;
        int storage = 256;
        String operatingSystem = "iOS";

        // Act
        Smartphone iOSPhone = SmartphoneFactory.createSmartphone(brand, model, ram, storage, operatingSystem);

        // Assert
        Assertions.assertNotNull(iOSPhone);
        Assertions.assertTrue(iOSPhone instanceof IOSPhone);
        Assertions.assertEquals(brand, iOSPhone.brand);
        Assertions.assertEquals(model, iOSPhone.model);
        Assertions.assertEquals(ram, iOSPhone.ram);
        Assertions.assertEquals(storage, iOSPhone.storage);
    }

    @Test
    public void testInvalidOperatingSystem() {
        // Arrange
        String brand = "Brand";
        String model = "Model";
        int ram = 4;
        int storage = 64;
        String operatingSystem = "InvalidOS";

        // Act & Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            SmartphoneFactory.createSmartphone(brand, model, ram, storage, operatingSystem);
        });
    }
}