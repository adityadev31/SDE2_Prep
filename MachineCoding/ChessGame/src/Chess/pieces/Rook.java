package Chess.pieces;

import Chess.Board;
import Chess.Color;
import Chess.MoveResults;
import Chess.Piece;
import Chess.util.MyPrinter;

public class Rook extends Piece {

    public Rook(Color color) {
        super(color, PieceType.ROOK);
    }

    @Override
    public MoveResults makeMove(int r1, int c1, int r2, int c2, Board board) {
        boolean validMove = false;
        // up
        if(r2<r1 && c1==c2) {
            for(int k=r1-1; k>r2; k--) {
                if(board.getPiece(k, c1)!=null) return MoveResults.INVALID;
            }
            validMove = true;
        }

        // down
        else if(r2>r1 && c1==c2) {
            for(int k=r1+1; k<r2; k++) {
                if(board.getPiece(k, c1)!=null) return MoveResults.INVALID;
            }
            validMove = true;
        }

        // left
        else if(r1==r2 && c1<c2) {
            for(int k=c1+1; k<c2; k++) {
                if(board.getPiece(r1, k)!=null) return MoveResults.INVALID;
            }
            validMove = true;
        }

        // right
        else if(r1==r2 && c1>c2) {
            for(int k=c1-1; k>c2; k--) {
                if(board.getPiece(r1, k)!=null) return MoveResults.INVALID;
            }
            validMove = true;
        }

        return (validMove) ? makeMoveResults(r1,c1,r2,c2,board) : MoveResults.INVALID;
    }
}
