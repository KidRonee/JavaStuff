public class TTT {
    private char[][]board; //  2d array for displaying board
    private char currentPlayerMark; // holds x or o
    private final int size = 3;

    public TTT() {
        board = new char[3][3];
        currentPlayerMark = 'x';
        initializeBoard();
    }

    // sets up empty value board
    public void initializeBoard() {
        for (int rows = 0; rows < size; rows++) {
            for (int cols = 0; cols < size; cols++) {
                board[rows][cols] = '-';
            }
        }
    }

    public void printBoard() {
        //System.out.println("-------------");
        for (int rows = 0; rows < size; rows++) {
            System.out.print("| ");
            for (int cols = 0; cols < size; cols++) {
                System.out.print(board[rows][cols] + " | ");
            }
            System.out.println();
            //System.out.println("--------------");
        }
    }

    public boolean isBoardFull() {
        boolean isFull = true;
        for (int rows = 0; rows < size; rows++) {
            for (int cols = 0; cols < size; cols++) {
                if (board[rows][cols] == '-') {
                    isFull = false;
                    break;
                }
            }
        }
        return isFull;
    }

    public boolean checkForWin() {
        if (checkRowsForWin() ||checkColsForWin() || checkDiagonalsForWin()) {
            return  true;
        }
        return false;
    }

    private boolean checkRowsForWin() {
        for (int rows = 0; rows < size; rows++) {
            if (checkRowCol(board[rows][0], board[rows][1], board[rows][2])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColsForWin() {
        for (int cols = 0; cols < size; cols++) {
            if (checkRowCol(board[0][cols], board[1][cols], board[2][cols])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonalsForWin() {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2]) || checkRowCol(board[0][2], board[1][1], board[2][0])));
    }

    private boolean checkRowCol(char c1, char c2, char c3) {
        return(c1 != '-' && c1 == c2 && c2 == c3);
    }

    public void changePlayer() {
        if (currentPlayerMark == 'x') {
            currentPlayerMark = 'o';
        } else {
            currentPlayerMark = 'x';
        }
    }

    public boolean placeMark(int row, int col) {
        if((row >= 0) && (row < 3)) {
            if ((col >= 0) && (col < 3)) {
                if (board[row][col] == '-') {
                    board[row][col] = currentPlayerMark;
                    return true;
                }
            }
        }
        return false;
    }

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    public char getCurrentPlayerMark() {
        return currentPlayerMark;
    }

    public void setCurrentPlayerMark(char currentPlayerMark) {
        this.currentPlayerMark = currentPlayerMark;
    }

    public int getSize() {
        return size;
    }
}
