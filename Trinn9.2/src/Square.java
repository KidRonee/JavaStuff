import java.awt.*;

public class Square extends Shape {
    private double side;
    private MovablePoint topLeft, bottomRight;


    public Square(double side, MovablePoint topLeft, MovablePoint bottomRight) {
        this.side = side;
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        checkShapeLogic();
    }

    public Square(double side, Color color, boolean filled, MovablePoint topLeft, MovablePoint bottomRight) {
        super(color, filled);
        this.side = side;
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        checkShapeLogic();
    }


    public void checkShapeLogic() {
        if(topLeft.y < bottomRight.y || topLeft.x > bottomRight.x)
            throw new IllegalArgumentException("Square corners are illegal");
    }

    @Override
    public String toString() {
        return String.format("ID: %s\nSide: %s\nColor: %s\nFilled: %s\nTop left corner:\n%s\nBottom right corner:\n%s", getId(), side, getColor(), isFilled(), getTopLeft().toString(), getBottomRight().toString());

    }
    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return side*4;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public MovablePoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MovablePoint topLeft) {
        this.topLeft = topLeft;
    }

    public MovablePoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MovablePoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    @Override
    public void moveUp(double distance) {
        this.topLeft.y += distance;
        this.bottomRight.y += distance;
    }

    @Override
    public void moveDown(double distance) {
        this.topLeft.y -= distance;
        this.bottomRight.y -= distance;
    }

    @Override
    public void moveRight(double distance) {
        this.topLeft.x += distance;
        this.bottomRight.x += distance;
    }

    @Override
    public void moveLeft(double distance) {
        this.topLeft.x -= distance;
        this.bottomRight.x -= distance;
    }
}
