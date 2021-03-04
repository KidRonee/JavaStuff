import java.awt.*;

public class Circle extends Shape {

    private double radius;
    MovablePoint center;

    /*
        Let's have only one constructor. We require that all fields are populated through constructor.
        We now have no alternative options when creating a circle object.
     */
    public Circle(int radius, Color color, boolean filled, MovablePoint center) {
        super(color,filled);
        this.radius = radius;
        this.center = center;

    }

    //Getter for radius
    public double getRadius() {
        return radius;
    }

    //Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /*
        We override the abstract method getArea in Shape.
        If we do not do this, this class (Circle) must be abstract as we are missing
        implementation details for an abstract method defined in class Shape.
     */
    @Override
    public double getArea() {
        return (radius*radius)*Math.PI;
    }

    /*
        We override the abstract method getPerimeter in Shape.
        If we do not do this, this class (Circle) must be abstract as we are missing
        implementation details for an abstract method defined in class Shape.
     */
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

    /*
            We override a method from the Object class.
            Remember that all classes inherit from the Object class.
            It is normal to override this method as the method
            inherited from Object provides little information.
         */
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