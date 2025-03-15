package DP.Lec2.ChocolatesPickup;

public class Main {
    public static void main(String[] args) {
        int matrix[][] = {{2, 3, 1, 2},
                {3, 4, 2, 2},
                {5, 6, 3, 5}};

        Recursion rec = new Recursion();
        int rec_ans = rec.chocolatePickup(matrix);
        System.out.println("Rec: " + rec_ans);

        Memoize memo = new Memoize();
        int memo_ans = memo.chocolatePickup(matrix);
        System.out.println("Memo: " + memo_ans);
    }
}
