package DP.Lec2.MinPathSumTriangle;

public class DP {

    public int minPathTriangle(int[][] arr) {
        int R = arr.length;
        int C = arr[R-1].length;
        int[][] dp = new int[R][C];
        dp[0][0] = arr[0][0];
        for(int i=1; i<R; i++) {
            for(int j=0; j<=i; j++) {
                int up = (j>i-1) ? (int) 1e8 : dp[i-1][j];
                int upleft = (j-1 < 0) ? (int) 1e8 : dp[i-1][j-1];
                dp[i][j] = arr[i][j] + Math.min(up, upleft);
            }
        }
        int min = (int) 1e8;
        for(int j=0; j<C; j++) {
            min = Math.min(min, dp[R-1][j]);
        }
        return min;
    }
}
