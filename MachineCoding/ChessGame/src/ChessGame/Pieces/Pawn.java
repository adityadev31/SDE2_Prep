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
        int x1 = srcPos.getX();
        int y1 = srcPos.getY();
        int x2 = destPos.getX();
        int y2 = destPos.getY();

        // block case (straight)
        boolean b = x2 == x1 && (y2 - y1 == 1 || (x1 == 1 && y2 - y1 == 2));
        if(board.getPiece(destPos) != null && b) {
            System.out.println("Move blocked by another piece !");
            return false;
        }
        // allowed case
        if(board.getPiece(destPos) == null && b) {
            board.setPiece(srcPos, destPos);
            return true;
        }
        else if(board.getPiece(destPos) != null && (board.getPiece(destPos).getColor() != this.getColor()) && (Math.abs(x2-x1) == 1 && y2-y1 == 1)) {
            board.setPiece(srcPos, destPos);
            return true;
        }
        System.out.println("Wrong move !");
        return false;
    }
}
