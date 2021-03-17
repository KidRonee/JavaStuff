import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public Program() throws IOException {
        readShapesFromFile();
        createShapesFromArrayList();
        printActualArray();
    }

    ArrayList<String> shapes = new ArrayList<String>();
    ArrayList<Shape> actualShapes = new ArrayList<Shape>();

    public void dummyMethod(){
        Circle circle = new Circle(2, Color.DARK_GRAY, false, new MovablePoint(0.0, 0.0));
        System.out.println(circle);
    }

    public void readShapesFromFile() throws IOException {
        FileReader reader = new FileReader("C:\\Users\\Mathi\\Desktop\\shapes.txt");
        Scanner scanShapes = new Scanner(reader);
        while(scanShapes.hasNextLine()) {
                shapes.add(scanShapes.nextLine());
        }
        reader.close();
    }

    public void createShapesFromArrayList() {
        final String circle = "Circle";
        final String square = "Square";
        final String rectangle = "Rectangle";

        for (int i = 0; i < shapes.size(); i++) {
            switch (shapes.get(i)) {
                case circle:
                    actualShapes.add(new Circle(Double.parseDouble(shapes.get(i+1)), new Color(Integer.parseInt(shapes.get(i+2)), Integer.parseInt(shapes.get(i+3)), Integer.parseInt(shapes.get(i+4))),Boolean.parseBoolean(shapes.get(i+5)), new MovablePoint(Double.parseDouble(shapes.get(i+6)), Double.parseDouble(shapes.get(i+7)))));
                    break;
                case square:
                    actualShapes.add(new Square(Double.parseDouble(shapes.get(i+1)), new Color(Integer.parseInt(shapes.get(i+2)), Integer.parseInt(shapes.get(i+3)), Integer.parseInt(shapes.get(i+4))), Boolean.parseBoolean(shapes.get(i+5)), new MovablePoint(Double.parseDouble(shapes.get(i+6)), Double.parseDouble(shapes.get(i+7))), new MovablePoint(Double.parseDouble(shapes.get(i+8)), Double.parseDouble(shapes.get(i+9)))));
                    break;
                case rectangle:
                    actualShapes.add(new Rectangle(Double.parseDouble(shapes.get(i+1)), Double.parseDouble(shapes.get(i+2)), new Color(Integer.parseInt(shapes.get(i+3)), Integer.parseInt(shapes.get(i+4)), Integer.parseInt(shapes.get(i+5))), Boolean.parseBoolean(shapes.get(i+6)), new MovablePoint(Double.parseDouble(shapes.get(i+7)), Double.parseDouble(shapes.get(i+8))), new MovablePoint(Double.parseDouble(shapes.get(i+9)), Double.parseDouble(shapes.get(i+10)))));
                    break;
                default:
                    break;
            }
        }
    }

    public void printActualArray() {
        for (Shape shape: actualShapes
             ) {
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println(shape.toString());
        }
    }


    /*
    while(!scanShapes.nextLine().equals("Rectangle") || !scanShapes.nextLine().equals("Square") || !scanShapes.nextLine().equals("Circle")) {
                    while(scanShapes.hasNextLine()) {
                        String name = scanShapes.nextLine();
                        radius = Double.parseDouble(scanShapes.nextLine());
                        color = new Color(Integer.parseInt(scanShapes.nextLine()), Integer.parseInt(scanShapes.nextLine()), Integer.parseInt(scanShapes.nextLine()));
                        filled = Boolean.parseBoolean(scanShapes.nextLine());
                        center = new MovablePoint(Double.parseDouble(scanShapes.nextLine()), Double.parseDouble(scanShapes.nextLine()));
                    }
                }
                shapeInfo.add(new Circle(radius, color, filled, center));
     */

    public void printArray() {
        System.out.println(shapes);
    }
}