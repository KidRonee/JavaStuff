import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.awt.Color;
import java.util.stream.Collectors;

public class Program {
    HashMap<Integer, Shape> shapes = new HashMap<>();

    public void addSamples() {
        Rectangle r1 = new Rectangle(1, 50, 50);
        Rectangle r2 = new Rectangle(2, 23, 12);
        Rectangle r3 = new Rectangle(3, 1, 1);
        Circle c4 = new Circle(4, 500);
        Circle c5 = new Circle(5, 10);
        Circle c6 = new Circle(6, 2);
        Triangle t7 = new Triangle(7, 7, 7);
        Triangle t8 = new Triangle(8, 100, 100);
        Triangle t9 = new Triangle(9, 33, 33);
        shapes.put(1, r1);
        shapes.put(2, r2);
        shapes.put(3, r3);
        shapes.put(4, c4);
        shapes.put(5, c5);
        shapes.put(6, c6);
        shapes.put(7, t7);
        shapes.put(8, t8);
        shapes.put(9, t9);
    }

    public void checkCircles() {
        System.out.println("Checking circles");
        System.out.println("---------------------");
        Circle c1 = new Circle(1);
        System.out.printf("Circle with id=1:%s%n", c1);
        shapes.put(1, c1);
        Circle c2 = new Circle(2, 2.0);
        System.out.printf("Circle with id=%s and r=%s:%s%n", c2.getId(), c2.getRadius(), c2);
        shapes.put(2, c2);
        Circle c3 = new Circle(3, 3.0, Color.BLUE, false);
        shapes.put(3, c3);
        System.out.printf("Area: %s\nPerimeter: %s\n", c3.getArea(), c3.getPerimeter());
        System.out.println("Checking circles done!");
        System.out.println("----------------------");
    }

    public void checkSquares(){
        System.out.println("Checking squares");
        System.out.println("----------------------");
        Square s1 = new Square(4);
        System.out.printf("Square with id=4:%s%n", s1);
        shapes.put(4, s1);
        Square s2 = new Square(5, 5);
        System.out.printf("Square with id=5 and side=5:%s%n", s2);
        shapes.put(5, s2);
        Square s3 = new Square(6, 5, Color.BLUE, true);
        System.out.printf("Blue filled square with id=6 and side=5:%s%n", s3);
        shapes.put(6, s3);
        System.out.printf("Area:%s, Perimeter:%s%n", s3.getArea(), s3.getPerimeter());
        System.out.println("Checking square done");
        System.out.println("----------------------");
    }

    public void checkRectangles() {
        System.out.println("Checking rectangles");
        System.out.println("----------------------");
        Rectangle r1 = new Rectangle(7);
        System.out.printf("Rectangle with id=7:%s%n", r1);
        shapes.put(7, r1);
        Rectangle r2 = new Rectangle(8, 3, 4);
        System.out.printf("Rectangle with id=8, width=3 and length=4:%s%n", r2);
        shapes.put(8, r2);
        Rectangle r3 = new Rectangle(9, 3, 4, Color.LIGHT_GRAY, false);
        System.out.printf("Blue non-filled rectangle with id=9, width=3 and length=4:%s%n", r3);
        shapes.put(9, r3);
        System.out.printf("Area:%s, Perimeter:%s%n", r3.getArea(), r3.getPerimeter());
        System.out.println("Checking rectangle done");
        System.out.println("----------------------");
    }

    public void printHashMapContentUsingToString() {
        System.out.println("Printing HashMap content using toString:");
        System.out.println(shapes);
        System.out.println("Done printing HashMap content using toString");
        System.out.println("----------------------");
    }

    public void printHashMapUsingForEachLoop() {
        System.out.println("Printing HashMap content using for-each:");
        for (Shape shape : shapes.values()) {
            System.out.println(shape.toString());
        }
        System.out.println("Done printing HashMap content using for-each");
        System.out.println("----------------------");
    }

    public void printHashMapElement(int id) {
        Shape s = shapes.get(id);
        if (s != null) {
            System.out.printf("Look what I found with id = %s:%n%s%n", id, s);
        } else {
            System.out.printf("Sorry, can't find any shape with id = %s:%n", id);
        }

    }

    public void hashMyCode() {
        for (Map.Entry mapElement : shapes.entrySet()) {
            Integer key = (Integer)mapElement.getKey();

            Shape value = (Shape) mapElement.getValue();

            System.out.println(key + " : " + value);
        }
    }

    public List<Shape> printBigShapes(double perimeter) {
        return shapes.values().stream().filter(shape->shape.getPerimeter()>perimeter).collect(Collectors.toList());

    }




}
