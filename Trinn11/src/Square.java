import java.awt.*;

public class   Square extends Rectangle {

    public Square(double side, Color color, boolean filled, MovablePoint topLeft, MovablePoint bottomRight) {
        super(side, side, color, filled, topLeft, bottomRight);
    }

    public void uniqueSquareMethod() {
        System.out.println("Hello, I'm Square!");
    }

    public double getSide(){
        return super.getLength();
    }

    public String toString(){
        return "A Square with side = " + this.getSide() + ", which is a subclass of " + super.toString();
    }

}
