package Chess.pieces;

import Chess.Board;
import Chess.Color;
import Chess.MoveResults;
import Chess.Piece;

public class King extends Piece {

    public King(Color color) {
        super(color, PieceType.KING);
    }

    @Override
    public MoveResults makeMove(int r1, int c1, int r2, int c2, Board board) {
        if(Math.abs(r1-r2) > 1 || Math.abs(c1-c2) > 1) return MoveResults.INVALID;
        return makeMoveResults(r1,c1,r2,c2,board);
    }
}
