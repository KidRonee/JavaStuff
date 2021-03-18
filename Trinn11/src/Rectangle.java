import java.awt.*;

public class Rectangle extends Shape {
    private double width;
    private double length;
    private MovablePoint topLeft;
    private MovablePoint bottomRight;


    Rectangle(double width, double length, Color color, boolean filled, MovablePoint topLeft, MovablePoint bottomRight) {
        super(color, filled);

        /*
        if(topLeft.getX() > bottomRight.getX() || topLeft.getY() < bottomRight.getY()) {
            throw new IllegalArgumentException("Invalid position(s)");
        }
        if (bottomRight.getX() - topLeft.getX() != width) {
            throw new IllegalArgumentException("Width and position doesn't match");
        }
        if (topLeft.getY() - bottomRight.getY() != length) {
            throw new IllegalArgumentException("Length and position doesn't match");
        }
         */

        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
}

    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public double getArea() {
        return length * width;
    }
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




