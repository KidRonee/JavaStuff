import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
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
        System.out.println("|                                                                     |");
        System.out.println("|          _________________________________________________          |");
        System.out.println("|         (         (         (         )         )         )         |");
        System.out.println("|        (         (         (           )         )         )        |");
        System.out.println("|       (  ====   (  ====   ( ====   ==== )    ==== )    ==== )       |");
        System.out.println("|        (      .  (      .  (     ..     )    .    )    .    )        |");
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
                        userCreateShape();
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

    public void printArray() {
        System.out.println(shapes);
    }

    public void getCircleMeasuresFromUser() {
        double radius;
        double x;
        double y;
        Color color;
        String stringColor;
        boolean filled = false;
        MovablePoint center;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius:\n>");
        radius = input.nextInt();
        System.out.print("Enter a color:\n>");
        input.next(); // reactivates input
        stringColor = input.nextLine().toUpperCase();
        color = Color.getColor(stringColor);
        System.out.print("Enter true or false for filled:\n>");
        switch (input.nextLine().toLowerCase()) {
            case "true":
                filled  = true;
                break;
            case "False":
                filled  = false;
                break;
            default:
                System.out.println("Enter true or false");
        }
        System.out.print("Enter the circle's x position:\n>");
        x = input.nextInt();
        System.out.print("Enter the circle's y position:\n>");
        y = input.nextInt();
        center = new MovablePoint(x, y);
        actualShapes.add(new Circle(radius, color, filled, center));
    }

    public void getRectangleMeasuresFromUser() {
        double width;
        double length;
        double topX;
        double topY;
        double bottomX;
        double bottomY;
        Color color;
        boolean filled = false;
        MovablePoint topLeft;
        MovablePoint bottomRight;
        String stringColor;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a width:\n>");
        width = input.nextInt();
        System.out.print("Enter a length:\n>");
        length = input.nextInt();
        System.out.print("Enter a color:\n>");
        input.next(); // reactivates input
        stringColor = input.nextLine().toUpperCase();
        color = Color.getColor(stringColor);
        System.out.print("Enter true or false for filled:\n>");
        switch (input.nextLine().toLowerCase()) {
            case "true":
                filled = true;
                break;
            case "False":
                filled = false;
                break;
            default:
                System.out.println("Enter true or false");
        }
        System.out.print("Enter the Rectangle's top x position:\n>");
        topX = input.nextInt();
        System.out.print("Enter the Rectangle's top y position:\n>");
        topY = input.nextInt();
        System.out.print("Enter the Rectangle's bottom x position:\n>");
        bottomX = input.nextInt();
        System.out.print("Enter the Rectangle's bottom y position:\n>");
        bottomY = input.nextInt();
        topLeft = new MovablePoint(topX, topY);
        bottomRight = new MovablePoint(bottomX, bottomY);
        actualShapes.add(new Rectangle(width, length, color, filled, topLeft, bottomRight));
    }

    public void getSquareMeasuresFromUser() {
        double side;
        double topX;
        double topY;
        double bottomX;
        double bottomY;
        Color color;
        boolean filled = false;
        MovablePoint topLeft;
        MovablePoint bottomRight;
        String stringColor;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a width:\n>");
        side = input.nextInt();
        System.out.print("Enter a color:\n>");
        input.next(); // reactivates input
        stringColor = input.nextLine().toUpperCase();
        color = Color.getColor(stringColor);
        System.out.print("Enter true or false for filled:\n>");
        switch (input.nextLine().toLowerCase()) {
            case "true":
                filled = true;
                break;
            case "False":
                filled = false;
                break;
            default:
                System.out.println("Enter true or false");
        }
        System.out.print("Enter the Rectangle's top x position:\n>");
        topX = input.nextInt();
        System.out.print("Enter the Rectangle's top y position:\n>");
        topY = input.nextInt();
        System.out.print("Enter the Rectangle's bottom x position:\n>");
        bottomX = input.nextInt();
        System.out.print("Enter the Rectangle's bottom y position:\n>");
        bottomY = input.nextInt();
        topLeft = new MovablePoint(topX, topY);
        bottomRight = new MovablePoint(bottomX, bottomY);
        actualShapes.add(new Square(side, color, filled, topLeft, bottomRight));
    }


        public void userCreateShape() {
        System.out.println("What shape would you like to create?\nCircle\nRectangle\nSquare");
        Scanner input = new Scanner(System.in);
        switch (input.nextLine().toLowerCase()) {
            case "circle":
                getCircleMeasuresFromUser();
                break;
            case "rectangle":
                getRectangleMeasuresFromUser();
                break;
            case "square":
                getSquareMeasuresFromUser();
                break;
            default:
                System.out.println("Enter a shape from the list above.");

        }
    }
}