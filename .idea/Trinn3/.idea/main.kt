class main {
    public void makeBox () {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                if (x == y) {
                    System.out.print("|||");
                }
                if (x-y < y +1) {
                    System.out.print("|||");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }

    public static void main (String[] args) {
        makeBox();
    }
}