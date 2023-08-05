package Entities;

import Interfaces.SmartphoneIterator;

public class SmartphoneCollection {
    private Smartphone[] smartphones;
    private int size;

    public SmartphoneCollection(int capacity) {
        smartphones = new Smartphone[capacity];
        size = 0;
    }

    public void addSmartphone(Smartphone smartphone) {
        if (size < smartphones.length) {
            smartphones[size] = smartphone;
            size++;
        } else {
            System.out.println("Smartphone collection is full.");
        }
    }

    public SmartphoneIterator createIterator() {
        return new SmartphoneCollectionIterator(smartphones);
    }
}