import ChessGame.GameService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        GameService game = new GameService(scn);
        game.start();
    }
}