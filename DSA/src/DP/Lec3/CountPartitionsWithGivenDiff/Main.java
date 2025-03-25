package DP.Lec3.CountPartitionsWithGivenDiff;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,2,6,4};
        int diff = 3;
        int n = arr.length;

        Recursion rec = new Recursion();
        System.out.println("Rec: " + rec.countPartitionWays(arr, diff));

        DP dp = new DP();
        System.out.println("DP: " + dp.countPartitionWays(arr, diff));
    }
}
