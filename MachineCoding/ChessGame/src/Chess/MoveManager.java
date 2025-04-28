package Chess;

import Chess.util.MyPrinter;

public class MoveManager {
    private Board board;
    private Color victoryTeam;
    public MoveManager(Board board) {
        this.board = board;
        this.victoryTeam = null;
    }
    public Color getVictoryTeam() {
        return victoryTeam;
    }
    public MoveResults makeMove(int x1, int y1, int x2, int y2, Player player) {
        if(!board.inRange(x1, y1) || !board.inRange(x2, y2) || board.getPiece(x1,y1)==null) {
            MyPrinter.println("Invalid positions entered !");
            return MoveResults.INVALID;
        }
        MoveResults res = board.getPiece(x1,y1).makeMove(x1,y1,x2,y2,board);
        if(res == MoveResults.INVALID) MyPrinter.println("Invalid move !");
        else board.printBoard();
        if(res == MoveResults.VICTORY) victoryTeam = player.getColor();
        return res;
    }
}
