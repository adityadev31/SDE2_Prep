package DP.Lec1.HouseRobber;

public class DP {
    public int houseRobber(int idx, int[] arr) {
        int[] dp = new int[idx+1];
        dp[0] = arr[0];
        for(int i=1; i<=idx; i++) {
            int take = arr[i] + ((i-2>=0) ? dp[i-2] : 0);
            int notake = dp[i-1];
            dp[i] = Math.max(take, notake);
        }
        return dp[idx];
    }
}
