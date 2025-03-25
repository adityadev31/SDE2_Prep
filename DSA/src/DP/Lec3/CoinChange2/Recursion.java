package DP.Lec3.CoinChange2;

public class Recursion {
    private int coinChange(int i, int tar, int[] arr) {
        if(tar == 0) return 1;
        if(i == 0) {
            if(tar%arr[i] == 0) return 1;
            return 0;
        }
        int noTake = coinChange(i-1, tar, arr);
        int take = (tar >= arr[i]) ? coinChange(i, tar-arr[i], arr) : 0;
        return take + noTake;
    }
    public int coinChange(int[] arr, int tar) {
        int n = arr.length;
        return coinChange(n-1, tar, arr);
    }
}
