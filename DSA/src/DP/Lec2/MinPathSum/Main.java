package DP.Lec2.MinPathSum;

public class Main {
    public static void main(String[] args) {

        int matrix[][] = {
                {5, 9, 6},
                {11, 5, 2}
        };

        Recursion rec = new Recursion();
        int rec_ans = rec.minPathSum(matrix);
        System.out.println("Rec: " + rec_ans);

        Memoize memo = new Memoize();
        int memo_ans = memo.minPathSum(matrix);
        System.out.println("Memo: " + memo_ans);

        DP dp = new DP();
        int dp_ans = dp.minPathSum(matrix);
        System.out.println("DP: " + dp_ans);
    }
}
