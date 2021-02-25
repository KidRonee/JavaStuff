import java.awt.*;

public class Circle extends Shape {
    private double radius;

    public Circle(int id) {
        super(id);
        this.radius = 1.0;
    }

    public Circle(int id, double radius) {
        super(id);
        this.radius = radius;
    }

    public Circle(int id, double radius, Color  color, boolean filled) {
        super(id, color, filled);
        this.radius = radius;
    }

    public String toString() {
        return String.format("A circle with radius = %s, which is a subclass of %s", radius, super.toString());
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
