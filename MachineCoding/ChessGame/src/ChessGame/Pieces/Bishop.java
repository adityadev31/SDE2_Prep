package ChessGame.Pieces;

import ChessGame.Board;
import ChessGame.Color;
import ChessGame.Piece;
import ChessGame.Position;

public class Bishop extends Piece {

    public Bishop(Color color) {
        super(color, PieceType.Bishop);
    }

    @Override
    public boolean makeMove(Board board, Position curPos, Position destPos) {
        return false;
    }
}
