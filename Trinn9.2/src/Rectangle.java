import java.awt.Color;

public class Rectangle extends Shape {
    private double width;
    private double height;
    private MovablePoint topLeft, bottomRight;

    public Rectangle(double width, double height, MovablePoint topLeft, MovablePoint bottomRight) {
        this.width = width;
        this.height = height;
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        checkShapeLogic();

    }

    public Rectangle(double width, double height, Color color, boolean filled, MovablePoint topLeft, MovablePoint bottomRight) {
        super(color, filled);
        this.width = width;
        this.height = height;
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        checkShapeLogic();


    }

    public void checkShapeLogic() {
        if(topLeft.y < bottomRight.y || topLeft.x > bottomRight.x)
            throw new IllegalArgumentException("Rectangle corners are illegal");
        if(width != bottomRight.x - topLeft.x || height != topLeft.y - bottomRight.y)
            throw new IllegalArgumentException("Rectangle corners don't add up");
    }

    @Override
    public String toString() {
        return String.format("ID: %s\nHeight : %s\nWidth: %s\nColor: %s\nFilled: %s\nTop left corner:\n%s\nBottom right corner:\n%s", getId(), height, width, getColor(), isFilled(), getTopLeft().toString(), getBottomRight().toString());
    }
    @Override

    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return (width*2) + (height*2);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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
