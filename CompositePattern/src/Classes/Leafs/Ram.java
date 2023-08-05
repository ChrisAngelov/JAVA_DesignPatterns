package Classes.Leafs;

import Interfaces.SmartphoneComponent;

public class Ram implements SmartphoneComponent {
    @Override
    public void displayInfo() {
        System.out.println("8GM of RAM");
    }
}
