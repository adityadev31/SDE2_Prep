package TicTacToe;

public class Player {
    private final String name;
    private final char symbol;
    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    // methods
    public String getName() {
        return name;
    }
    public char getSymbol() {
        return symbol;
    }
    public String toString() {
        return "Player: " + name + "  Symbol: " + symbol;
    }
}
