import java.awt.Color;
public class Triangle extends Shape {
    private double side;
    private MovablePoint topCorner, leftCorner, rightCorner;


    public Triangle(double side, MovablePoint topCorner, MovablePoint leftCorner, MovablePoint rightCorner) {
        this.side = side;
        this.topCorner = topCorner;
        this.leftCorner = leftCorner;
        this.rightCorner = rightCorner;
    }

    public Triangle(double side, Color color, boolean filled, MovablePoint topCorner, MovablePoint leftCorner, MovablePoint rightCorner) {
        this.side = side;
        this.topCorner = topCorner;
        this.leftCorner = leftCorner;
        this.rightCorner = rightCorner;
    }

    @Override
    public String toString() {
        return String.format("ID: %s\nSide: %s\nHeight: %s\nColor: %s\nFilled: %s\nTop corner: %s\nLeft corner: %s\nRight corner: %s", getId(), side, getHeight(), getColor(), isFilled());
    }
    @Override
    public double getPerimeter() {
        return side*3;
    }

    public double getSide() {
        return side;
    }

    public double getHeight() {
        return (side * Math.sqrt(3.0)) / 2;
    }

    @Override
    public double getArea() {
        return (side * getHeight()) / 2;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public MovablePoint getTopCorner() {
        return topCorner;
    }

    public void setTopCorner(MovablePoint topCorner) {
        this.topCorner = topCorner;
    }

    public MovablePoint getLeftCorner() {
        return leftCorner;
    }

    public void setLeftCorner(MovablePoint leftCorner) {
        this.leftCorner = leftCorner;
    }

    public MovablePoint getRightCorner() {
        return rightCorner;
    }

    public void setRightCorner(MovablePoint rightCorner) {
        this.rightCorner = rightCorner;
    }
    @Override
    public void moveUp(double distance) {
        this.topCorner.y += distance;
        this.leftCorner.y += distance;
        this.rightCorner.y += distance;
    }

    @Override
    public void moveDown(double distance) {
        this.topCorner.y -= distance;
        this.leftCorner.y -= distance;
        this.rightCorner.y -= distance;
    }

    @Override
    public void moveRight(double distance) {
        this.topCorner.x += distance;
        this.leftCorner.x += distance;
        this.rightCorner.x += distance;
    }

    @Override
    public void moveLeft(double distance) {
        this.topCorner.x -= distance;
        this.leftCorner.x -= distance;
        this.rightCorner.x -= distance;
    }

}
