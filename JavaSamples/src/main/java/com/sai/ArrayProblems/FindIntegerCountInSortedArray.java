package com.sai.ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;

class FindIntegerCountInSortedArray{

	static int[] a1 = {1, 3, 4, 5, 5, 5 , 9};
	static int value = 5;


	public static void main(String args[]){
		int[] a1 = {1, 3, 4, 5, 5, 5 , 9};
		int value = 5;

		//Integer[] spam = new Integer[] { 1, 2, 3 };
		
        ArrayList<int[]> list = new ArrayList<int[]>();
        
        list.addAll(Arrays.asList(a1));
        int first = list.indexOf(value);
        int last = list.lastIndexOf(value);
        
		int ct = findduplicatecount(a1, value);
		System.out.println("____"+ct);
		System.out.println(first+"__"+ last);
	}

	public static int findduplicatecount(int []a1, int value){
		int count = 0;
		for(int i = 0; i < a1.length; i++){
			if(a1[i]>value) return count;

			if (a1[i] == value) {
				count++;
			}


		}//end for
		return 0;

	}


}