package TicTacToe;

public class Piece {
    private final char symbol;
    public Piece(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return this.symbol+"";
    }
}
