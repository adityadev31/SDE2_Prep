package TicTacToe;

import TicTacToe.util.MyPrinter;
import TicTacToe.util.MyScanner;

public class Game {
    private MoveManager moveManager;
    private Player[] players;
    private int curPlayerID;

    public Game() {
        resetGame();
        initPlayers();
    }

    private void resetGame() {
        moveManager = new MoveManager(new Board(3));
        curPlayerID = 0;
    }

    private void initPlayers() {
        MyPrinter.print("Enter Number Of Players: ");
        int playerSize = MyScanner.scn.nextInt();

        players = new Player[playerSize];

        for(int i=0; i<playerSize; i++) {
            MyPrinter.print("Enter player"+(i+1)+" name: ");
            String name = MyScanner.scn.next();
            MyPrinter.print("Enter player"+(i+1)+" Symbol: ");
            char symbol = MyScanner.scn.next().charAt(0);
            players[i] = new Player(name, symbol);
            MyPrinter.println("");
        }
    }

    private void changePlayer() {
        curPlayerID = (curPlayerID + 1) % players.length;
    }

    private MoveResults makeMove() {
        Player currentPlayer = players[curPlayerID];
        MyPrinter.print(currentPlayer.getName() + " Enter x y: ");
        int x = MyScanner.scn.nextInt();
        int y = MyScanner.scn.nextInt();
        return moveManager.makeMove(x, y, currentPlayer);
    }

    public void start() {
        MoveResults moveResults = makeMove();
        if(moveResults == MoveResults.VICTORY || moveResults == MoveResults.DRAW) {
            MyPrinter.print("Wanna Start Over? y/n: ");
            char res = MyScanner.scn.next().toLowerCase().charAt(0);
            MyPrinter.println("");
            if(res != 'y') return;
            resetGame();
            start();
        }
        if(moveResults == MoveResults.VALID) changePlayer();
        start();
    }
}
