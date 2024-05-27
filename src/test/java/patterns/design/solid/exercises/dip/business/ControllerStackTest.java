package patterns.design.solid.exercises.dip.business;

import org.junit.jupiter.api.Test;
import patterns.design.solid.exercises.dip.bbdd.InventoryBBDD;

import static org.junit.jupiter.api.Assertions.*;

class ControllerStackTest {
    @Test
    public void test_control_stack() {
        ControllerStack controller = new ControllerStack(new InventoryBBDD());

        assertFalse(controller.needSet("tienda norte", "mesa"));
        assertTrue(controller.needSet("tienda norte", "lampara"));

    }

}