package ChessGame.Pieces;

import ChessGame.Board;
import ChessGame.Color;
import ChessGame.Piece;
import ChessGame.Position;

public class King extends Piece {

    public King(Color color) {
        super(color, PieceType.King);
    }

    @Override
    public boolean makeMove(Board board, Position curPos, Position destPos) {
        // LOGIC
        return false;
    }
}
