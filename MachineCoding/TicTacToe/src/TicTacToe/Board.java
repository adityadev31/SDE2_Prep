package TicTacToe;

public class Board {
    public final int size;
    private Mark[][] board;

    // constructor
    public Board(int size) {
        this.size = size;
        this.board = new Mark[size][size];
    }

    // getter & setter
    public Mark getMark(Position pos) { return board[pos.getX()][pos.getY()]; }

    public void setMark(Position pos, Mark mark) { board[pos.getX()][pos.getY()] = mark; }

    public void printBoard() {
        System.out.println();
        for(int i=0; i<size; i++) {
            if(i > 0) {
                for (int j = 0; j < size; j++) {
                    System.out.print("--------");
                }
                System.out.println();
            }
            for(int j=0; j<size; j++) {
                if(board[i][j] == null) {
                    if(j < size-1) System.out.print("\t\t|");
                }
                else {
                    System.out.print("\t" + board[i][j].toString() + "\t");
                    if(j < size-1) System.out.print("|");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
