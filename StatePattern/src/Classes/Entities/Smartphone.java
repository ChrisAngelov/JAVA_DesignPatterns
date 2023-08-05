package Classes.Entities;

import Classes.States.IdleState;
import Classes.States.SmartphoneState;

public class Smartphone {
    private SmartphoneState state;

    public Smartphone() {
        this.state = new IdleState();  // Initial state
    }

    public void setState(SmartphoneState state) {
        this.state = state;
    }
    public SmartphoneState getState() {
        return this.state;
    }
    public void pressButton() {
        state.pressButton(this);
    }
}
