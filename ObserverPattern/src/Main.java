import Classes.Smartphone;
import Classes.User;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Create a smartphone
        Smartphone smartphone = new Smartphone();

        // Create users
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Charlie");

        // Add users as observers to the smartphone
        smartphone.addObserver(user1);
        smartphone.addObserver(user2);
        smartphone.addObserver(user3);

        // Simulate a notification being sent to the users
        smartphone.setLatestNotification("New software update available!");

        // Bob unsubscribes from notifications
        smartphone.deleteObserver(user2);

        // Simulate another notification being sent to the users
        smartphone.setLatestNotification("Upcoming sale this weekend!");
    }
}