import javax.swing.JFrame;
import java.awt.*;


public class Frame extends JFrame {

    public Frame() {

        add(new Panel());

        setSize(1300, 700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args){
        new Frame();
    }
}
