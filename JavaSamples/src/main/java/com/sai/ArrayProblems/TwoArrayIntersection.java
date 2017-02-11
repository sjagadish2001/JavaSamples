package com.sai.ArrayProblems;

import java.util.HashMap;

public class TwoArrayIntersection {

	public static void main(String [] args){
		int[] a1 = {1, 2, 2, 5};
		int[] a2 = {2,2,4,5};
		findIntersectionOfTwoArrays( a1, a2);
     
	}



	public static void findIntersectionOfTwoArrays(int[] a1, int[] a2) {
		
		HashMap<Integer, Integer> hm = new HashMap();

		for (int i = 0; i < a1.length; i++){
			int ct = 0;
			Integer var = new Integer(a1[i]);
			if (hm.containsKey(var)) {
				Integer val = (Integer)hm.get(var);
				hm.put(var, val=val + 1);
			} else {
				hm.put(a1[i], 1);
			}
		}
		System.out.println("Hello WOrld"+hm);
		for (int j = 0; j < a2.length; j++){
			int ct2 = 0;

			Integer var = new Integer(a2[j]);
			if (hm.containsKey(var)) {
				Integer val = (Integer)hm.get(var);
				hm.put(var, val=val-1);
				System.out.println("__"+a2[j]);//result
			} else {
				hm.put(a2[j], 1);
			}


		}//fore
		System.out.println("Hello WOrld"+hm);

	}
	
}
