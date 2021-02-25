import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Program test = new Program();

        /*
        test.checkCircles();
        test.checkSquares();
        test.checkRectangles();
        test.printHashMapContentUsingToString();
        test.printHashMapUsingForEachLoop();
        test.printHashMapElement(7);

         */
        //test.gfg();
        test.addSamples();
        System.out.println(test.printBigShapes(300));

        String arr [][] = new String[10][8];
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


        //System.out.println(Arrays.deepToString(arr));
        //System.out.println(test.bigShapes);
    }
} 
