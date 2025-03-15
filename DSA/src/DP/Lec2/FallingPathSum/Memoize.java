package DP.Lec2.FallingPathSum;

import java.util.Arrays;

public class Memoize {
    public int fallingPathSum(int i, int j, int C, int[][] arr, int[][] dp) {
        if(i<0 || j<0 || j>=C) return 0;
        if(i==0) return dp[i][j] = arr[i][j];
        if(dp[i][j] != -1) return dp[i][j];
        int up = fallingPathSum(i-1, j, C, arr, dp);
        int upLeft = fallingPathSum(i-1, j-1, C, arr, dp);
        int upRight = fallingPathSum(i-1, j+1, C, arr, dp);
        return dp[i][j] = arr[i][j] + Math.max(up, Math.max(upLeft, upRight));
    }

    public int fallingPathSum(int[][] arr) {
        int R = arr.length;
        int C = arr[0].length;
        int[][] dp = new int[R][C];
        for(int[] row: dp) Arrays.fill(row, -1);
        int max = 0;
        for(int j=0; j<C; j++) {
            max = Math.max(max, fallingPathSum(R-1, j, C, arr, dp));
        }
        return max;
    }
}
