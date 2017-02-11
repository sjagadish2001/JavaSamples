package com.sai.StringProblems;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Palindrome p = new Palindrome();
		boolean result = p.isPalindrome("Was it a cat I saw");
		System.out.println("_____" + result);
		
	}
	
	public boolean isPalindrome(String str) {
		
		str = str.replace(" ", "");
		str = str.toLowerCase();
		System.out.println(str);
		char [] ch = str.toCharArray();
		
		int len = str.length();
		int k = len -1;
		boolean flag = true;
		for (int i=0; i< len; i++) { //i start pointer
			if (i == k ) return flag;//middle char.
			if (ch[i] != ch[k]){
				return false; // not a palindrome
			}
			k--;//end pointer
		}
		return false;
	}

}
