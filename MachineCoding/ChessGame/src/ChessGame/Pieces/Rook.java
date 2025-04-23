package ChessGame.Pieces;

import ChessGame.Board;
import ChessGame.Color;
import ChessGame.Piece;
import ChessGame.Position;

public class Rook extends Piece {

    public Rook(Color color) {
        super(color, PieceType.Rook);
    }

    @Override
    public boolean makeMove(Board board, Position curPos, Position destPos) {
        return false;
    }
}
