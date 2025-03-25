package DP.Lec3.RodCutting;

public class Recursion {
    private int rodCutting(int cut, int rodLen, int[] cost) {
        if(rodLen == 0) return 0;
        if(cut == 1) {
            return cost[0] * rodLen;
        }
        int notake = rodCutting(cut-1, rodLen, cost);
        int take = (rodLen >= cut) ? cost[cut-1] + rodCutting(cut, rodLen-cut, cost) : 0;
        return Math.max(take, notake);
    }

    public int rodCutting(int[] cost) {
        int n = cost.length;
        return rodCutting(n, n, cost);
    }
}
