package Classes.States;

import Classes.Entities.Smartphone;

public class VibrationState extends SmartphoneState {
    @Override
    public void pressButton(Smartphone smartphone) {
        smartphone.setState(new IdleState());
    }
}
