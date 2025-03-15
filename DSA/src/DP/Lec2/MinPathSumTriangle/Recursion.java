package DP.Lec2.MinPathSumTriangle;

public class Recursion {
    public int minPathTriangle(int i, int j, int[][] arr) {
        if(i<0 || j<0 || j>i) return (int) 1e8;
        if(i == 0 && j == 0) return arr[i][j];
        return arr[i][j] + Math.min(minPathTriangle(i-1, j, arr), minPathTriangle(i-1, j-1, arr));
    }

    public int minPathTriangle(int[][] arr) {
        int R = arr.length;
        int C = arr[0].length;
        int min = (int) 1e8;
        for(int j=0; j<C; j++) {
            min = Math.min(min, minPathTriangle(R-1, j, arr));
        }
        return min;
    }
}
