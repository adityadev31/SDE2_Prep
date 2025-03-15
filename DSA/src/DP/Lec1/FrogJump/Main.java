package DP.Lec1.FrogJump;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        int[] energy = {10,20,30,10};

        Recursion rec = new Recursion();
        int rec_ans = rec.frogJump(n-1, energy);  // sending last index = 3
        System.out.println("Rec: " + rec_ans);

        Memoize memo = new Memoize();
        int memo_ans = memo.frogJump(n-1, energy); // sending last index = 3
        System.out.println("Memo: " + memo_ans);

        DP dp = new DP();
        int dp_ans = dp.frogJump(n-1, energy); // sending last index = 3
        System.out.println("DP: " + dp_ans);
    }
}
