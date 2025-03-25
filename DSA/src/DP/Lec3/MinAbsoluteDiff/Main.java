package DP.Lec3.MinAbsoluteDiff;

public class Main {
    public static void main(String[] args) {
        int[] arr = {8,6,5};

        DP dp = new DP();
        int dp_ans = dp.minAbsoluteDiff(arr);
        System.out.println("DP: " + dp_ans);
    }
}
