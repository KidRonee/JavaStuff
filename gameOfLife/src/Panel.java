import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Panel extends JPanel implements ActionListener {

    int xGrid = 1700, yGrid = 800;
    int size = 10;
    //int[][] grid = new int[xGrid / size][yGrid / size];
    //int[][] gridCopy = new int[xGrid / size][yGrid / size];
    boolean start = true;
    int[][] life = new int[xGrid / size][yGrid / size];
    int[][] beforeLife = new int[xGrid / size][yGrid / size];


    public Panel() {
        setSize(xGrid, yGrid);
        setLayout(null);
        setBackground(Color.BLACK);

        new Timer(80, this).start();

    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.BLACK);

        grid(g);
        spawn(g);
        display(g);

    }

    private void grid(Graphics g){
        g.setColor(Color.GRAY);

        for (int i = 0; i < life.length; i++) {
            g.drawLine(0, i*size, xGrid, i*size); // row
            g.drawLine(i*size, 0,i*size, yGrid); // col

        }
    }

    private void spawn(Graphics g) {
        if(start) {
            for(int x = 0; x < life.length; x++) {
                for(int y = 0; y < life[1].length; y++) {

                    if((int)(Math.random() * 5) == 0) {
                        life[x][y] = 1;
                    }
                }
            }

            start = false;

        }
    }

    private void display(Graphics g) {
        g.setColor(Color.GREEN);

        copyArray();

        for(int x = 0; x < life.length; x++) {
            for(int y = 0; y < life[1].length; y++) {
                if(life[x][y] == 1)
                g.fillRect(x*size, y*size, size, size);
            }
        }
    }

    private int check(int x, int y) {
        int alive = 0;
        alive += life[x - 1][y - 1];
        alive += life[x][y - 1];
        alive += life[x - 1][y];
        alive += life[x + 1][y + 1];
        alive += life[x][y + 1];
        alive += life[x + 1][y];
        alive += life[x - 1][y + 1];
        alive += life[x + 1][y - 1];

        return alive;
    }

    public void actionPerformed(ActionEvent e) {

        int alive;

        for (int x = 0; x < life.length; x++) {
            for (int y  = 0; y < life[1].length; y++) {
                alive = check(x, y);
            }
        }

        repaint();
    }

    private void copyArray() {
        g.setColor(Color.GREEN);

        for(int x = 0; x < life.length; x++) {
            for(int y = 0; y < life[1].length; y++) {
                beforeLife[x][y] = life[x][y];
            }
        }

    }

}
