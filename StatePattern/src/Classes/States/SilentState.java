package Classes.States;

import Classes.Entities.Smartphone;

public class SilentState extends SmartphoneState {
    @Override
    public void pressButton(Smartphone smartphone) {
        smartphone.setState(new VibrationState());
    }
}
