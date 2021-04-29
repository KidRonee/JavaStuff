public class Main {
    public static void main(String[] args) {
        //new Program();
        Rectangle rect = new Rectangle(3, 5, new MovablePoint(2, 6), new MovablePoint(5, 1));
        Rectangle rect1 = new Rectangle(3, 5, new MovablePoint(2, 6), new MovablePoint(5, 1));
        System.out.println(rect.toString());
        rect.moveDown(2);
        System.out.println(rect.toString());
        rect.setHeight(10);
        System.out.println(rect.toString());



    }
}
