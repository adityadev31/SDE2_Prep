package DP.Lec3.CoinChange;

import java.util.Arrays;

public class Memoize {
    int MAX = (int)1e8;
    private int minCoins(int i, int tar, int[] arr, int[][] dp) {
        if(tar == 0) return dp[i][tar] = 0;
        if(i == 0) {
            if(tar%arr[i] == 0) return tar/arr[i];
            return MAX;
        }
        if(dp[i][tar] != -1) return dp[i][tar];
        int notTaken = minCoins(i-1, tar, arr, dp);
        int taken = (tar >= arr[i]) ? 1 + minCoins(i, tar-arr[i], arr, dp) : (int) 1e8;
        return dp[i][tar] = Math.min(taken, notTaken);
    }

    public int minCoins(int[] arr, int tar) {
        int[][] dp = new int[arr.length][tar+1];
        for(int[] row: dp) {
            Arrays.fill(row, -1);
        }
        return minCoins(arr.length-1, tar, arr, dp);
    }

}
