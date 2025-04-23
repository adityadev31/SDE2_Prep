package ChessGame;

import ChessGame.Pieces.PieceType;

public abstract class Piece {
    private final Color color;
    private final PieceType type;

    // constructor
    public Piece(Color color, PieceType type) {
        this.color = color;
        this.type = type;
    }

    // getter
    public Color getColor() {
        return this.color;
    }

    // abstract method
    public abstract boolean makeMove(Board board, Position srcPos, Position destPos);

    @Override
    public String toString() {
        return color.toString().substring(0,1).toLowerCase() + "_" + type.toString().substring(0,2);
    }
}
