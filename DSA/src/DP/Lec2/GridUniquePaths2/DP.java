package DP.Lec2.GridUniquePaths2;

public class DP {
    public int uniquePaths(int m, int n, int[][] arr) {
        int[][] dp = new int[m+1][n+1];
        for(int i=0; i<=m; i++) {
            for(int j=0; j<=n; j++) {
                if(arr[i][j] == -1) dp[i][j] = 0;
                else if(i==0 && j==0) dp[i][j] = 1;
                else {
                    int up = ((i - 1 >= 0) ? dp[i - 1][j] : 0);
                    int left = ((j - 1 >= 0) ? dp[i][j - 1] : 0);
                    dp[i][j] = up + left;
                }
            }
        }
        return dp[m][n];
    }
}
