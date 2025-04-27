package Chess.util;

import java.util.Scanner;

public class MyScanner {
    private static Scanner scn = new Scanner(System.in);
    private MyScanner() {}
    public static Scanner scan() {
        return scn;
    }
}
