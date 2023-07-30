package UnitTest;

import Classes.Smartphone;
import Classes.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ObserverPatternUnitTest {
    private Smartphone smartphone;
    private User user1;
    private User user2;
    private User user3;

    @BeforeEach
    public void setUp() {
        // Create a new smartphone and users before each test
        smartphone = new Smartphone();
        user1 = new User("Alice");
        user2 = new User("Bob");
        user3 = new User("Charlie");
    }

    @Test
    public void testSingleUserNotification() {
        // Add only one user to the smartphone
        smartphone.addObserver(user1);

        // Simulate a notification being sent to the user
        smartphone.setLatestNotification("New headphones available!");

        // Check if the user received the notification
        assertEquals("New headphones available!", user1.getLastNotification());
    }

    @Test
    public void testMultipleUsersNotifications() {
        // Add all three users to the smartphone
        smartphone.addObserver(user1);
        smartphone.addObserver(user2);
        smartphone.addObserver(user3);

        // Simulate a notification being sent to the users
        smartphone.setLatestNotification("Upcoming sale this weekend!");

        // Check if all users received the notification
        assertEquals("Upcoming sale this weekend!", user1.getLastNotification());
        assertEquals("Upcoming sale this weekend!", user2.getLastNotification());
        assertEquals("Upcoming sale this weekend!", user3.getLastNotification());
    }

    @Test
    public void testUserUnsubscribe() {
        // Add all three users to the smartphone
        smartphone.addObserver(user1);
        smartphone.addObserver(user2);
        smartphone.addObserver(user3);

        // Bob unsubscribes from notifications
        smartphone.deleteObserver(user2);

        // Simulate a notification being sent to the users
        smartphone.setLatestNotification("New update available!");

        // Check if only Alice and Charlie received the notification
        assertEquals("New update available!", user1.getLastNotification());
        assertEquals(null, user2.getLastNotification());
        assertEquals("New update available!", user3.getLastNotification());
    }

    @Test
    public void testNoNotificationWhenNoUsers() {
        // Simulate a notification being sent to an empty list of users
        smartphone.setLatestNotification("This notification should not be received.");

        // Check if no users received the notification
        assertTrue(user1.getLastNotification() == null);
        assertTrue(user2.getLastNotification() == null);
        assertTrue(user3.getLastNotification() == null);
    }
}