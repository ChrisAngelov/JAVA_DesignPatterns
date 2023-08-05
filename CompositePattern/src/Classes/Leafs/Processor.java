package Classes.Leafs;

import Interfaces.SmartphoneComponent;

public class Processor implements SmartphoneComponent {
    @Override
    public void displayInfo() {
        System.out.println("Qualcomm Snapdragon 7 Plus Gen 2 2910 MHz");
    }
}
