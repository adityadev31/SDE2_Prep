package DP.Lec1.Fibonacci;

public class DP {
    public int fibo(int num) {
        int[] dp = new int[num+1];
        dp[1] = 1;
        for(int i=2; i<=num; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[num];
    }
}
