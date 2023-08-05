package Classes.States;

import Classes.Entities.Smartphone;

public class RingingState extends SmartphoneState {
    @Override
    public void pressButton(Smartphone smartphone) {
        smartphone.setState(new SilentState());
    }
}

