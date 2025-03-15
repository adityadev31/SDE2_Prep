package DP.Lec2.GridUniquePaths;

import java.util.Arrays;

public class Memoize {
    public int uniquePaths(int i, int j, int[][] dp) {
        if(i == 0 || j == 0) dp[i][j] = 1;
        if(dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = uniquePaths(i-1, j, dp) + uniquePaths(i, j-1, dp);
    }

    public int uniquePaths(int i, int j) {
        int[][] dp = new int[i+1][j+1];
        for(int[] row: dp) {
            Arrays.fill(row, -1);
        }
        return uniquePaths(i, j, dp);
    }
}
