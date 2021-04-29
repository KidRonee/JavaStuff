public class MovablePoint {
     double x;
     double y;

    public MovablePoint() {
        this.x = 0;
        this.y = 0;
    }

    public MovablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("X: %s\nY: %s", x, y);
    }


}
