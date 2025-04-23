package ChessGame;

import ChessGame.Pieces.Pawn;
import ChessGame.Pieces.PieceFactory;
import ChessGame.Pieces.PieceType;

public class Board {
    private final int size;
    private Piece[][] board;

    // constructor
    public Board(int size) {
        this.size = size;
        resetBoard();
    }

    private void resetBoard() {
        this.board = new Piece[size][size];

        // setting Pawns
        for(int col=0; col<size; col++) {
            board[1][col] = PieceFactory.createPiece(PieceType.Pawn, Color.WHITE);
            board[size-2][col] = PieceFactory.createPiece(PieceType.Pawn, Color.BLACK);
        }

        // setting Rooks
        board[0][0] = PieceFactory.createPiece(PieceType.Rook, Color.WHITE);
        board[0][size-1] = PieceFactory.createPiece(PieceType.Rook, Color.WHITE);
        board[size-1][0] = PieceFactory.createPiece(PieceType.Rook, Color.BLACK);
        board[size-1][size-1] = PieceFactory.createPiece(PieceType.Rook, Color.BLACK);

        // setting Knights
        board[0][1] = PieceFactory.createPiece(PieceType.Knight, Color.WHITE);
        board[0][size-2] = PieceFactory.createPiece(PieceType.Knight, Color.WHITE);
        board[size-1][1] = PieceFactory.createPiece(PieceType.Knight, Color.BLACK);
        board[size-1][size-2] = PieceFactory.createPiece(PieceType.Knight, Color.BLACK);

        // setting Bishops
        board[0][2] = PieceFactory.createPiece(PieceType.Bishop, Color.WHITE);
        board[0][size-3] = PieceFactory.createPiece(PieceType.Bishop, Color.WHITE);
        board[size-1][2] = PieceFactory.createPiece(PieceType.Bishop, Color.BLACK);
        board[size-1][size-3] = PieceFactory.createPiece(PieceType.Bishop, Color.BLACK);

        // setting Kings
        board[0][3] = PieceFactory.createPiece(PieceType.King, Color.WHITE);
        board[size-1][size-4] = PieceFactory.createPiece(PieceType.King, Color.BLACK);

        // setting Queens
        board[0][4] = PieceFactory.createPiece(PieceType.Queen, Color.WHITE);
        board[size-1][size-5] = PieceFactory.createPiece(PieceType.Queen, Color.BLACK);
    }

    public void printBoard() {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if(board[i][j] == null) {
                    System.out.print("|\t\t|");
                }
                else {
                    System.out.print("|"+board[i][j] + "\t|");
                }
            }
            System.out.println();
        }
    }

    public Piece getPiece(Position pos) {
        if(pos.getX() >= 0 && pos.getX() < size && pos.getY() >= 0 && pos.getY() < size) {
            return board[pos.getX()][pos.getY()];
        }
        return null;
    }

    public void setPiece(Position srcPos, Position destPos) {
        Piece piece = board[srcPos.getX()][srcPos.getY()];
        board[srcPos.getX()][srcPos.getY()] = null;
        board[destPos.getX()][destPos.getY()] = piece;
    }

    public boolean checkIfValidPosition(Position pos) {
        int x = pos.getX();
        int y = pos.getY();
        return (x >= 0 && x < size && y >= 0 && y < size);
    }
}
