import java.awt.*;

public class Square extends Rectangle{

    public Square(int id) {
        super(id, 1.0, 1.0);
    }

    public Square(int id, double side) {
        super(id, side, side);
    }

    public Square(int id, double side, Color color, boolean filled) {
        super(id, side, side, color, filled);
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public double getSide() {
        return super.getLength();
    }

    public String toString() {
        return "A square with side = " + this.getSide() + ", which is a subclass of " + super.toString();
    }
}
