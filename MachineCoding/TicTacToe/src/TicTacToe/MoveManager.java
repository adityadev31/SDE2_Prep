package TicTacToe;

public class MoveManager {
    private final Board board;
    private int moveCount;

    // constructor
    public MoveManager(Board board) {
        this.board = board;
        this.moveCount = 0;
    }

    // move manager
    private boolean isValidPosition(Position pos) {
        return (pos.getX() >= 0 &&
                pos.getX() < board.size &&
                pos.getY() >= 0 &&
                pos.getY() < board.size &&
                board.getMark(pos) == null);
    }

    private MoveResult isVictory(Position pos) {
        int x = pos.getX();
        int y = pos.getY();
        Mark mark = board.getMark(pos);

        // check row
        boolean victory = true;
        for(int j=0; j<board.size; j++) {
            if(board.getMark(new Position(x, j)) != mark) {
                victory = false;
                break;
            }
        }
        if(victory) return MoveResult.VICTORY;
        victory = true;

        // check col
        for(int i=0; i< board.size; i++) {
            if(board.getMark(new Position(i, y)) != mark) {
                victory = false;
                break;
            }
        }
        if(victory) return MoveResult.VICTORY;
        victory = true;

        // check diag
        for(int i=x, j=y; i<board.size && j<board.size; i++,j++) {
            if(board.getMark(new Position(i, j)) != mark) {
                victory = false;
                break;
            }
        }
        if(victory) {
            for (int i=x, j=y; i>=0 && j>=0; i--, j--) {
                if (board.getMark(new Position(i, j)) != mark) {
                    victory = false;
                    break;
                }
            }
        }
        if(victory) {
            for (int i=x, j=y; i>=0 && j<board.size; i--, j++) {
                if (board.getMark(new Position(i, j)) != mark) {
                    victory = false;
                    break;
                }
            }
        }
        if(victory) {
            for (int i=x, j=y; i<board.size && j>=0; i++, j--) {
                if (board.getMark(new Position(i, j)) != mark) {
                    victory = false;
                    break;
                }
            }
        }
        if(victory) return MoveResult.VICTORY;

        // draw check
        if(moveCount == (board.size * board.size)) return MoveResult.DRAW;
        return MoveResult.VALID;
    }

    public MoveResult makeMove(Position pos, Mark mark) {
        if(!isValidPosition(pos)) {
            System.out.println("Invalid position entered !");
            return MoveResult.INVALID;
        }
        board.setMark(pos, mark);
        moveCount++;
        board.printBoard();
        return isVictory(pos);
    }


}
