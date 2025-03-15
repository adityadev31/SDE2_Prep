package DP.Lec2.MinPathSum;

public class DP {
    public int minPathSum(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(i == 0 && j == 0) dp[i][j] = arr[i][j];
                else {
                    int up = ((i-1>=0) ? dp[i-1][j] : (int)1e8);
                    int left = ((j-1>=0) ? dp[i][j-1] : (int)1e8);
                    dp[i][j] = arr[i][j] + Math.min(up, left);
                }
            }
        }
        return dp[m-1][n-1];
    }
}
