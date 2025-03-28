package DP.Lec1.ClimbingStairs;

public class DP {
    public int climbingStairs(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        if(n >= 1) dp[1] = 1;
        for(int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
