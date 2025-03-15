package DP.Lec2.FallingPathSum;

public class DP {

    public int fallingPathSum(int[][] arr) {
        int R = arr.length;
        int C = arr[0].length;
        int[][] dp = new int[R][C];
        // Base Case
        for(int j=0; j<C; j++) dp[0][j] = arr[0][j];

        for(int i=1; i<R; i++) {
            for(int j=0; j<C; j++) {
                int up = dp[i-1][j];
                int upLeft = ((j-1>=0) ? dp[i-1][j-1] : 0);
                int upRight = ((j+1<C) ? dp[i-1][j+1] : 0);
                dp[i][j] = arr[i][j] + Math.max(up, Math.max(upLeft, upRight));
            }
        }

        int max = 0;
        for(int j=0; j<C; j++) {
            max = Math.max(max, dp[R-1][j]);
        }
        return max;
    }
}
