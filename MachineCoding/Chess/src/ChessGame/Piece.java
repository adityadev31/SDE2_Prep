public abstract class Piece {
    private Position position;
    private final Color color;

    public Piece(Position position, Color color) {
        this.position = position;
        this.color = color;
    }

    abstract boolean canMove(Position dest);

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
