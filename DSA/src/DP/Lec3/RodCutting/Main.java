package DP.Lec3.RodCutting;

public class Main {
    public static void main(String[] args) {
        int[] price = {2,5,7,8,10};

        Recursion rec = new Recursion();
        int rec_ans = rec.rodCutting(price);
        System.out.println("Rec: " + rec_ans);

        Memoize memo = new Memoize();
        int memo_ans = memo.rodCutting(price);
        System.out.println("Memo: " + memo_ans);

        DP dp = new DP();
        int dp_ans = dp.rodCutting(price);
        System.out.println("DP: " + dp_ans);
    }
}
