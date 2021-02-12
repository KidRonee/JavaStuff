import java.awt.*;

public class Shape {
    Color color;
    boolean filled;

    public Shape() {
        this.color = Color.red;
    }

    public Shape(Color color, boolean filled) {
        this.color = color;
        this.filled = filled;

    }

    public void printState() {
        System.out.println("Color: " + getColor() + "\nIs filled: " + isFilled());
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
