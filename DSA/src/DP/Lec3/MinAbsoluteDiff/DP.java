package DP.Lec3.MinAbsoluteDiff;

public class DP {
    //    private boolean targetSum(int[] arr, int tar, int i) {
    //        if(i == 0) return tar == arr[i];
    //        if(tar == 0) return true;
    //        boolean notake = targetSum(arr, tar, i-1);
    //        boolean take = (tar>=arr[i]) ? targetSum(arr, tar-arr[i], i-1) : false;
    //        return take | notake;
    //    }

    private int findSum(int[] arr) {
        int sum = 0;
        for(int i: arr) sum += i;
        return sum;
    }

    public int minAbsoluteDiff(int[] arr) {
        int sum = findSum(arr);
        int tar = sum / 2;

        // ==== target sum ====
        int n = arr.length;
        boolean[][] dp = new boolean[n][tar+1];
        for(int i=0; i<n; i++) dp[i][0] = true;
        if(arr[0] <= tar) dp[0][arr[0]] = true;
        for(int i=1; i<n; i++) {
            for(int j=1; j<=tar; j++) {
                boolean notake = dp[i-1][j];
                boolean take = (j>=arr[i]) ? dp[i-1][j-arr[i]] : false;
                dp[i][j] = take | notake;
            }
        }
        for(int j=tar; j>=0; j--) {
            if(dp[n-1][j] == true) {
                return sum - (2*j);
            }
        }
        return (int) 1e9;
    }
}
