import java.awt.*;

public class Main {
    public static void main(String[] args) {
        /*
        Shape shape = new Shape();
        shape.setColor(Color.pink);
        Rectangle rect = new Rectangle();
        rect.setLength(10);
        rect.setWidth(20);
        rect.setFilled(true);
        rect.printState();
         */
        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 6; y++) {
                if (x == y) {
                    System.out.print("|||");
                }
                if (x == 1 && y == 5) {
                    System.out.println("|||");
                }
                if (x == 2 && y == 4) {
                    System.out.println("|||");
                }
                if (x == 4 && y == 2) {
                    System.out.println("|||");
                }
                if (x == 5 && y == 1) {
                    System.out.println("|||");
                }
                else {
                    System.out.println("---");
                }
            }
            System.out.println();
        }


    }
}
