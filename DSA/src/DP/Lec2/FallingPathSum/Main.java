package DP.Lec2.FallingPathSum;

public class Main {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 10, 4},
                {100, 3, 2, 1},
                {1, 1, 20, 2},
                {1, 2, 2, 1}};

        Recursion rec = new Recursion();
        int rec_ans = rec.fallingPathSum(matrix);
        System.out.println("Rec: " + rec_ans);

        Memoize memo = new Memoize();
        int memo_ans = memo.fallingPathSum(matrix);
        System.out.println("Memoize: " + memo_ans);

        DP dp = new DP();
        int dp_ans = dp.fallingPathSum(matrix);
        System.out.println("DP: " + dp_ans);
    }
}
