import java.awt.*;

public abstract class Shape implements Movable {

    private Color color;
    private boolean filled;

    public Shape(Color color, boolean filled) {
        this.color = color;
        this.filled = filled;
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

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        if(this.isFilled()) {
            return String.format("A Shape with color of %s and filled.", color.toString());
        }
        return String.format("A shape with color of %s and not filled", color.toString());
    }
}
