package Classes.Leafs;

import Interfaces.SmartphoneComponent;

public class Battery implements SmartphoneComponent {
    @Override
    public void displayInfo() {
        System.out.println("Battery: 4000mAh");
    }
}

