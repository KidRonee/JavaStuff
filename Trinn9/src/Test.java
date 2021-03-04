import java.awt.*;
import java.util.ArrayList;

/**
 * Test is a class for testing purposes.
 * We test if the assignments work as intended.
 */
public class Test {
    Circle c = new Circle(20, Color.blue, true, new MovablePoint(0.0, 0.0));
    //Rectangle r = new Rectangle(20, 10, Color.YELLOW, true, new MovablePoint(0.0, 0.0), new MovablePoint(1.0, 0.0));
    //Square s = new Square(50, Color.BLUE, true, new MovablePoint(0.0, 0.0), new MovablePoint(0.0, 0.0));
    ArrayList<Shape> arr = new ArrayList<Shape>();


    /**
     * A dummy method to check if the program is working
     * initially after importing files from Canvas.
     */
    public void checkIfEverythingOk(){
        System.out.println("Yes, everything is on stell");
    }
    public void testerTesterTester() {
        arr.add(c);
        //arr.add(r);
        //arr.add(s);
        for (Shape s : arr) {
            System.out.println(s.toString());
        }
        arr.get(0).moveLeft(23);
        arr.get(0).moveRight(22.0);
        arr.get(1).moveRight(32.0);
        arr.get(1).moveDown(2.0);
        arr.get(2).moveUp(12.0);
        arr.get(2).moveRight(52.0);
        for (Shape s : arr) {
            System.out.println(s.toString());
        }
    }

    public void testForUniques() {
        for (Shape s : arr) {
            if(s instanceof Rectangle && ! (s instanceof Square)) {
                Rectangle r = (Rectangle) s;
                r.uniqueRectangleMethod();
            }
            if (s instanceof Square) {
                Square square = (Square) s;
                square.uniqueSquareMethod();
            }
            if (s instanceof Circle) {
                Circle c = (Circle) s;
                c.uniqueCricleMethod();
                System.out.println(c.getCenter() + "\n" + c.getPerimeter());
            }
        }
    }

    public void testLimit() {
        try {
            Rectangle r = new Rectangle(1.00, 11.00, Color.BLUE, true, new MovablePoint(0.00, 11.00), new MovablePoint(1.00, 0.00));
            System.out.println("Everything went well!");

            r.setBottomRight(new MovablePoint(10.0, -10.0));
            System.out.println(r.getLength());
            System.out.println(r.getPerimeter());
        } catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}
