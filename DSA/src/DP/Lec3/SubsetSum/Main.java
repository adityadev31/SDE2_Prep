package DP.Lec3.SubsetSum;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int tar = 4;

        Recursion rec = new Recursion();
        boolean rec_ans = rec.subsetSum(arr, tar);
        System.out.println("Rec: " + rec_ans);

        Memoize memo = new Memoize();
        boolean memo_ans = memo.subsetSum(arr, tar);
        System.out.println("Memo: " + memo_ans);

        DP dp = new DP();
        boolean dp_ans = dp.subsetSum(arr, tar);
        System.out.println("DP: " + dp_ans);
    }
}
