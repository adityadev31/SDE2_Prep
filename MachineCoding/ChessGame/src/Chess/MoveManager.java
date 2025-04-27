package Chess;

import Chess.util.MyPrinter;

public class MoveManager {
    private Board board;
    private Color victoryTeam;
    public MoveManager(Board board) {
        this.board = board;
    }
    public MoveResults makeMove(int x, int y, int x2, int y2, Player player) {
        if(!board.inRange(x, y) || !board.inRange(x2, y2) || board.getPiece(x,y)==null) {
            MyPrinter.println("Invalid positions entered !");
            return MoveResults.INVALID;
        }
        MoveResults res = board.getPiece(x,y).makeMove(x,y,x2,y2,board);
        if(res == MoveResults.INVALID) MyPrinter.println("Invalid move !");
        else if(res == MoveResults.VICTORY) victoryTeam = player.getColor();
        return res;
    }
}
