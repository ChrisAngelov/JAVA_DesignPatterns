package Classes.UnitTest;

import Classes.Entities.Smartphone;
import Classes.States.IdleState;
import Classes.States.RingingState;
import Classes.States.SilentState;
import Classes.States.VibrationState;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UnitTest {
    @Test
    public void testPressButton() {
        Smartphone smartphone = new Smartphone();

        // Asserting the initial state
        assertTrue(smartphone.getState() instanceof IdleState);

        // Pressing the button and checking the states
        smartphone.pressButton();
        assertTrue(smartphone.getState() instanceof RingingState);

        smartphone.pressButton();
        assertTrue(smartphone.getState() instanceof SilentState);

        smartphone.pressButton();
        assertTrue(smartphone.getState() instanceof VibrationState);

        smartphone.pressButton();
        assertTrue(smartphone.getState() instanceof IdleState);
    }
}
