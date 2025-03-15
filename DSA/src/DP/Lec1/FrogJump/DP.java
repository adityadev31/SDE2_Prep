package DP.Lec1.FrogJump;

public class DP {
    public int frogJump(int idx, int[] energy) {
        int[] dp = new int[idx+1];

        // base case
        if(idx >= 1) {
            dp[1] = Math.abs(energy[0] - energy[1]);
        }

        for(int i=2; i<=idx; i++) {
            // 1-step
            int oldEnergy1 = dp[i-1];
            int curEnergy1 = oldEnergy1 + (Math.abs(energy[i]-energy[i-1]));

            // 2-step
            int oldEnergy2 = dp[i-2];
            int curEnergy2 = oldEnergy2 + (Math.abs(energy[i]-energy[i-2]));

            dp[i] = Math.min(curEnergy1, curEnergy2);
        }

        return dp[idx];

    }
}
