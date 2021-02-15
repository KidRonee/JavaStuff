import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.setColor(Color.pink);
        Rectangle rect = new Rectangle();
        rect.setLength(10);
        rect.setWidth(20);
        rect.setFilled(true);
        rect.printState();


    }
}
