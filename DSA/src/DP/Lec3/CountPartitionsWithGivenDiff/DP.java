package DP.Lec3.CountPartitionsWithGivenDiff;

public class DP {
    private int findSum(int[] arr) {
        int sum = 0;
        for(int i: arr) sum += i;
        return sum;
    }

    private int targetSum(int[] arr, int tar) {
        int n = arr.length;
        int[][] dp = new int[n][tar + 1];
        if(arr[0] == 0) dp[0][0] = 2;
        else dp[0][0] = 1;
        if(arr[0] != 0 && arr[0] <= tar) dp[0][arr[0]] = 1;

        for(int i=1; i<n; i++) {
            for(int j=0; j<=tar; j++) {
                int notake = dp[i-1][j];
                int take = (j>=arr[i]) ? dp[i-1][j-arr[i]] : 0;
                dp[i][j] = take + notake;
            }
        }
        return dp[n-1][tar];
    }

    public int countPartitionWays(int[] arr, int diff) {
        int total = findSum(arr);
        if((total + diff) % 2 != 0) return 0;
        int tar = (total + diff) / 2;
        int n = arr.length;
        return targetSum(arr, tar);
    }
}
