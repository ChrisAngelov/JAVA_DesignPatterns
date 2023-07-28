import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicReferenceArray;

public class SmartphoneSingletonTest {


    @RepeatedTest(10)
    @DisplayName("Test Thread Safety Of SmartphoneSingleton ")
    public void testThreadSafety() throws InterruptedException {
        // Number of threads to test concurrent access
        int numThreads = 100;

        // Create an AtomicReferenceArray to store the instances returned by the threads
        AtomicReferenceArray<SmartphoneSingleton> instances = new AtomicReferenceArray<>(numThreads);

        // Create multiple threads that access the singleton instance
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {

            // Final or effectively final variable to use within the lambda
            final int index = i;

            //Add threads to thread array
            threads[i] = new Thread(() -> instances.set(index, SmartphoneSingleton.getInstance()));
            threads[i].start();
        }

        // wait for all threads to finish
        for (Thread thread : threads) {
            thread.join();
        }

        // Check if all instances are same
        SmartphoneSingleton referenceInstance = instances.get(0);
        for (int i = 1; i < numThreads; i++) {
            Assertions.assertSame(referenceInstance, instances.get(i));
        }
    }

    @Test
    public void testSingletonInstance() {
        // Get two instances of the smartphone singleton
        SmartphoneSingleton smartphone1 = SmartphoneSingleton.getInstance();
        SmartphoneSingleton smartphone2 = SmartphoneSingleton.getInstance();

        // Check if both instances are the same (singleton pattern)
        Assertions.assertSame(smartphone1, smartphone2);
    }

    @Test
    public void testDefaultValues() {
        // Get an instance of the smartphone singleton
        SmartphoneSingleton smartphone = SmartphoneSingleton.getInstance();

        // Check values
        Assertions.assertEquals("Unknown", smartphone.getBrand());
        Assertions.assertEquals("Unknown", smartphone.getModel());
        Assertions.assertEquals(100, smartphone.getBatteryPercentage());
    }

    @Test
    public void testSettersAndGetters() {
        // Get an instance of the smartphone singleton
        SmartphoneSingleton smartphone = SmartphoneSingleton.getInstance();

        // Set smartphone data fields
        smartphone.setBrand("Apple");
        smartphone.setModel("iPhone 12");
        smartphone.setBatteryPercentage(80);

        // Check if setters work correctly
        Assertions.assertEquals("Apple", smartphone.getBrand());
        Assertions.assertEquals("iPhone 12", smartphone.getModel());
        Assertions.assertEquals(80, smartphone.getBatteryPercentage());
    }

    @Test
    public void testChargeBattery() {
        // Get an instance of the smartphone
        SmartphoneSingleton smartphone = SmartphoneSingleton.getInstance();

        //Set battery to 70%
        smartphone.setBatteryPercentage(70);
        // Charge the battery by 20%
        smartphone.chargeBattery(20);

        // Check if the battery percentage is updated correctly
        Assertions.assertEquals(90, smartphone.getBatteryPercentage());

        // Charging beyond 100% should set the battery to 100%
        smartphone.chargeBattery(30);
        Assertions.assertEquals(100, smartphone.getBatteryPercentage());
    }

    @Test
    public void testUseBattery() {
        // Get an instance of the smartphone
        SmartphoneSingleton smartphone = SmartphoneSingleton.getInstance();

        // Use the battery  10%
        smartphone.useBattery(10);

        // Check if the battery percentage is updated correctly
        Assertions.assertEquals(90, smartphone.getBatteryPercentage());

        // Using the battery beyond 0% should set the battery to 0%
        smartphone.useBattery(100);
        Assertions.assertEquals(0, smartphone.getBatteryPercentage());
    }
}