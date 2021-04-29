import java.awt.Color;

public class Circle extends Shape {
    private double radius;
    private MovablePoint center;


    public Circle(double radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    public Circle(double radius, Color color, boolean filled, MovablePoint center) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    public void uniqueCircleMethod() {
        System.out.println("this is a unique circle method!");
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return String.format("ID: %s\nRadius: %s\nColor: %s\nFilled: %s\n%s",getId() , getRadius(), getColor(), isFilled(), getCenter().toString());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }

    @Override
    public void moveUp(double distance) {
        this.center.y += distance;
    }

    @Override
    public void moveDown(double distance) {
        this.center.y -= distance;
    }

    @Override
    public void moveRight(double distance) {
        this.center.x += distance;
    }

    @Override
    public void moveLeft(double distance) {
        this.center.x -= distance;
    }
}
