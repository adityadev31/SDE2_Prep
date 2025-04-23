package ChessGame.Pieces;

import ChessGame.Color;
import ChessGame.Piece;

public class PieceFactory {
    public static Piece createPiece(PieceType pieceType, Color color) {
        if(pieceType == PieceType.Bishop) return new Bishop(color);
        else if(pieceType == PieceType.King) return new King(color);
        else if(pieceType == PieceType.Knight) return new Knight(color);
        else if(pieceType == PieceType.Pawn) return new Pawn(color);
        else if(pieceType == PieceType.Queen) return new Queen(color);
        else if(pieceType == PieceType.Rook) return new Rook(color);
        return null;
    }
}
