import java.util.Arrays;

public class Canvas {
    String arr[][] = new String[12][12];

    public Canvas() {
        for (int i  = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = "0  ";
            }
        }
    }
    // insert table dimensions
    public Canvas(int row, int col) {
        this.arr = new String[row][col];
        for (int i  = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = "0  ";
            }
        }
    }

    public void printCanvas() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
        /*
        for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
            if(((row == 8 || row == 7) && (col >= 2 && col <=5)|| (col == 3 ||col == 4) && row >= 1 && row < 7) || (row == 1 || row == 2) && col == 2) {
                arr[row][col] = "X  ";
            } else {
                arr[row][col] = "   ";
            }

            System.out.print(arr[row][col]);
        }
        System.out.println();
    }
    */
}
