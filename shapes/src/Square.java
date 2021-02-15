import java.awt.*;

public class Square extends Shape{
    double side;

    public Square() {
        this.side = 1.0;
        color = Color.GREEN;
        setFilled(true);
    }

    public Square(double side) {
        this.side = side;
        color = Color.GREEN;
        setFilled(true);
    }

    public Square(double side, Color color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getArea() {
        return side*side;
    }

    public double getPerimeter() {
        return side + side + side + side;
    }

    public double getLength() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void printState() {
        System.out.println("Area: " + getArea() + "\nPerimeter: " + getPerimeter()
        );
    }
}
