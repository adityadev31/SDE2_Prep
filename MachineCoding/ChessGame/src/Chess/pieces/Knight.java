package Chess.pieces;

import Chess.Board;
import Chess.Color;
import Chess.MoveResults;
import Chess.Piece;

public class Knight extends Piece {

    public Knight(Color color) {
        super(color, PieceType.KNIGHT);
    }

    @Override
    public MoveResults makeMove(int r1, int c1, int r2, int c2, Board board) {
        if((Math.abs(r1-r2) == 1 && Math.abs(c1-c2) == 2) || (Math.abs(r1-r2) == 2 && Math.abs(c1-c2) == 1)) {
            return makeMoveResults(r1,r2,c1,c2,board);
        }
        return MoveResults.INVALID;
    }
}
