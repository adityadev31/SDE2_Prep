package TicTacToe;

public class Player {
    private final Mark mark;

    // constructor
    public Player(Mark mark) {
        this.mark = mark;
    }

    // getter & setter
    public Mark getMark() {
        return this.mark;
    }
}
