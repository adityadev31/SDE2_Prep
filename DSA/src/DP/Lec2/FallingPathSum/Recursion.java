package DP.Lec2.FallingPathSum;

public class Recursion {
    public int fallingPathSum(int i, int j, int C, int[][] arr) {
        if(i<0 || j<0 || j>=C) return 0;
        if(i==0) return arr[i][j];
        int up = fallingPathSum(i-1, j, C, arr);
        int upLeft = fallingPathSum(i-1, j-1, C, arr);
        int upRight = fallingPathSum(i-1, j+1, C, arr);
        return arr[i][j] + Math.max(up, Math.max(upLeft, upRight));
    }

    public int fallingPathSum(int[][] arr) {
        int R = arr.length;
        int C = arr[0].length;
        int max = 0;
        for(int j=0; j<C; j++) {
            max = Math.max(max, fallingPathSum(R-1, j, C, arr));
        }
        return max;
    }
}
