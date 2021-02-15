import java.awt.*;

public class Triangle extends Shape {
    double width;
    double height;


    public Triangle () {
        this.width = 2;
        this.height = 3;
        setColor(Color.BLUE);
        setFilled(true);
    }

    public Triangle(double width, double height) {
        this.width = width;
        this. height = height;
        setColor(Color.BLUE);
        setFilled(true);
    }

    public Triangle(double width, double height, Color color, boolean filled) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.filled = filled;
    }

    public void printState() {
        System.out.println("Area: " + getArea() + "\nPerimeter: " + getPerimeter()
                + "\nColor: " + getColor() + "\nIs filled: " + isFilled());
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
}
