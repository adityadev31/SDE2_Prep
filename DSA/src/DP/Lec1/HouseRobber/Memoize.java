package DP.Lec1.HouseRobber;

import java.util.Arrays;

public class Memoize {
    public int houseRobber(int i, int[] arr, int[] dp) {
        if(i < 0) return 0;
        if(i == 0) return dp[i] = arr[i];
        if(dp[i] != -1) return dp[i];
        int take = arr[i] + houseRobber(i-2, arr, dp);
        int notake = houseRobber(i-1, arr, dp);
        return dp[i] = Math.max(take, notake);
    }

    public int houseRobber(int i, int[] arr) {
        int[] dp = new int[i+1];
        Arrays.fill(dp, -1);
        return houseRobber(i, arr, dp);
    }
}
