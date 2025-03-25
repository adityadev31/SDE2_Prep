package DP.Lec3.RodCutting;

public class DP {

    public int rodCutting(int[] cost) {
        int n = cost.length;
        int[][] dp = new int[n+1][n+1];
        for(int j=1; j<=n; j++) dp[0][j] = cost[0] * j;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                int notake = dp[i-1][j];
                int take = (j >= i) ? cost[i-1] + dp[i][j-i] : 0;
                dp[i][j] = Math.max(take, notake);
            }
        }
        return dp[n][n];
    }
}
