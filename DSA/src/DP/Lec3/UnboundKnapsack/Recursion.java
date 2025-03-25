package DP.Lec3.UnboundKnapsack;

public class Recursion {
    private int unboundKnapSack(int i, int bag, int[] val, int[] wts) {
        if(bag == 0) return 0;
        if(i == 0) return val[i] * (bag/wts[i]);
        int notake = unboundKnapSack(i-1, bag, val, wts);
        int take = (bag>=wts[i]) ? val[i] + unboundKnapSack(i, bag-wts[i], val, wts) : (int)-1e8;
        return Math.max(take, notake);
    }

    public int unboundKnapSack(int[] val, int[] wts, int bag) {
        int n = val.length;
        return unboundKnapSack(n-1, bag, val, wts);
    }

}
