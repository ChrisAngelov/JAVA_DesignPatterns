package UnitTests;
import static org.junit.Assert.*;

import Entities.AndroidSmartphone;
import Entities.IPhone;
import org.junit.Test;

public class PrototypePatternUnitTest {

    @Test
    public void testIPhoneShallowCopy() throws CloneNotSupportedException {
        IPhone originalIPhone = new IPhone("Apple", "12 Pro");
        IPhone clonedIPhone = originalIPhone.clone();

        assertNotSame(originalIPhone, clonedIPhone); // Ensure it's a shallow copy
        assertEquals(originalIPhone.getBrand(), clonedIPhone.getBrand());
        assertEquals(originalIPhone.getModel(), clonedIPhone.getModel());
    }

    @Test
    public void testIPhoneDeepCopy() throws CloneNotSupportedException {
        IPhone originalIPhone = new IPhone("Apple", "12 Pro");
        IPhone deepClonedIPhone = originalIPhone.deepCopy();

        assertNotSame(originalIPhone, deepClonedIPhone); // Ensure it's a deep copy
        assertEquals(originalIPhone.getBrand(), deepClonedIPhone.getBrand());
        assertEquals(originalIPhone.getModel(), deepClonedIPhone.getModel());
    }

    @Test
    public void testAndroidSmartphoneShallowCopy() throws CloneNotSupportedException {
        AndroidSmartphone originalAndroidPhone = new AndroidSmartphone("Samsung", "Galaxy S21");
        AndroidSmartphone clonedAndroidPhone = originalAndroidPhone.clone();

        assertNotSame(originalAndroidPhone, clonedAndroidPhone); // Ensure it's a shallow copy
        assertEquals(originalAndroidPhone.getBrand(), clonedAndroidPhone.getBrand());
        assertEquals(originalAndroidPhone.getModel(), clonedAndroidPhone.getModel());
    }

    @Test
    public void testAndroidSmartphoneDeepCopy() throws CloneNotSupportedException {
        AndroidSmartphone originalAndroidPhone = new AndroidSmartphone("Samsung", "Galaxy S21");
        AndroidSmartphone deepClonedAndroidPhone = originalAndroidPhone.deepCopy();

        assertNotSame(originalAndroidPhone, deepClonedAndroidPhone); // Ensure it's a deep copy
        assertEquals(originalAndroidPhone.getBrand(), deepClonedAndroidPhone.getBrand());
        assertEquals(originalAndroidPhone.getModel(), deepClonedAndroidPhone.getModel());
    }

    @Test
    public void testOriginalObjectsUnaffectedAfterClone() throws CloneNotSupportedException {
        IPhone originalIPhone = new IPhone("Apple", "12 Pro");
        AndroidSmartphone originalAndroidPhone = new AndroidSmartphone("Samsung", "Galaxy S21");

        // Shallow copy operations
        IPhone clonedIPhone = originalIPhone.clone();
        AndroidSmartphone clonedAndroidPhone = originalAndroidPhone.clone();

        // Deep copy operations
        IPhone deepClonedIPhone = originalIPhone.deepCopy();
        AndroidSmartphone deepClonedAndroidPhone = originalAndroidPhone.deepCopy();

        // Modify the cloned objects
        clonedIPhone.setBrand("Modified Brand");
        clonedAndroidPhone.setModel("Modified Model");
        deepClonedIPhone.setBrand("Deep Modified Brand");
        deepClonedAndroidPhone.setModel("Deep Modified Model");

        // Original objects should remain unaffected
        assertEquals("Apple", originalIPhone.getBrand());
        assertEquals("12 Pro", originalIPhone.getModel());
        assertEquals("Samsung", originalAndroidPhone.getBrand());
        assertEquals("Galaxy S21", originalAndroidPhone.getModel());
    }
}