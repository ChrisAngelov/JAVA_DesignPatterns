package Classes;

import java.util.Observable;
import java.util.Observer;
public class User implements Observer {
    private String name;
    private String lastNotification;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            lastNotification = (String) arg;
            System.out.println(name + " received a notification: " + lastNotification);
        }
    }

    public String getLastNotification() {
        return lastNotification;
    }
}