package DP.Lec3.CountSubsetsSumK;

public class Recursion {
    public int countSubset(int i, int[] arr, int tar) {
        if(i == 0) {
            if(tar == 0 && arr[i] == 0) return 2;     // target = 0 and arr[0] = 0 => 2
            if(tar == 0 || tar == arr[0]) return 1;   // target = 0 || tar == arr[0] => 1
            return 0;
        }
        int notake = countSubset(i-1, arr, tar);
        int take = (tar >= arr[i]) ? countSubset(i-1, arr, tar-arr[i]) : 0;
        return take + notake;
    }
}
