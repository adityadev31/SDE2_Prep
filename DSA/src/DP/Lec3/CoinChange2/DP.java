package DP.Lec3.CoinChange2;

import java.util.Arrays;

public class DP {
    public int coinChange(int[] arr, int tar) {
        int n = arr.length;
        int[][] dp = new int[n][tar+1];

        for(int i=0; i<n; i++) dp[i][0] = 1;
        for(int j=0; j<=tar; j++) {
            if(j%arr[0] == 0) dp[0][j] = 1;
        }

        for(int i=1; i<n; i++) {
            for(int j=1; j<=tar; j++) {
                int notake = dp[i-1][j];
                int take = (j >= arr[i]) ? dp[i][j-arr[i]] : 0;
                dp[i][j] = take + notake;
            }
        }

        return dp[n-1][tar];
    }
}
