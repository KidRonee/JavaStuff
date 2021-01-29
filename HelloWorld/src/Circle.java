import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;

public class Circle extends JPanel {

    public void paint(Graphics g) {
        //g.drawOval(200, 200, 500, 500);
        g.drawRect(400, 400, 200, 200);
        g.setColor(Color.RED);
        g.fillRect(405, 405, 190, 190);
        System.out.println(g.getColor());
        //g.fillOval(205, 205, 490, 490);

    }

    public static void main(String[] args) {
        JFrame MainFrame = new JFrame();
        MainFrame.setSize(600, 600);

        Circle c = new Circle();

        MainFrame.add(c);

        MainFrame.setVisible(true);
    }

}
