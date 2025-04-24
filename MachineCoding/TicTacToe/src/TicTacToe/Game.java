package TicTacToe;

import java.util.Scanner;

public class Game {
    private Player[] players;
    private Board board;
    private MoveManager moveManager;
    private Scanner scn;
    private int curPlayer;

    // constructor
    public Game(Scanner scn) {
        this.scn = scn;
        this.curPlayer = 0;
    }

    private void initBoard() {
        System.out.print("Enter board size:\t");
        int size = scn.nextInt();
        board = new Board(size);
    }

    private void initPlayers() {
        System.out.print("Player 1: choose your mark: O or X ? ");
        char player1Mark = scn.next().charAt(0);
        if(player1Mark == 'O') players = new Player[]{new Player(Mark.O), new Player(Mark.X)};
        else players = new Player[]{new Player(Mark.X), new Player(Mark.O)};
        System.out.println("Player1: " + players[0].getMark().toString());
        System.out.println("Player2: " + players[1].getMark().toString());
    }

    private void initMoveManager() {
        this.moveManager = new MoveManager(board);
    }

    private void changePlayer() {
        curPlayer ^= 1;
    }

    private void registerMoves() {
        System.out.print("Player" + (curPlayer+1) + ": Enter the position [x y]: ");
        int x = scn.nextInt();
        int y = scn.nextInt();
        Position pos = new Position(x, y);
        MoveResult res = moveManager.makeMove(pos, players[curPlayer].getMark());
        if(res == MoveResult.VICTORY) {
            System.out.println("Player" + (curPlayer+1) + " wins !!");
            return;
        }
        if(res == MoveResult.DRAW) {
            System.out.println("Match Draw !!");
            return;
        }
        if(res == MoveResult.VALID) changePlayer();
        registerMoves();
    }

    // start game
    public void start() {
        initBoard();
        initPlayers();
        initMoveManager();
        registerMoves();
    }
}
