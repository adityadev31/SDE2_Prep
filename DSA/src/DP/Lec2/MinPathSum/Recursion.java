package DP.Lec2.MinPathSum;

public class Recursion {
    public int minPathSum(int i, int j, int[][] arr) {
        if(i<0 || j<0) return (int) 1e8;
        if(i == 0 && j == 0) return arr[i][j];
        return arr[i][j] + Math.min(minPathSum(i-1, j, arr), minPathSum(i, j-1, arr));
    }

    public int minPathSum(int[][] arr) {
        int row_idx = arr.length-1;
        int col_idx = arr[0].length-1;
        return minPathSum(row_idx, col_idx, arr);
    }
}
