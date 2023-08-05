package Classes.Leafs;

import Interfaces.SmartphoneComponent;

public class Camera implements SmartphoneComponent {
    @Override
    public void displayInfo() {
        System.out.println("Camera: 32MP");
    }
}