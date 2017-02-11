package com.sai.StringProblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class FindDuplicateCharInString {

	public static void main(String [] args){

		String duplicateChar = " asdkfjl alsdied ";
		findDuplicateCharsInString(duplicateChar);
	}

	public static void  findDuplicateCharsInString(String duplicateChar) {

		
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


}
