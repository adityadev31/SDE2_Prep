package DP.Lec3.CoinChange2;

import java.util.Arrays;

public class Memoize {
    private int coinChange(int i, int tar, int[] arr, int[][] dp) {
        if(tar == 0) return dp[i][tar] = 1;
        if(i == 0) {
            if(tar%arr[i] == 0) return dp[i][tar] = 1;
            return dp[i][tar] = 0;
        }
        if(dp[i][tar] != -1) return dp[i][tar];
        int noTake = coinChange(i-1, tar, arr, dp);
        int take = (tar >= arr[i]) ? coinChange(i, tar-arr[i], arr, dp) : 0;
        return dp[i][tar] = take + noTake;
    }
    public int coinChange(int[] arr, int tar) {
        int n = arr.length;
        int[][] dp = new int[n][tar+1];
        for(int[] row: dp) Arrays.fill(row, -1);
        return coinChange(n-1, tar, arr, dp);
    }
}
