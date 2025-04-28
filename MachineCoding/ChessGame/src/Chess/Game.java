package Chess;

import Chess.util.MyPrinter;
import Chess.util.MyScanner;

public class Game {
    private Board board;
    private MoveManager moveManager;
    private Player[] players;
    private int curPlayerIdx;

    public Game() {
        board = new Board();
        moveManager = new MoveManager(board);
        curPlayerIdx = 0;
    }

    private void initPlayers() {
        MyPrinter.print("Player1 choose color: White=0 | Black=1\t");
        int p1color = MyScanner.scan().nextInt();
        Player player1 = new Player(Color.WHITE);
        Player player2 = new Player(Color.BLACK);
        if(p1color == 0) players = new Player[]{player1, player2};
        else if(p1color == 1) players = new Player[]{player2, player1};
        else {
            MyPrinter.println("Wrong input, enter again");
            initPlayers();
        }
    }

    private void switchPlayer() {
        curPlayerIdx ^= 1;
    }

    private void makeMove() {
        MyPrinter.print("Player "+ players[curPlayerIdx].getColor() +" | Enter src position: Row Col: ");
        int r1 = MyScanner.scan().nextInt();
        int c1 = MyScanner.scan().nextInt();

        MyPrinter.print("Player "+ players[curPlayerIdx].getColor() +" | Enter dst position: Row Col: ");
        int r2 = MyScanner.scan().nextInt();
        int c2 = MyScanner.scan().nextInt();

        MoveResults res = moveManager.makeMove(r1, c1, r2, c2, players[curPlayerIdx]);
        if(res == MoveResults.VICTORY) {
            MyPrinter.println(moveManager.getVictoryTeam() + " won !!");
        }
        else if(res == MoveResults.KILL || res == MoveResults.VALID) {
            switchPlayer();
            makeMove();
        }
        else {
            makeMove();
        }
    }

    public void start() {
        initPlayers();
        board.printBoard();
        makeMove();
    }
}
