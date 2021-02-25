import java.awt.*;
import java.util.HashMap;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(int id) {
        super(id);
        this.width = 1.0;
        this.length = 2.0;
    }

    public Rectangle(int id, double width, double length) {
        super(id, Color.GREEN, true);
        this.width = width;
        this.length = length;
    }

    public Rectangle(int id, double width, double length, Color color, boolean filled) {
        super(id, color, true);
        this.width = width;
        this.length = length;
    }

    public void printState() {
        System.out.println("Area: " + getArea() + "\nPerimeter: " + getPerimeter()
                + "\nColor: " + getColor() + "\nIs filled: " + isFilled());
    }

    public double getPerimeter() {
        return (getWidth()*2) + (getLength()*2);
    }

    public double getArea () {
        return getWidth()*getLength();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String toString() {
        return "A Rectangle with width = " + width + " and length = " + length + ", which is a subclass of " + super.toString();
    }
}
