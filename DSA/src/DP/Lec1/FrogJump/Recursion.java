package DP.Lec1.FrogJump;

public class Recursion {
    public int frogJump(int idx, int[] energy) {
        if(idx == 0) return 0;
        if(idx == 1) return Math.abs(energy[0]-energy[1]);

        // 1-step
        int oldEnergy1 = frogJump(idx-1, energy);
        int curEnergy1 = oldEnergy1 + (Math.abs(energy[idx]-energy[idx-1]));

        // 2-step
        int oldEnergy2 = frogJump(idx-2, energy);
        int curEnergy2 = oldEnergy2 + (Math.abs(energy[idx]-energy[idx-2]));

        return Math.min(curEnergy1, curEnergy2);
    }
}
