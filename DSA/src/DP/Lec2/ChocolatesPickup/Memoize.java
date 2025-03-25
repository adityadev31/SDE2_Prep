package DP.Lec2.ChocolatesPickup;

import java.util.Arrays;

public class Memoize {
    public int chocolatePickup(int i, int j1, int j2, int R, int C, int[][] arr, int[][][] dp) {
        // Base Cases
        if(i<0 || i>=R || j1<0 || j1>=C || j2<0 || j2>=C) return (int) -1e8;
        if(i == R-1) {
            if(j1 == j2) return dp[i][j1][j2] = arr[i][j1];
            return dp[i][j1][j2] = arr[i][j1] + arr[i][j2];
        }
        if(dp[i][j1][j2] != -1) return dp[i][j1][j2];
        int max = (int) -1e8;
        for(int dj1=-1; dj1<=1; dj1++) {
            for(int dj2=-1; dj2<=1; dj2++) {
                max = Math.max(max, chocolatePickup(i+1, j1+dj1, j2+dj2, R, C, arr, dp));
            }
        }
        if(j1 == j2) max = arr[i][j1] + max;
        else max = arr[i][j1] + arr[i][j2] + max;
        return dp[i][j1][j2] = max;
    }

    public int chocolatePickup(int[][] arr) {
        int R = arr.length;
        int C = arr[0].length;
        int[][][] dp = new int[R][C][C];
        for(int[][] row1: dp) {
            for(int[] row2: row1) {
                Arrays.fill(row2, -1);
            }
        }
        return chocolatePickup(0,0,C-1,R,C,arr, dp);
    }
}
