package DP.Lec2.MinPathSumTriangle;

import java.util.Arrays;

public class Memoize {
    public int minPathTriangle(int i, int j, int[][] arr, int[][] dp) {
        if(i<0 || j<0 || j>i) return (int) 1e8;
        if(i == 0 && j == 0) return dp[i][j] = arr[i][j];
        if(dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = arr[i][j] + Math.min(minPathTriangle(i-1, j, arr, dp), minPathTriangle(i-1, j-1, arr, dp));
    }

    public int minPathTriangle(int[][] arr) {
        int R = arr.length;
        int C = arr[0].length;
        int[][] dp = new int[R][C];
        for(int[] row: dp) {
            Arrays.fill(row, -1);
        }
        int min = (int) 1e8;
        for(int j=0; j<C; j++) {
            min = Math.min(min, minPathTriangle(R-1, j, arr, dp));
        }
        return min;
    }
}
