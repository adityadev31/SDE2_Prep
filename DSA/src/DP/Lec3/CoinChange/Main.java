package DP.Lec3.CoinChange;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int tar = 7;

        Recursion rec = new Recursion();
        int rec_ans = rec.minCoins(arr, tar);
        System.out.println("Rec: " + rec_ans);

        Memoize mem = new Memoize();
        int mem_ans = mem.minCoins(arr, tar);
        System.out.println("Memo: " + mem_ans);

        DP dp = new DP();
        int dp_ans = dp.minCoins(arr, tar);
        System.out.println("DP: " + dp_ans);
    }
}
