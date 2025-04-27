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
    public MoveResults makeMove(int x1, int y1, int x2, int y2, Board board) {
        // up
        if(x2<x1 && y1==y2) {
            for(int k=x1-1; k>x2; k--) {
                if(board.getPiece(k, y1)!=null) return MoveResults.INVALID;
            }
            return makeMoveResults(x1,y1,x2,y2,board);
        }

        // down
        else if(x2>x1 && y1==y2) {
            for(int k=x1+1; k<x2; k++) {
                if(board.getPiece(k, y1)!=null) return MoveResults.INVALID;
            }
            return makeMoveResults(x1,y1,x2,y2,board);
        }

        // left
        else if(x1==x2 && y1<y2) {
            for(int k=y1+1; k<y2; k++) {
                if(board.getPiece(x1, k)!=null) return MoveResults.INVALID;
            }
            return makeMoveResults(x1,y1,x2,y2,board);
        }

        // right
        else if(x1==x2 && y1>y2) {
            for(int k=y1-1; k>y2; k--) {
                if(board.getPiece(x1, k)!=null) return MoveResults.INVALID;
            }
            return makeMoveResults(x1,y1,x2,y2,board);
        }

        return MoveResults.INVALID;
    }
}
