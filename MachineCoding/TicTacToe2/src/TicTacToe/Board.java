package TicTacToe;

public class Board {
    private final int size;
    private final Piece[][] board;

    // constructor
    public Board() {
        this.size = 3;
        board = new Piece[3][3];
        initBoard();
    }

    public int getSize() {
        return size;
    }

    private void initBoard() {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                System.out.print("-\t");
            }
            System.out.println();
        }
    }

    public void printBoard() {
        System.out.println();
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if(board[i][j] == null) System.out.print("-\t");
                else System.out.print(board[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean inRange(int x, int y) {
        return x>=0 && x<size && y>=0 && y<size;
    }

    public Piece getPiece(int x, int y) {
        if(inRange(x, y)) {
            return board[x][y];
        }
        return null;
    }

    public void setPiece(int x, int y, Piece piece) {
        if(inRange(x, y)) {
            board[x][y] = piece;
        }
    }
}
