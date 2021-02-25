package Shape;

import org.junit.jupiter.api.Test;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void createTriangleEmptyConstructor() {
        Triangle triangle = new Triangle(10);
        assertTrue(triangle.isFilled());
        assertEquals(triangle.getHeight(), 3);
        assertEquals(triangle.getColor(), Color.BLUE);
    }

    @Test
    void createTriangleWithSideConstructor() {
        Triangle triangle = new Triangle(10, 20, 30);
        assertTrue(triangle.isFilled());
        assertEquals(triangle.getHeight(), 30);
        assertEquals(triangle.getColor(), Color.BLUE);
    }

    @Test
    void createTriangleFullConstructor() {
        Triangle triangle = new Triangle(10, 20, 30, Color.YELLOW, false);
        assertFalse(triangle.isFilled());
        assertEquals(triangle.getHeight(), 30);
        assertEquals(triangle.getColor(), Color.YELLOW);
    }

    @Test
    void getArea() {
        Triangle triangle = new Triangle( 10, 5, 6);
        assertEquals(triangle.getArea(), 15);
    }

    @Test
    void getPerimeter() {
        Triangle triangle = new Triangle(10, 5, 6);
        assertEquals(triangle.getPerimeter(), 15);
    }

}
