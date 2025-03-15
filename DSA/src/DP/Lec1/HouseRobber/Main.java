package DP.Lec1.HouseRobber;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,4};
        int n = 3;

        Recursion rec = new Recursion();
        int rec_ans = rec.houseRobber(n-1, arr);
        System.out.println("Rec: " + rec_ans);

        Memoize memo = new Memoize();
        int memo_ans = memo.houseRobber(n-1, arr);
        System.out.println("Memo: " + memo_ans);

        DP dp = new DP();
        int dp_ans = dp.houseRobber(n-1, arr);
        System.out.println("DP: " + dp_ans);

    }
}
