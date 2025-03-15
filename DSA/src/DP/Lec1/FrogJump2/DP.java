package DP.Lec1.FrogJump2;

public class DP {

    public int frogJump(int idx, int k, int[] energy) {
        int[] dp = new int[idx+1];
        for(int i=1; i<=idx; i++) {
            int ans = (int) 1e8;
            for (int j = i - 1; j >= 0 && j >= i - k; j--) {
                int cur = Math.abs(energy[i] - energy[j]) + frogJump(j, k, energy);
                ans = Math.min(ans, cur);
            }
            dp[i] = ans;
        }
        return dp[idx];
    }
}
