package DP.Lec1.FrogJump2;

public class Recursion {
    public int frogJump(int i, int k, int[] energy) {
        if(i == 0) return 0;
        int ans = (int) 1e8;
        for(int j=i-1; j>=0&&j>=i-k; j--) {
            int cur = Math.abs(energy[i]-energy[j]) + frogJump(j, k, energy);
            ans = Math.min(ans, cur);
        }
        return ans;
    }
}
