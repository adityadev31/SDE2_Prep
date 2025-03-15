package DP.Lec2.GridUniquePaths;

public class Recursion {
    public int uniquePaths(int i, int j) {
        if(i == 0 || j == 0) return 1;
        return uniquePaths(i-1, j) + uniquePaths(i, j-1);
    }
}
