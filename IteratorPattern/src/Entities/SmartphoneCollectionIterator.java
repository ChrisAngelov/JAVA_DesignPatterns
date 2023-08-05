package Entities;

import Interfaces.SmartphoneIterator;

public class SmartphoneCollectionIterator implements SmartphoneIterator {
    private Smartphone[] smartphones;
    private int position;

    public SmartphoneCollectionIterator(Smartphone[] smartphones) {
        this.smartphones = smartphones;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < smartphones.length;
    }

    @Override
    public Smartphone next() {
        Smartphone smartphone = smartphones[position];
        position++;
        return smartphone;
    }
}
