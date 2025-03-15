package DP.Lec1.FrogJump2;

public class Main {
    public static void main(String[] args) {
        int n = 5, k = 3;
        int[] energy = {10, 30, 40, 50, 20};

        Recursion rec = new Recursion();
        int rec_ans = rec.frogJump(n-1, k, energy);  // sending last index = 3
        System.out.println("Rec: " + rec_ans);

        Memoize memo = new Memoize();
        int memo_ans = memo.frogJump(n-1, k, energy); // sending last index = 3
        System.out.println("Memo: " + memo_ans);

        DP dp = new DP();
        int dp_ans = dp.frogJump(n-1, k, energy); // sending last index = 3
        System.out.println("DP: " + dp_ans);
    }
}
