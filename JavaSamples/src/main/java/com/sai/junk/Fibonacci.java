package com.sai.junk;

public class Fibonacci {

	public static void main(String[] args){
		int n = 7;
		printFibonacci(n);
	}
	
	
	public static void printFibonacci(int n) {
		
		int f = 0;
		for (int i = 1; i <= n; i++) {
			f = f + i;
			System.out.println("__" + f);
		}
		
		
	}
	
	
}
