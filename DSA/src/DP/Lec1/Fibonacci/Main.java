package DP.Lec1.Fibonacci;

public class Main {
    public static void main(String[] args) {
        Recursive rec = new Recursive();
        int ans_rec = rec.fibo(6);
        System.out.println("Rec: " + ans_rec);

        Memoize memo = new Memoize();
        int ans_memo = memo.fibo(6);
        System.out.println("Memo: " + ans_memo);

        DP dp = new DP();
        int ans_dp = dp.fibo(6);
        System.out.println("DP: " + ans_dp);
    }
}
