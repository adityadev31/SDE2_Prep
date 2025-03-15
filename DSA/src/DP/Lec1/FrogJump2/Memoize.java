package DP.Lec1.FrogJump2;

import java.util.Arrays;

public class Memoize {
    public int frogJump(int i, int k, int[] energy, int[] dp) {
        if(i == 0) return dp[i] = 0;
        if(dp[i] != -1) return dp[i];
        int ans = (int) 1e8;
        for(int j=i-1; j>=0&&j>=i-k; j--) {
            int cur = Math.abs(energy[i]-energy[j]) + frogJump(j, k, energy);
            ans = Math.min(ans, cur);
        }
        return dp[i] = ans;
    }

    public int frogJump(int i, int k, int[] energy) {
        int[] dp = new int[i+1];
        Arrays.fill(dp, -1);
        return frogJump(i, k, energy, dp);
    }
}
