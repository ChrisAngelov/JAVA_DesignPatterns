package Classes.Composite;

import Interfaces.SmartphoneComponent;

import java.util.ArrayList;
import java.util.List;


public class InternalComponents implements SmartphoneComponent{
    private List<SmartphoneComponent> components = new ArrayList<>();

    public void addComponent(SmartphoneComponent component) {
        components.add(component);
    }

    public void removeComponent(SmartphoneComponent component) {
        components.remove(component);
    }

    @Override
    public void displayInfo() {
        System.out.println("Internal Components:");
        for (SmartphoneComponent component : components) {
            component.displayInfo();
        }
    }
}
