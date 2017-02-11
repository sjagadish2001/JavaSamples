package com.sai.StringProblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class FirstNonRepeatedCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("___" + printFirstNonRepeatedCharInString("concur"));
		System.out.println("___" + printFirstNonRepeatedCharInString("stress"));
		System.out.println("___" + printFirstNonRepeatedCharInString("teeter"));
	}
	
	
	public static char printFirstNonRepeatedCharInString(String str) {
		
		char [] ch = str.toLowerCase().toCharArray();
		
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap();
		
		
		for (int i = 0; i < ch.length; i ++) {
			
			if(hm.containsKey(ch[i])) {
				int value = hm.get(ch[i]);
				hm.put(ch[i], value + 1);
			} else {
				hm.put(ch[i], 1);
			}
			
		}
		System.out.println("__" + hm.toString());
		
		
		//
		Set<Character> s = hm.keySet();
		Iterator i = s.iterator();
		while (i.hasNext()) {
			char chr = (Character) i.next();
			if (hm.get(chr).intValue() == 1) {
				return chr;
			}
			
		}
		
		
		
		return ' ';
	}

}
