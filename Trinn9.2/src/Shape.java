import java.awt.Color;

public abstract class Shape implements Movable {
    private Color color;
    private boolean filled;
    private final int id;
    private static int counter;


    public Shape() {
        this.color = Color.RED;
        this.filled = true;
        this.id = counter++;
    }

    public Shape(Color color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.id = counter++;
    }

    public abstract String toString();
    public abstract double getArea();
    public abstract double getPerimeter();

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

    public int getId() {
        return id;
    }


}
