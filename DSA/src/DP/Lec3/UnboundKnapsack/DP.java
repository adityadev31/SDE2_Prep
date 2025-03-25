package DP.Lec3.UnboundKnapsack;

public class DP {

    public int unboundKnapSack(int[] val, int[] wts, int bag) {
        int n = val.length;
        int[][] dp = new int[n][bag+1];
        for(int j=0; j<=bag; j++) {
            dp[0][j] = val[0] * (j/wts[0]);
        }
        for(int i=1; i<n; i++) {
            for(int j=1; j<=bag; j++) {
                int notake = dp[i-1][j];
                int take = (j>=wts[i]) ? val[i] + dp[i][j-wts[i]] : (int)-1e8;
                dp[i][j] = Math.max(take, notake);
            }
        }
        return dp[n-1][bag];
    }
}
