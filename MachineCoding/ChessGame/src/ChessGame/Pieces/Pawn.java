package ChessGame.Pieces;

import ChessGame.Board;
import ChessGame.Color;
import ChessGame.Piece;
import ChessGame.Position;

public class Pawn extends Piece {

    public Pawn(Color color) {
        super(color, PieceType.Pawn);
    }

    @Override
    public boolean makeMove(Board board, Position srcPos, Position destPos) {
        if(board.getPiece(destPos) != null && board.getPiece(destPos).getColor() == this.getColor()) {
            System.out.println("Move blocked by another piece !");
            return false;
        }
        board.setPiece(srcPos, destPos);
        return true;
    }
}
