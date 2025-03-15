package DP.Lec1.HouseRobber;

public class Recursion {
    public int houseRobber(int i, int[] arr) {
        if(i < 0) return 0;
        if(i == 0) return arr[i];
        int take = arr[i] + houseRobber(i-2, arr);
        int notake = houseRobber(i-1, arr);
        return Math.max(take, notake);
    }
}
