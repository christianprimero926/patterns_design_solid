package course.udemy.exercises.solid.dip.business;

import course.udemy.exercises.solid.dip.bbdd.InventoryBBDD;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerStackTest {
    @Test
    public void test_control_stack() {
        ControllerStack controller = new ControllerStack(new InventoryBBDD());

        assertFalse(controller.needSet("tienda norte", "mesa"));
        assertTrue(controller.needSet("tienda norte", "lampara"));

    }

}