package DP.Lec1.Fibonacci;

import java.util.Arrays;

public class Memoize {
    public int fibo(int num, int[] dp) {
        if(num <= 1) return dp[num] = num;
        if(dp[num] != -1) return dp[num];
        return dp[num] = fibo(num-1) + fibo(num-2);
    }

    public int fibo(int num) {
        int[] dp = new int[num+1];
        Arrays.fill(dp, -1);
        return fibo(num, dp);
    }
}
