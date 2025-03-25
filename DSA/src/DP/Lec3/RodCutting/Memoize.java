package DP.Lec3.RodCutting;

import java.util.Arrays;

public class Memoize {
    private int rodCutting(int cut, int rodLen, int[] cost, int[][] dp) {
        if(rodLen == 0) return dp[cut][rodLen] = 0;
        if(cut == 1) {
            return dp[cut][rodLen] = cost[0] * rodLen;
        }
        if(dp[cut][rodLen] != -1) return dp[cut][rodLen];
        int notake = rodCutting(cut-1, rodLen, cost, dp);
        int take = (rodLen >= cut) ? cost[cut-1] + rodCutting(cut, rodLen-cut, cost, dp) : 0;
        return dp[cut][rodLen] = Math.max(take, notake);
    }

    public int rodCutting(int[] cost) {
        int n = cost.length;
        int[][] dp = new int[n+1][n+1];
        for(int[] row: dp) Arrays.fill(row, -1);
        return rodCutting(n, n, cost, dp);
    }
}
