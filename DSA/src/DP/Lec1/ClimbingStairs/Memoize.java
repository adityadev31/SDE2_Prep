package DP.Lec1.ClimbingStairs;

import java.util.Arrays;

public class Memoize {
    public int climbingStairs(int n, int[] dp) {
        if(n < 0) return 0;
        if(n == 0) return dp[n] = 1;
        if(dp[n] != -1) return dp[n];
        return dp[n] = climbingStairs(n-1) + climbingStairs(n-2);
    }

    public int climbingStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return climbingStairs(n, dp);
    }
}
