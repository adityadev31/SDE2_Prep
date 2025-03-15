package DP.Lec2.ChocolatesPickup;

public class Recursion {
    public int chocolatePickup(int i, int j1, int j2, int R, int C, int[][] arr) {
        // Base Cases
        if(i<0 || i>=R || j1<0 || j1>=C || j2<0 || j2>=C) return (int) -1e8;
        if(i == R-1) {
            if(j1 == j2) return arr[i][j1];
            return arr[i][j1] + arr[i][j2];
        }
        int max = (int) -1e8;
        boolean isSamePos = (j1 == j2);
        for(int dj1=-1; dj1<=1; dj1++) {
            for(int dj2=-1; dj2<=1; dj2++) {
                max = Math.max(max, chocolatePickup(i+1, j1+dj1, j2+dj2, R, C, arr));
            }
        }
        if(isSamePos) max = arr[i][j1] + max;
        else max = arr[i][j1] + arr[i][j2] + max;
        return max;
    }

    public int chocolatePickup(int[][] arr) {
        int R = arr.length;
        int C = arr[0].length;
        return chocolatePickup(0,0,C-1,R,C,arr);
    }
}
