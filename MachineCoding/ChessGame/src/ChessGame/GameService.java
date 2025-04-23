package ChessGame;

import java.util.Scanner;

public class GameService {
    Board board;
    Player[] players;
    int currentPlayer;
    boolean isGameOver;
    Scanner scn;

    public GameService(Scanner scn) {
        this.scn = scn;
        this.currentPlayer = 0;
        this.isGameOver = false;
        board = new Board(8);
    }

    private void selectPlayers() {
        System.out.println("=====================================");
        System.out.println("Player1: choose your color");
        System.out.print("Press 1: WHITE, Press 2: BLACK\tEnter: ");
        int player1Color = scn.nextInt();
        if(player1Color == 1) {
            players = new Player[]{new Player(Color.WHITE), new Player(Color.BLACK)};
        } else {
            players = new Player[]{new Player(Color.BLACK), new Player(Color.WHITE)};
        }
        System.out.println();
        System.out.println("Player1 chooses: " + players[0].getColor());
        System.out.println("Player2 chooses: " + players[1].getColor());
        System.out.println("=====================================");
    }

    private Position getPosition(String content) {
        System.out.print(content);
        int x = scn.nextInt();
        int y = scn.nextInt();
        return new Position(x, y);
    }

    private boolean isCurrPlayerPiece(Position pos) {
        Piece selectedPiece = board.getPiece(pos);
        if(selectedPiece == null) {
            System.out.println("Select valid piece !");
            return false;
        }
        if(selectedPiece.getColor() != players[currentPlayer].getColor()) {
            System.out.println("Select your piece !");
            return false;
        }
        return true;
    }

    private void changeCurrentPlayer() {
        currentPlayer = currentPlayer ^ 1;
    }

    private void makeMove() {
        System.out.println("=============================================");
        System.out.println("Player" + (currentPlayer + 1) + ": make move");
        Position srcPos = getPosition("Enter start pos [x y]: ");
        Position destPos = getPosition("Enter end pos [x y]: ");

        // check if src position has curPlayer's piece
        if(!isCurrPlayerPiece(srcPos)) return;
        boolean moveResult = board.getPiece(srcPos).makeMove(board, srcPos, destPos);
        if(!moveResult) return;
        else changeCurrentPlayer();
        System.out.println("=============================================");
        board.printBoard();
        System.out.println("=============================================");
    }

    // start Game
    public void start() {
        selectPlayers();

        board.printBoard();

        while(!isGameOver) {
            makeMove();
        }
    }

}
