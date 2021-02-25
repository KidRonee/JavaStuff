import java.awt.*;

public class Triangle extends Shape {
    private double width;
    private double height;


    public Triangle (int id) {
        super(id);
        this.width = 2;
        this.height = 3;
    }

    public Triangle(int id, double width, double height) {
        super(id, Color.GREEN, true );
        this.width = width;
        this. height = height;
    }

    public Triangle(int id, double width, double height, Color color, boolean filled) {
        super(id, color, filled);
        this.width = width;
        this.height = height;

    }

    public double getArea() {
        return (width*height)/2;
    }

    public double getPerimeter() {
        return width*3;
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

    public String toString() {
        return "A Triangle with width = " + width + " and height = " + height + ", which is a subclass of " + super.toString();
    }
}
