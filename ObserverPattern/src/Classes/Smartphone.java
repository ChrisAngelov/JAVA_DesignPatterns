package Classes;

import java.util.Observable;
import java.util.Observer;
public class Smartphone extends Observable {
    private String latestNotification;

    public void setLatestNotification(String notification) {
        latestNotification = notification;
        setChanged();
        notifyObservers(notification);
    }

    public String getLatestNotification() {
        return latestNotification;
    }
}
