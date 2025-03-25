package DP.Lec3.SubsetSum;

public class Recursion {
    public boolean subsetSum(int idx, int[] arr, int tar) {
        if(tar == 0) return true;
        if(idx == 0) return arr[idx] == tar;
        boolean noTake = subsetSum(idx-1, arr, tar);
        boolean take = (tar>=arr[idx]) ? subsetSum(idx-1, arr, tar-arr[idx]) : false;
        return take || noTake;
    }

    public boolean subsetSum(int[] arr, int tar) {
        int n = arr.length;
        return subsetSum(n-1, arr, tar);
    }
}
