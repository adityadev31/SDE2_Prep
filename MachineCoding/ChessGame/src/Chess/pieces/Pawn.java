package Chess.pieces;

import Chess.Board;
import Chess.Color;
import Chess.MoveResults;
import Chess.Piece;

public class Pawn extends Piece {

    public Pawn(Color color) {
        super(color, PieceType.PAWN);
    }

    @Override
    public MoveResults makeMove(int r1, int c1, int r2, int c2, Board board) {
        // up
        if(r1-r2==1 && c1==c2 && board.getPiece(r1,c1).getColor() == Color.BLACK)
            return makeMoveResults(r1,c1,r2,c2,board);

        // down
        if(r2-r1==1 && c1==c2 && board.getPiece(r1,c1).getColor() == Color.WHITE)
            return makeMoveResults(r1,c1,r2,c2,board);

        // up-left || up-right
        if(r1-r2==1 && (c1-c2==1 || c2-c1==1) && board.getPiece(r1,c1).getColor() == Color.BLACK && board.getPiece(r2,c2) != null && board.getPiece(r2,c2).getColor()==Color.WHITE)
            return makeMoveResults(r1,c1,r2,c2,board);

        // down-left || down-right
        if(r2-r1==1 && (c1-c2==1 || c2-c1==1) && board.getPiece(r1,c1).getColor() == Color.WHITE && board.getPiece(r2,c2) != null && board.getPiece(r2,c2).getColor()==Color.BLACK)
            return makeMoveResults(r1,c1,r2,c2,board);

        return MoveResults.INVALID;
    }
}
