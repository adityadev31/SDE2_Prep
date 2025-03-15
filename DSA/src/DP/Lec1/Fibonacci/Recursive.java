package DP.Lec1.Fibonacci;

public class Recursive {
    public int fibo(int num) {
        if(num <= 1) return num;
        return fibo(num-1) + fibo(num-2);
    }
}
