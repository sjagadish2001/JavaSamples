package com.sai.Numbers;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int value = findFactorial2(n);
		System.out.println("______"+ value);
	}
	
	public static int findFactorial(int n){
		if(n== 0){
			return 1; 
		}
		return n* findFactorial(n-1);
		
	}
	
	public static int findFactorial2(int n){
		int result =1;
		for (int i = 1; i <= n; i++){
			result = result * i;
		}
		
		return result;
	}
	
	

}
