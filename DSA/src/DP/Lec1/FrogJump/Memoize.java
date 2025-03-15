package DP.Lec1.FrogJump;

import java.util.Arrays;

public class Memoize {
    public int frogJump(int idx, int[] energy, int[] dp) {
        if(idx == 0) return dp[idx] = 0;
        if(idx == 1) return dp[idx] = Math.abs(energy[0]-energy[1]);

        if(dp[idx] != -1) return dp[idx];

        // 1-step
        int oldEnergy1 = frogJump(idx-1, energy);
        int curEnergy1 = oldEnergy1 + (Math.abs(energy[idx]-energy[idx-1]));

        // 2-step
        int oldEnergy2 = frogJump(idx-2, energy);
        int curEnergy2 = oldEnergy2 + (Math.abs(energy[idx]-energy[idx-2]));

        return dp[idx] = Math.min(curEnergy1, curEnergy2);
    }

    public int frogJump(int idx, int[] energy) {
        int[] dp = new int[idx+1];
        Arrays.fill(dp, -1);
        return frogJump(idx, energy, dp);
    }
}
