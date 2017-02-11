package com.sai.junk;

public class Fibonacci {
    public static long fib(int n) {
        if (n <= 1) return n;
        else return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int N = 7;//Integer.parseInt(args[0]);
        for (int i = 0; i <= N; i++)
            System.out.println(i + ": " + fib(i));
    }

}
