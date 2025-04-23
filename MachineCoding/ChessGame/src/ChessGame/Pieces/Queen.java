package ChessGame.Pieces;

import ChessGame.Board;
import ChessGame.Color;
import ChessGame.Piece;
import ChessGame.Position;

public class Queen extends Piece {

    public Queen(Color color) {
        super(color, PieceType.Queen);
    }

    @Override
    public boolean makeMove(Board board, Position curPos, Position destPos) {
        return false;
    }
}
