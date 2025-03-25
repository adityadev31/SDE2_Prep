package DP.Lec3.EqualPartitionSubsetSum;

public class DP {
    private boolean subsetSum(int i, int[] arr, int tar) {
        if(i == 0) return arr[0] == tar;
        if(tar == 0) return true;
        boolean notake = subsetSum(i-1, arr, tar);
        boolean take = (tar >= arr[i]) ? subsetSum(i-1, arr, tar-arr[i]) : false;
        return take | notake;
    }

    public boolean equalPartition(int[] arr) {
        int sum = findSum(arr);
        int n = arr.length;
        if(sum % 2 != 0) return false;
        int tar = sum / 2;
        boolean[][] dp = new boolean[n][tar+1];
        for(int i=0; i<n; i++) dp[i][0] = true;
        if(tar >= arr[0]) dp[0][arr[0]] = true;
        for(int i=1; i<n; i++) {
            for(int j=1; j<=tar; j++) {
                boolean notake = dp[i-1][j];
                boolean take = (j>=arr[i]) ? dp[i-1][j-arr[i]] : false;
                dp[i][j] = take | notake;
            }
        }
        return dp[n-1][tar];
    }

    private int findSum(int[] arr) {
        int sum = 0;
        for(int i:arr) sum += i;
        return sum;
    }
}
