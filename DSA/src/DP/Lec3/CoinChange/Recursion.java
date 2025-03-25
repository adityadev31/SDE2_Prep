package DP.Lec3.CoinChange;

public class Recursion {
    int MAX = (int)1e8;
    private int minCoins(int i, int tar, int[] arr) {
        if(tar == 0) return 0;
        if(i == 0) {
            if(tar%arr[i] == 0) return tar/arr[i];
            return MAX;
        }
        int notTaken = minCoins(i-1, tar, arr);
        int taken = (tar >= arr[i]) ? 1 + minCoins(i, tar-arr[i], arr) : (int) 1e8;
        return Math.min(taken, notTaken);
    }

    public int minCoins(int[] arr, int tar) {
        return minCoins(arr.length-1, tar, arr);
    }
}
