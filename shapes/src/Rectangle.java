import java.awt.*;

public class Rectangle extends Shape {
    double width;
    double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 2.0;
        setColor(Color.GREEN);
        setFilled(true);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        setFilled(true);
        setColor(Color.GREEN);
    }

    public Rectangle(double width, double length, Color color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
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
}
