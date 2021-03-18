import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    boolean exit;
    ArrayList<String> shapes = new ArrayList<String>();
    ArrayList<Shape> actualShapes = new ArrayList<Shape>();

    public Program() throws IOException {
        readShapesFromFile();
        createShapesFromArrayList();
        banner();
        while (!exit) {
            getInput();
        }
        //printActualArray();

    }

    public void printMenu() {
        System.out.println("Press 1 to print all shapes.");
        System.out.println("Press 2 to get the total area of all the squares.");
        System.out.println("Press 3 to add a new shape (circle, square or rectangle).");
        System.out.println("Press 4 to exit!");
    }

    public void banner () {
        System.out.println("+---------------------------------------------------------------------+");
        System.out.println("|                    |___________________________|                    |");
        System.out.println("|                    |===========================|                    |");
        System.out.println("|                    |===========================|                    |");
        System.out.println("|     |=========================================================|     |");
        System.out.println("|  |===============================================================|  |");
        System.out.println("|         (         (         (         )         )         )         |");
        System.out.println("|        (         (         (           )         )         )        |");
        System.out.println("|       (  ====   (  ====   ( ====   ==== )    ==== )    ==== )       |");
        System.out.println("|        (      #  (      #  (     #     )    #    )    #    )        |");
        System.out.println("|         (         (         (         )         )         )         |");
        System.out.println("|          (_________(_________(_______)_________)_________)          |");
        System.out.println("|                                                                     |");
        System.out.println("+---------------------------------------------------------------------+");

    }

    private void getInput() {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice < 0 || choice > 4) {
            try {
                printMenu();
                System.out.print("\nEnter a number:\n>");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        printActualArray();
                        break;
                    case 2:
                        sumAreaOfSquaresInShapeArrayList();
                        break;
                    case 3:
                        System.out.println("This function is not yet available.");
                        break;
                    case 4:
                        System.out.println("Good bye!");
                        exit = true;
                        break;
                    default:
                        System.out.println("Enter a valid option");
                        break;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid exception, please enter a valid number!");
            }
        }
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
        for (Shape shape: actualShapes) {
            System.out.println(shape.toString());
            System.out.println("----------------------------------------------------------------------------------------");
        }
    }

    public void sumAreaOfSquaresInShapeArrayList() {
        int i = 0;
        for (Shape square : actualShapes) {
            i += square.getArea();
        }
        System.out.println(i);
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