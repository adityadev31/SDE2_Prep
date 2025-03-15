package DP.Lec1.ClimbingStairs;

public class Recursion {
    public int climbingStairs(int n) {
        if(n == 0) return 1;
        if(n < 0) return 0;
        return climbingStairs(n-1) + climbingStairs(n-2);
    }
}
