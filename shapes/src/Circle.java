import java.awt.*;

public class Circle extends Shape {
    double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(Color  color, boolean filled, double radius) {
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }

    public void printState() {
        System.out.println("Color:" + getColor() + "\nIs filled: " + isFilled() + "\nRadius: " +getRadius());
    }

    public double getArea() {
        return (Math.PI*(radius*radius));
    }

    public double getPerimeter() {
        return (2*Math.PI*radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
