package Chess;

import Chess.pieces.*;
import Chess.util.MyPrinter;

public class Board {
    private int size;
    private Piece[][] board;

    public Board() {
        this.size = 8;
        this.board = new Piece[size][size];
        initBoard();
    }

    public int getSize() {
        return size;
    }

    public boolean inRange(int x, int y) {
        return (x >= 0 && x < size && y >= 0 && y < size);
    }

    public Piece getPiece(int x, int y) {
        if(!inRange(x,y)) return null;
        return board[x][y];
    }

    public boolean setPiece(int x, int y, int x2, int y2) {
        if(!inRange(x,y) || !inRange(x2,y2)) return false;
        board[x2][y2] = board[x][y];
        board[x][y] = null;
        return true;
    }

    public void printBoard() {
        MyPrinter.println("");
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if(board[i][j] != null) {
                    MyPrinter.print(board[i][j] + "\t");
                }
                else {
                    MyPrinter.print("-\t");
                }
            }
            MyPrinter.println("");
        }
        MyPrinter.println("");
    }

    public int getBlackRow(int x) {
        return size-1-x;
    }

    public void initBoard() {
        // pawns
        for(int j=0; j<size; j++) {
            board[1][j] = new Pawn(Color.WHITE);
            board[getBlackRow(1)][j] = new Pawn(Color.BLACK);
        }

        // rooks
        board[0][0] = new Rook(Color.WHITE);
        board[0][size-1] = new Rook(Color.WHITE);
        board[getBlackRow(0)][0] = new Rook(Color.BLACK);
        board[getBlackRow(0)][size-1] = new Rook(Color.BLACK);

        // knights
        board[0][1] = new Knight(Color.WHITE);
        board[0][size-2] = new Knight(Color.WHITE);
        board[getBlackRow(0)][1] = new Knight(Color.BLACK);
        board[getBlackRow(0)][size-2] = new Knight(Color.BLACK);

        // bishops
        board[0][2] = new Bishop(Color.WHITE);
        board[0][size-3] = new Bishop(Color.WHITE);
        board[getBlackRow(0)][2] = new Bishop(Color.BLACK);
        board[getBlackRow(0)][size-3] = new Bishop(Color.BLACK);

        // queen
        board[0][3] = new Queen(Color.WHITE);
        board[getBlackRow(0)][size-4] = new Queen(Color.BLACK);

        // king
        board[0][4] = new King(Color.WHITE);
        board[getBlackRow(0)][size-5] = new King(Color.BLACK);
    }
}
