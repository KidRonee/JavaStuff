public class MovablePoint implements Movable {
    private double x, y;

    MovablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x = " + x + "\ny = " + y;
    }

    public void moveUp(double distance) {
        y += distance;
    }

    public void moveDown(double distance) {
        y -= distance;
    }

    public void moveRight(double distance) {
        x += distance;
    }

    public void moveLeft(double distance) {
        x -= distance;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
