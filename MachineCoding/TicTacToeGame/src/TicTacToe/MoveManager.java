package TicTacToe;

import TicTacToe.util.MyPrinter;

public class MoveManager {
    private final Board board;
    private int moveCount;
    private Player curPlayer;
    private boolean matchWon;
    public MoveManager(Board board) {
        this.board = board;
        this.moveCount = 0;
        this.curPlayer = null;
        this.matchWon = false;
    }

    // methods (make move, win check, draw check)
    public MoveResults makeMove(int x, int y, Player player) {
        this.curPlayer = player;
        if(board.setPiece(x, y, new Piece(curPlayer.getSymbol()))) {
            moveCount++;
            board.printBoard();
            if(isWinner(x, y)) {
                MyPrinter.println(curPlayer.getName() + " wins !!");
                matchWon = true;
                return MoveResults.VICTORY;
            }
            if(moveCount == board.size() * board.size()) {
                MyPrinter.println("Match Draw !!");
                return MoveResults.DRAW;
            }
            return MoveResults.VALID;
        }
        else return MoveResults.INVALID;
    }

    public boolean isWinner(int x, int y) {
        Piece curPiece = board.getPiece(x, y);

        boolean won = true;

        // rows
        for(int i=0; i<board.size(); i++) {
            if(board.getPiece(i, y) == null || !board.getPiece(i, y).toString().equals(curPiece.toString())) {
                won = false;
                break;
            }
        }
        if(won) return true;
        won = true;

        // cols
        for(int i=0; i<board.size(); i++) {
            if(board.getPiece(x, i) == null || !board.getPiece(x, i).toString().equals(curPiece.toString())) {
                won = false;
                break;
            }
        }
        if(won) return true;
        won = true;

        // diags
        if(x != y) return false;
        for(int i=0; i<board.size(); i++) {
            if(board.getPiece(i, i) == null || !board.getPiece(i, i).toString().equals(curPiece.toString())) {
                won = false;
                break;
            }
        }

        if(won) return true;
        won = true;

        for(int i=0, j=board.size()-1; i<board.size() && j>=0; i++, j--) {
            if(board.getPiece(i, j) == null || !board.getPiece(i, j).toString().equals(curPiece.toString())) {
                won = false;
                break;
            }
        }
        return won;
    }
}
