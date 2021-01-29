package com.example.helloworld;

public class Draw {
        public static void makeX () {
            for (int x = 1; x < 9; x++) {
                for (int y = 1; y < 9; y++) {
                    if (x == y || y == (8+1) - x) {
                        System.out.print("(x)");
                    } else {
                        System.out.print("|||");
                    }
                }
                System.out.println("");
            }
        }

        public static void makeFrame () {
            for (int x = 1; x < 9; x++) {
                for (int y = 1; y < 9; y++) {
                    if (x == 1 || y == 1 || x == 8 || y == 8) {
                        System.out.print("(x)");
                    } else {
                        System.out.print("|||");
                    }
                }
                System.out.println("");
            }
        }

        public static void makeChecker () {
            for (int x = 1; x < 9; x++) {
                for (int y = 1; y < 9; y++) {
                    if ((x + y) % 2 == 0) {
                        System.out.print("(x)");
                    } else {
                        System.out.print("|||");
                    }

                }
                System.out.println("");
            }
        }

        public static void makeBars () {
            for (int x = 1; x < 9; x++) {
                for (int y = 1; y < 9; y++) {
                    if (x % 2 != 1 || y % 2 != 1) {
                        System.out.print("   ");
                    } else {
                        System.out.print("|||");
                    }

                }
                System.out.println("");
            }
        }

        public static void makeCross () {
            for (int x = 1; x <= 8; x++) {
                for (int y = 1; y <= 8; y++) {
                    if (x == 4 || x == 5 || y == 4 || y == 5) {
                        System.out.print("(x)");
                    } else {
                        System.out.print("|||");
                    }

                }
                System.out.println("");
            }
        }

        public static void main (String[] args) {
            makeX();
            System.out.println("");
            makeFrame();
            System.out.println("");
            makeChecker();
            System.out.println("");
            makeBars();
            System.out.println("");
            makeCross();

        }
    }
