package DP.Lec3.CountSubsetsSumK;

public class DP {
    public int countSubset(int[] arr, int tar) {
        int n = arr.length;
        int[][] dp = new int[n][tar+1];

        if(arr[0] == 0) dp[0][0] = 2;
        else if(arr[0] <= tar) dp[0][arr[0]] = 1;

        for(int i=1; i<n; i++) {
            for(int j=0; j<=tar; j++) {
                int notake = dp[i-1][j];
                int take = (j >= arr[i]) ? dp[i-1][j-arr[i]] : 0;
                dp[i][j] = take + notake;
            }
        }
        return dp[n-1][tar];
    }
}
