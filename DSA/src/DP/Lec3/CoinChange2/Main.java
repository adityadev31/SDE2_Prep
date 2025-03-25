package DP.Lec3.CoinChange2;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int tar = 4;

        Recursion rec = new Recursion();
        int rec_ans = rec.coinChange(arr, tar);
        System.out.println("Rec: " + rec_ans);

        Memoize memo = new Memoize();
        int memo_ans = memo.coinChange(arr, tar);
        System.out.println("Memo: " + memo_ans);
    }
}
