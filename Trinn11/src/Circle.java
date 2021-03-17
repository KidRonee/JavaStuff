import java.awt.*;

public class Circle extends Shape {
    private double radius;
    MovablePoint center;

    public Circle(double radius, Color color, boolean filled, MovablePoint center) {
        super(color,filled);
        this.radius = radius;
        this.center = center;

    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (radius*radius)*Math.PI;
    }
    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    public MovablePoint getCenter() {
        return center;
    }
    public void setCenter(MovablePoint center) {
        this.center = center;
    }
    @Override
    public String toString() {
        // Using the String class static method "format" as an alternative string concatenation.
        return String.format("A Circle with radius = %s, \nwhich is a subclass of %s\nThe circle has a x and y location of:\n%s",
                radius, super.toString(), center.toString()); // Look! I can call my parent version of toString:)
    }
    public void uniqueCricleMethod() {
        System.out.println("Hello, I'm Circle!");
    }

    @Override
    public void moveUp(double distance) {
        center.moveUp(distance);
    }

    @Override
    public void moveDown(double distance) {
        center.moveDown(distance);
    }

    @Override
    public void moveRight(double distance) {
        center.moveRight(distance);
    }

    @Override
    public void moveLeft(double distance) {
        center.moveLeft(distance);
    }


}