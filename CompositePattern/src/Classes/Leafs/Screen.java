package Classes.Leafs;

import Interfaces.SmartphoneComponent;

public class Screen implements SmartphoneComponent {
    @Override
    public void displayInfo() {
        System.out.println("Screen: 14 cm, OLED");
    }
}