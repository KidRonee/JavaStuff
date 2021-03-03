public class Numbers extends Canvas {


    public void printOne() {
        System.out.println("-----------------------------------");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(         //this is the bottom serif
                        (row == 9 || row == 10) && (col >= 3 && col <= 8) ||
                                //this is the middle
                                (col == 5 || col == 6) && (row >= 1 && row < 9) ||
                                //this is the top
                                (row == 1 || row == 2) && col == 4
                ){
                    arr[row][col] = ":::";
                } else {
                    arr[row][col] = "   ";
                }

                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
    }

    public void printTwo() {
        System.out.println("-----------------------------------");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                                // this makes the bottom serif    // this makes
                if(
                        (row == 9 || row == 10) && (col > 2 && col < 9) ||
                        (row == 8 && (col == 3 || col == 4)) ||
                        (row == 7 && (col == 4 || col == 5)) ||
                        (row == 6 && (col == 5 || col == 6)) ||
                        (row == 5 && (col == 6 || col == 7)) ||
                        (row == 3 || row == 4) && (col == 7 || col == 8 || col == 3 ||col == 4) ||
                        (row == 2 && (col > 2 && col < 9)) ||
                        (row == 1) && (col > 3 && col < 8)
                ) {
                    arr[row][col] = ":::";
                } else {
                    arr[row][col] = "   ";
                }

                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
    }

    public void printTwoAsSpace() {
        System.out.println("-----------------------------------");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                // this makes the bottom serif    // this makes
                if(
                        (row == 9 || row == 10) && (col > 2 && col < 9) ||
                                (row == 8 && (col == 3 || col == 4)) ||
                                (row == 7 && (col == 4 || col == 5)) ||
                                (row == 6 && (col == 5 || col == 6)) ||
                                (row == 5 && (col == 6 || col == 7)) ||
                                (row == 3 || row == 4) && (col == 7 || col == 8 || col == 3 ||col == 4) ||
                                (row == 2 && (col > 2 && col < 9)) ||
                                (row == 1) && (col > 3 && col < 8)
                ) {
                    arr[row][col] = "   ";
                } else {
                    arr[row][col] = ":::";
                }

                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
    }

    public void printSpaceShip() {
        System.out.println("-----------------------------------");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (
                        row == 1 && col > 3 && col < 8 || row == 2 && col > 2 && col < 9 || (row == 3 || row == 4) && (col == 7 || col == 8 || col == 3 || col == 4) || row == 5 && (col > 5 || col < 8) || col > 10 || col < 1 || row == 6 || (row == 7 || row == 4) && (col == 7 || col == 8 || col == 3 || col == 4) || row == 8 && col > 2 && col < 9 || row == 9 && col > 3 && col < 8) {
                    arr[row][col] = "X  ";
                } else {
                    arr[row][col] = "   ";
                }
                System.out.print(arr[row][col]);
            }
                System.out.println();
        }

    }

    public void printThree() {
        System.out.println("-----------------------------------");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(
                        (row == 1 && (col > 3 && col < 8)) ||
                                (row == 2 && (col > 2 && col < 9)) ||
                                (row == 3 && (col == 7 || col == 8 || col == 3 ||col == 4)) ||
                                (row == 4 && (col == 7 ||col == 8)) ||
                                (row == 5 ||row == 6) && (col == 5 ||col == 6 || col == 7) ||
                                (row == 7) && (col == 7 ||col == 8) ||
                                (row == 8 && (col == 7 || col == 8 || col == 3 ||col == 4)) ||
                                (row == 9 && (col > 2 && col < 9)) ||
                                (row == 10 && (col > 3 && col < 8))


                                ) {
                    arr[row][col] = "[#]";
                } else {
                    arr[row][col] = "   ";
                }

                System.out.print(arr[row][col]);
            }
                System.out.println();
        }

    }

    public void printThreeAsSpace() {
        System.out.println("-----------------------------------");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(
                        (row == 1 && (col > 3 && col < 8)) ||
                                (row == 2 && (col > 2 && col < 9)) ||
                                (row == 3 && (col == 7 || col == 8 || col == 3 ||col == 4)) ||
                                (row == 4 && (col == 7 ||col == 8)) ||
                                (row == 5 ||row == 6) && (col == 5 ||col == 6 || col == 7) ||
                                (row == 7) && (col == 7 ||col == 8) ||
                                (row == 8 && (col == 7 || col == 8 || col == 3 ||col == 4)) ||
                                (row == 9 && (col > 2 && col < 9)) ||
                                (row == 10 && (col > 3 && col < 8))


                ) {
                    arr[row][col] = "   ";
                } else {
                    arr[row][col] = "[#]";
                }

                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
    }

    public void printZero() {
        System.out.println("-----------------------------------");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(
                        (row == 1 && (col > 3 && col < 8)) ||
                                (row == 2 && (col > 2 && col < 9)) ||
                                (row == 3 && (col == 7 || col == 8 || col == 3 || col == 4)) ||
                                (row == 4 && (col == 7 ||col == 8 || col == 3 || col == 4)) ||
                                (row == 5 && (col == 7 ||col == 8 || col == 3 || col == 4)) ||
                                (row == 6 && (col == 7 ||col == 8 || col == 3 || col == 4)) ||
                                (row == 7 && (col == 7 ||col == 8 || col == 3 || col == 4)) ||
                                (row == 8 && (col == 7 || col == 8 || col == 3 ||col == 4)) ||
                                (row == 9 && (col > 2 && col < 9)) ||
                                (row == 10 && (col > 3 && col < 8))


                ) {
                    arr[row][col] = "[#]";
                } else {
                    arr[row][col] = "   ";
                }

                System.out.print(arr[row][col]);
            }
            System.out.println();
        }

    }



    public void printOneAsSpace() {
        System.out.println("-----------------------------------");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(         //this is the bottom serif
                        (row == 9 || row == 10) && (col >= 3 && col <= 8) ||
                                //this is the middle
                        (col == 5 || col == 6) && (row >= 1 && row < 9) ||
                                //this is the top
                        (row == 1 || row == 2) && col == 4) {
                    arr[row][col] = "   ";
                } else {
                    arr[row][col] = ":::";
                }

                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
    }

    public void printSmiley() {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (
                        row == 2 && (col > 7 && col < 10) ||
                        row == 2 && (col > 1 && col < 4) ||
                        row == 3 && (col > 7 && col < 10) ||
                        row == 3 && (col > 1 && col < 4) ||
                        row == 4 && (col > 1 && col < 4) ||
                        row == 4 && (col > 7 && col < 10) ||
                        row == 5 && (col > 7 && col < 10) ||
                        row == 5 && (col > 1 && col < 4) ||
                        row == 8 && (col == 2 || col == 9) ||
                        row == 9 && (col > 1 && col < 10) ||
                        row == 0 && (col >= 0 && col <= 11) ||
                        row == 11 && (col >= 0 && col <= 11) ||
                        col == 0 && (row >= 0 || row <= 11) ||
                        col == 11 && (row >= 0 || row <= 11) ||
                        row == 7 && col == 2 ||
                        row == 7 && col == 9
                ) {
                    arr[row][col] = "[#]";
                } else {
                    arr[row][col] = ":::";
                }

                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
    }

}
