package DP.Lec2.GridUniquePaths2;

public class Main {
    public static void main(String[] args) {

        int[][] maze = {
            {0, 0, 0},
            {0, -1, 0},
            {0, 0, 0}
        };

        int m = maze.length;
        int n = maze[0].length;

        Recursion rec = new Recursion();
        int rec_ans = rec.uniquePaths(m-1, n-1, maze);
        System.out.println("Rec: " + rec_ans);

        Memoize memo = new Memoize();
        int memo_ans = memo.uniquePaths(m-1, n-1, maze);
        System.out.println("Memo: " + memo_ans);

        DP dp = new DP();
        int dp_ans = dp.uniquePaths(m-1, n-1, maze);
        System.out.println("DP: " + dp_ans);

    }
}
