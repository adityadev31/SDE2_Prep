package DP.Lec3.UnboundKnapsack;

import java.util.Arrays;

public class Memoize {
    private int unboundKnapSack(int i, int bag, int[] val, int[] wts, int[][] dp) {
        if(bag == 0) return dp[i][bag] = 0;
        if(i == 0) return dp[i][bag] = val[i] * (bag/wts[i]);
        if(dp[i][bag] != -1) return dp[i][bag];
        int notake = unboundKnapSack(i-1, bag, val, wts, dp);
        int take = (bag>=wts[i]) ? val[i] + unboundKnapSack(i, bag-wts[i], val, wts, dp) : (int)-1e8;
        return dp[i][bag] = Math.max(take, notake);
    }

    public int unboundKnapSack(int[] val, int[] wts, int bag) {
        int n = val.length;
        int[][] dp = new int[n][bag+1];
        for(int[] rows: dp) Arrays.fill(rows, -1);
        return unboundKnapSack(n-1, bag, val, wts, dp);
    }
}
