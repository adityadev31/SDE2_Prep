package TicTacToe;

import java.util.Scanner;

public class MoveManager {
    private final Board board;
    private int moveCount;
    private final Scanner scn;
    private boolean winner;
    public MoveManager(Board board, Scanner scn) {
        this.board = board;
        this.moveCount = 0;
        this.scn = scn;
        this.winner = false;
    }

    // get position
    private int[] getPosition() {
        System.out.print("Enter x y: ");
        int x = scn.nextInt();
        int y = scn.nextInt();
        return new int[]{x, y};
    }

    // make move
    public boolean makeMove(Player player) {
        int[] pos = getPosition();
        int x = pos[0];
        int y = pos[1];
        if(!board.inRange(x, y) || board.getPiece(x, y) != null) {
            System.out.println("Wrong position entered..");
            return false;
        }
        board.setPiece(x, y, new Piece(player.getSymbol()));
        moveCount++;
        board.printBoard();
        if(isWinnerMove(x, y)) {
            System.out.println(player.getName() + " wins !!");
            winner = true;
        }
        return true;
    }

    // check win
    private boolean isWinnerMove(int x, int y) {
        if(board.inRange(x,y) && board.getPiece(x,y)!=null) {
            char curSymbol = board.getPiece(x,y).getSymbol();
            boolean hasWon = true;

            // check row
            for(int k=0; k<board.getSize(); k++) {
                if(board.getPiece(x,k)==null || board.getPiece(x,k).getSymbol()!=curSymbol) {
                    hasWon = false;
                    break;
                }
            }

            if(hasWon) return true;
            hasWon = true;

            // check col
            for(int k=0; k<board.getSize(); k++) {
                if(board.getPiece(k,y)==null || board.getPiece(k,y).getSymbol()!=curSymbol) {
                    hasWon = false;
                    break;
                }
            }

            if(hasWon) return true;
            hasWon = true;


            // check diags
            if(x == y) return false;
            for(int k=0; k<board.getSize(); k++) {
                if(board.getPiece(k,k)==null || board.getPiece(k,k).getSymbol()!=curSymbol) {
                    hasWon = false;
                    break;
                }
            }
            return hasWon;
        }
        return false;
    }

    public boolean isWinner() {
        return winner;
    }

    // check full
    public boolean isFull() {
        return moveCount == (board.getSize()*board.getSize());
    }

}
