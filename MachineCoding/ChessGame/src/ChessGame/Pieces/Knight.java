package ChessGame.Pieces;

import ChessGame.Board;
import ChessGame.Color;
import ChessGame.Piece;
import ChessGame.Position;

public class Knight extends Piece {

    public Knight(Color color) {
        super(color, PieceType.Knight);
    }

    @Override
    public boolean makeMove(Board board, Position curPos, Position destPos) {
        return false;
    }
}
