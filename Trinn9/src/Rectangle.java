import java.awt.*;

public class Rectangle extends Shape {
    private double width;
    private double length;
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    /*
        Let's have only one constructor. We require that all fields are populated through constructor.
        We now have no alternative options when creating a rectangle object.
     */
    Rectangle(double width, double length, Color color, boolean filled, MovablePoint topLeft, MovablePoint bottomRight) {
        super(color, filled);
        if(topLeft.getX() > bottomRight.getX() || topLeft.getY() < bottomRight.getY()) {
            throw new IllegalArgumentException("Invalid position(s)");
        }
        if (bottomRight.getX() - topLeft.getX() != width) {
            throw new IllegalArgumentException("Width and position doesn't match");
        }
        if (topLeft.getY() - bottomRight.getY() != length) {
            throw new IllegalArgumentException("Length and position doesn't match");
        }

        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;

    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    /*
        We override the abstract method getArea in Shape.
        If we do not do this, this class (Rectangle) must be abstract as we are missing
        implementation details for an abstract method defined in class Shape.
    */
    public double getArea() {
        return length * width;
    }

    /*
        We override the abstract method getPerimeter in Shape.
        If we do not do this, this class (Rectangle) must be abstract as we are missing
        implementation details for an abstract method defined in class Shape.
    */
    public double getPerimeter() {
        return 2 * (length + width);
    }

    public MovablePoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MovablePoint topLeft) {
        if(topLeft.getX() > this.bottomRight.getX() || topLeft.getY() < this.bottomRight.getY()) {
            throw new IllegalArgumentException("Invalid position(s)");
        }

        this.length = topLeft.getY() - bottomRight.getY();
        this.width = bottomRight.getX() - topLeft.getX();
        this.topLeft = topLeft;
    }

    public MovablePoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MovablePoint bottomRight) {
        if(this.topLeft.getX() > bottomRight.getX() || this.topLeft.getY() < bottomRight.getY()) {
            throw new IllegalArgumentException("Invalid position(s)");
        }

        this.length = topLeft.getY() - bottomRight.getY();
        this.width = bottomRight.getX() - topLeft.getX();
        this.bottomRight = bottomRight;
    }

    public String toString() {
        return "A Rectangle with width = " + width + " and length = " +
                length + "\nwhich is a subclass of " + super.toString() + "\nThe Rectangle has its top-left corner at:\n" + topLeft.toString() + "\nThe Rectangle has its bottom-right corner at:\n" + bottomRight.toString();
    }


    public void uniqueRectangleMethod() {
        System.out.println("Hello, I'm Rectangle!");
    }


    @Override
    public void moveUp(double distance) {
        topLeft.moveUp(distance);
        bottomRight.moveUp(distance);
    }

    @Override
    public void moveDown(double distance) {
        topLeft.moveDown(distance);
        bottomRight.moveDown(distance);
    }

    @Override
    public void moveRight(double distance) {
        topLeft.moveRight(distance);
        bottomRight.moveRight(distance);
    }

    @Override
    public void moveLeft(double distance) {
        topLeft.moveLeft(distance);
        bottomRight.moveLeft(distance);
    }


}