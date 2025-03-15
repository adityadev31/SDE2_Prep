package DP.Lec2.MinPathSum;

import java.util.Arrays;

public class Memoize {
    public int minPathSum(int i, int j, int[][] arr, int[][] dp) {
        if(i<0 || j<0) return (int) 1e8;
        if(i == 0 && j == 0) return dp[i][j] = arr[i][j];
        if(dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = arr[i][j] + Math.min(minPathSum(i-1, j, arr, dp), minPathSum(i, j-1, arr, dp));
    }

    public int minPathSum(int[][] arr) {
        int row_idx = arr.length-1;
        int col_idx = arr[0].length-1;
        int[][] dp = new int[row_idx+1][col_idx+1];
        for(int[] row: dp) Arrays.fill(row, -1);
        return minPathSum(row_idx, col_idx, arr, dp);
    }
}
