package DP.Lec3.UnboundKnapsack;

public class Main {
    public static void main(String[] args) {
        int[] wt = {2,4,6};
        int[] val = {5,11,13};
        int bag = 10;

        Recursion rec = new Recursion();
        int rec_ans = rec.unboundKnapSack(val, wt, bag);
        System.out.println("Rec: " + rec_ans);

        Memoize memo = new Memoize();
        int memo_ans = memo.unboundKnapSack(val, wt, bag);
        System.out.println("Memo: " + memo_ans);

        DP dp = new DP();
        int dp_ans = dp.unboundKnapSack(val, wt, bag);
        System.out.println("DP: " + dp_ans);
    }
}
