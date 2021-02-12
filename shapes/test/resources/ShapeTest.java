import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    @Test
    void createShapeEmptyConstructor() {
        Shape shape = new Shape();
        assertTrue(shape.isFilled());
        assertEquals(Color.RED, shape.getColor());
    }

    @Test
    void createShapeFullConstructor() {
        Shape shape = new Shape(Color.CYAN, false);
        assertFalse(shape.isFilled());
        assertEquals(Color.CYAN, shape.getColor());
    }
}