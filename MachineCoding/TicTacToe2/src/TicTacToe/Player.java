package TicTacToe;

public class Player {
    private final char symbol;
    private final String name;

    // constructor
    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    // getter
    public char getSymbol() { return this.symbol; }
    public String getName() { return this.name; }

    @Override
    public String toString() {
        return "Player name: "+name+" | symbol: "+symbol;
    }
}
