package com.sai.junk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class HelloWorld {

	public static void main(String [] args){

		//findIntersectionOfTwoArrays();
        findDuplicateCharsInString();
	}
	
	public static void  findDuplicateCharsInString() {
		
		String duplicateChar = " asdkfjl alsdied ";
		HashMap<String, Integer> hm = new HashMap();
		char [] array = duplicateChar.toCharArray();
		for(int i=0; i< array.length; i++){
			 String s = array[i]+"";
	            if (hm.containsKey(s)) {
	            Integer val = hm.get(s);
	            hm.put(s,val+1);
	            System.out.println("dup:"+array[i]);       
	          } else {
	              hm.put(s,1);
	          }
		}
		
		System.out.println("__"+hm);
		Set set = hm.keySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()){
			
			String key = (String)i.next();
			Integer value = hm.get(key);
			if ( value >1 ) {
				System.out.println("dup:"+key);// duplicate keys
			}
		}
		
	}
	
	
	
	
	public static void findIntersectionOfTwoArrays() {
		int[] a1 = {1, 2, 2, 5};
		int[] a2 = {2,2,4,5};
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
