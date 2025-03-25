package DP.Lec3.EqualPartitionSubsetSum;

public class Recursion {
    public int findSum(int[] arr) {
        int sum = 0;
        for(int i: arr) sum += i;
        return sum;
    }

    private boolean subsetSum(int i, int[] arr, int tar) {
        if(i == 0) return arr[0] == tar;
        if(tar == 0) return true;
        boolean notake = subsetSum(i-1, arr, tar);
        boolean take = (tar >= arr[i]) ? subsetSum(i-1, arr, tar-arr[i]) : false;
        return take | notake;
    }

    public boolean equalPartition(int[] arr) {
        int sum = findSum(arr);
        int n = arr.length;
        if(sum % 2 != 0) return false;
        return subsetSum(n-1, arr, sum/2);
    }
}
