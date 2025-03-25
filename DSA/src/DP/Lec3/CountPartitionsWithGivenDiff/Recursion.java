package DP.Lec3.CountPartitionsWithGivenDiff;

public class Recursion {
    private int findSum(int[] arr) {
        int sum = 0;
        for(int i: arr) sum += i;
        return sum;
    }

    private int targetSum(int i, int tar, int[] arr) {
        if(i == 0) {
            if(tar == 0 && arr[0] == 0) return 2;
            if(tar == 0 || tar == arr[0]) return 1;
            return 0;
        }
        int noTake = targetSum(i-1, tar, arr);
        int take = (tar>=arr[i]) ? targetSum(i-1, tar-arr[i], arr) : 0;
        return take + noTake;
    }

    public int countPartitionWays(int[] arr, int diff) {
        int total = findSum(arr);
        if((total + diff)%2!=0) return 0;
        int tar = (total + diff) / 2;
        return targetSum(arr.length-1, tar, arr);
    }
}
