package DP.Lec1.ClimbingStairs;

public class Main {
    public static void main(String[] args) {
        Recursion rec = new Recursion();
        int rec_ans = rec.climbingStairs(3);
        System.out.println("Rec: " + rec_ans);

        Memoize memo = new Memoize();
        int memo_ans = rec.climbingStairs(3);
        System.out.println("Memo: " + memo_ans);

        DP dp = new DP();
        int dp_ans = dp.climbingStairs(3);
        System.out.println("DP: " + dp_ans);
    }
}
