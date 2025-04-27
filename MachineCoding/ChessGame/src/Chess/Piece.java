package Chess;

import Chess.pieces.PieceType;

public abstract class Piece {
    private final Color color;
    private final PieceType type;
    public Piece(Color color, PieceType pieceType) {
        this.color = color;
        this.type = pieceType;
    }

    public Color getColor() {
        return color;
    }

    public PieceType getType() {
        return type;
    }

    public MoveResults makeMoveResults(int x1, int y1, int x2, int y2, Board board) {
        Piece piece1 = board.getPiece(x1, y1);
        Piece piece2 = board.getPiece(x2, y2);
        if(piece2 == null && board.setPiece(x1,y1,x2,y2)) {
            return MoveResults.VALID;
        }
        if(piece2.getColor() != piece1.getColor() && piece2.getType() == PieceType.KING && board.setPiece(x1,y1,x2,y2)) {
            return MoveResults.VICTORY;
        }
        if(piece2.getColor() != piece1.getColor() && piece2.getType() != PieceType.KING && board.setPiece(x1,y1,x2,y2)) {
            return MoveResults.KILL;
        }
        return MoveResults.INVALID;
    }

    public abstract MoveResults makeMove(int x, int y, int x2, int y2, Board board);

    public String toString() {
        return type.toString().charAt(0)+"";
    }
}
