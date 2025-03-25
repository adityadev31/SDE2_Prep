package DP.Lec3.SubsetSum;

public class DP {

    public boolean subsetSum(int[] arr, int tar) {
        int n = arr.length;
        boolean[][] dp = new boolean[n][tar+1];
        // base case
        for(int i=0; i<n; i++) dp[i][0] = true;
        if(arr[0] <= tar) dp[0][arr[0]] = true;
        for(int i=1; i<n; i++) {
            for(int j=1; j<=tar; j++) {
                boolean noTake = dp[i-1][j];
                boolean take = (j>=arr[i]) ? dp[i-1][j-arr[i]] : false;
                dp[i][j] = take | noTake;
            }
        }
        return dp[n-1][tar];
    }
}
