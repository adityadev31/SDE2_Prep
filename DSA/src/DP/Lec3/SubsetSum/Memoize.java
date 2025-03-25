package DP.Lec3.SubsetSum;

import java.util.Arrays;

public class Memoize {
    public int subsetSum(int idx, int[] arr, int tar, int[][] dp) {
        if(idx == 0) return dp[idx][tar] = (arr[idx] == tar) ? 1:0;
        if(tar == 0) return dp[idx][tar] = 1;
        if(dp[idx][tar] != -1) return dp[idx][tar];
        int noTake = subsetSum(idx-1, arr, tar, dp);
        int take = (tar>=arr[idx]) ? subsetSum(idx-1, arr, tar-arr[idx], dp) : 0;
        return dp[idx][tar] = take | noTake;
    }

    public boolean subsetSum(int[] arr, int tar) {
        int n = arr.length;
        int[][] dp = new int[n][tar+1];
        for(int[] rows: dp) Arrays.fill(rows, -1);
        return subsetSum(n-1, arr, tar, dp) == 1;
    }
}
