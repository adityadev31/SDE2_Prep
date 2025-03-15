package DP.Lec2.GridUniquePaths2;

import java.util.Arrays;

public class Memoize {
    public int uniquePaths(int i, int j, int[][] arr, int[][] dp) {
        if(i<0 || j<0) return 0;
        if(arr[i][j] == -1) return dp[i][j] = 0;
        if(i == 0 && j == 0) return dp[i][j] = 1;
        if(dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = uniquePaths(i-1, j, arr, dp) + uniquePaths(i, j-1, arr, dp);
    }

    public int uniquePaths(int i, int j, int[][] arr) {
        int[][] dp = new int[i+1][j+1];
        for(int[] rows: dp) {
            Arrays.fill(rows, -1);
        }
        return uniquePaths(i, j, arr, dp);
    }
}
