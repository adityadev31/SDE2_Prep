package DP.Lec3.EqualPartitionSubsetSum;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 3, 4, 5};

        Recursion rec = new Recursion();
        boolean rec_ans = rec.equalPartition(arr);
        System.out.println("Rec: " + rec_ans);

        DP dp = new DP();
        boolean dp_ans = dp.equalPartition(arr);
        System.out.println("DP: " + dp_ans);
    }
}
