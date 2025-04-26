package TicTacToe;

import java.util.Scanner;

public class Game {
    private Player[] players;
    private MoveManager moveManager;
    private final Scanner scn;
    private int curPlayerId;

    // constructor
    public Game() {
        scn = new Scanner(System.in);
        resetGame();
        initPlayers();
    }

    // init setups
    private void resetGame() {
        moveManager = new MoveManager(new Board(), scn);
        curPlayerId = 0;
    }

    private void initPlayers() {
        System.out.print("Enter no. of players: ");
        int playerCount = scn.nextInt();
        players = new Player[playerCount];

        for(int i=0; i<playerCount; i++) {
            System.out.print("Enter Player"+ (i+1) +" name: ");
            String playerName = scn.next();
            System.out.print("Enter Player"+ (i+1) +" symbol: ");
            char playerSymbol = scn.next().charAt(0);
            players[i] = new Player(playerName, playerSymbol);
            System.out.println();
        }
    }

    private void changePlayer() {
        curPlayerId ^= 1;
    }

    public void start() {
        while (!moveManager.isFull()) {
            System.out.print(players[curPlayerId].getName() + " ");
            boolean isValidMove = moveManager.makeMove(players[curPlayerId]);
            if(!isValidMove) continue;
            if(moveManager.isWinner()) break;
            changePlayer();
        }
        if(!moveManager.isWinner()) {
            System.out.println("Match Draw !!");
        }
        System.out.print("Restart Game? Y/N: ");
        char restart = scn.next().toLowerCase().charAt(0);
        if(restart == 'y') {
            resetGame();
            start();
        }
    }
}
