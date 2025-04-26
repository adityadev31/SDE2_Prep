package TicTacToe;

import TicTacToe.util.MyPrinter;

public class Board {
    private final int size;
    private final Piece[][] board;
    public Board(int size) {
        this.size = size;
        this.board = new Piece[size][size];
    }

    // methods
    public boolean inRange(int x, int y) {
        return (x>=0 && x<size && y>=0 && y<size);
    }

    public Piece getPiece(int x, int y) {
        if(!inRange(x,y)) {
            MyPrinter.println("Invalid Position Entered..");
            return null;
        }
        return board[x][y];
    }

    public boolean setPiece(int x, int y, Piece piece) {
        if(!inRange(x,y) || board[x][y] != null) {
            MyPrinter.println("Invalid Position Entered..\n");
            return false;
        }
        board[x][y] = piece;
        return true;
    }

    public int size() {
        return this.size;
    }

    public void printBoard() {
        MyPrinter.println("");
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if(board[i][j] == null) MyPrinter.print("-\t");
                else MyPrinter.print(board[i][j]+"\t");
            }
            MyPrinter.println("");
        }
        MyPrinter.println("");
    }
}
