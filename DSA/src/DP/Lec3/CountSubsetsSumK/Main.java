package DP.Lec3.CountSubsetsSumK;

public class Main {
    public static void main(String[] args) {

        // Note: 0 is also in the array

        int[] arr = {3,0,2};
        int k = 5;

        Recursion rec = new Recursion();
        int rec_ans = rec.countSubset(arr.length-1, arr, k);
        System.out.println("Rec: " + rec_ans);

        DP dp = new DP();
        int dp_ans = dp.countSubset(arr, k);
        System.out.println("DP: " + dp_ans);
    }
}
