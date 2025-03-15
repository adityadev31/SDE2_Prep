package DP.Lec2.GridUniquePaths;

public class Main {
    public static void main(String[] args) {
        int m = 3, n = 2;

        Recursion rec = new Recursion();
        int rec_ans = rec.uniquePaths(m-1,n-1);
        System.out.println("Rec: " + rec_ans);

        Memoize memo = new Memoize();
        int memo_ans = memo.uniquePaths(m-1, n-1);
        System.out.println("Memo: " + memo_ans);

        DP dp = new DP();
        int dp_ans = dp.uniquePaths(m-1, n-1);
        System.out.println("DP: " + dp_ans);
    }
}
