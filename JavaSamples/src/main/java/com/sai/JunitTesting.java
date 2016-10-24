package com.sai;

public class JunitTesting {
	
	public int square(int x){
		return x*x;
	}
	
	public int countNoOfAs(String str) {
		int count = 0;
		for (int i = 0; i< str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
				count ++;
			}
		}
		return count;
	}
	
}
