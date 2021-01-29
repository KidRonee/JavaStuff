package com.example.helloworld;

import java.util.Arrays;

public class DrawShape {
    public static void main (String[] board) {
        int x;
        int y;
        // x shape
        /*
        for (x=1; x <= 8; x++) {
            for (y = 1; y <= 8; y++) {
                String bars = "   ";
                if (x == y || y == (8 + 1) - x) {
                    System.out.print("|||");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println("");
        }
         */

 //window shape
        for (x=0; x <= 8; x++) {
            for (y=0; y <= 8; y++) {
                String bars = "   ";
                if (x==0||y==0||x==8||y==8) {
                    System.out.print("|||");
                }else if(x == 4 || y == 4){
                    System.out.print("|||");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
