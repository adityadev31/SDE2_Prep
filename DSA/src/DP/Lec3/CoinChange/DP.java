package DP.Lec3.CoinChange;

public class DP {
    public int minCoins(int[] arr, int tar) {
        int n = arr.length;
        int MAX = (int) 1e8;

        int[][] dp = new int[n][tar+1];
        for(int j=0; j<=tar; j++) {
            if(j%arr[0] == 0) dp[0][j] = j / arr[0];
            else dp[0][j] = MAX;
        }
        for(int i=1; i<n; i++) {
            for(int j=1; j<=tar; j++) {
                int notTaken = dp[i-1][j];
                int taken = (j >= arr[i]) ? 1 + dp[i][j-arr[i]] : MAX;
                dp[i][j] = Math.min(taken, notTaken);
            }
        }
        return dp[n-1][tar];
    }
}
