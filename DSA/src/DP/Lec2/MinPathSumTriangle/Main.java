package DP.Lec2.MinPathSumTriangle;

public class Main {
    public static void main(String[] args) {
        int triangle[][] = {{1},
                {2, 3},
                {3, 6, 7},
                {8, 9, 6, 10}};

        Recursion rec = new Recursion();
        int rec_ans = rec.minPathTriangle(triangle);
        System.out.println("Rec: " + rec_ans);

        Memoize memo = new Memoize();
        int memo_ans = memo.minPathTriangle(triangle);
        System.out.println("Memo: " + memo_ans);

        DP dp = new DP();
        int dp_ans = dp.minPathTriangle(triangle);
        System.out.println("DP: " + dp_ans);
    }
}
