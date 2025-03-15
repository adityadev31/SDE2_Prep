package DP.Lec2.GridUniquePaths2;

public class Recursion {
    public int uniquePaths(int i, int j, int[][] arr) {
        if(i<0 || j<0 || arr[i][j] == -1) return 0;
        if(i == 0 && j == 0) return 1;
        return uniquePaths(i-1, j, arr) + uniquePaths(i, j-1, arr);
    }
}
