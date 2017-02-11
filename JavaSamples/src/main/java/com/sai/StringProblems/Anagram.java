package com.sai.StringProblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Anagram {

	//1. length not equal
	//2. length same, but different character 
	//3. length same, duplicates
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("____"+anagram ("SILEFTN","LISTENN"));
		System.out.println("____"+anagram ("aba","abb"));
		
		System.out.println("____"+anagram("Mother In Law", "Hitler Woman"));
		 
        System.out.println("____"+anagram("keEp", "peeK"));
 
        System.out.println("____"+anagram("SiLeNt CAT", "LisTen AcT"));
 
        System.out.println("____"+anagram("Debit Card", "Bad Credit"));
 
        System.out.println("____"+anagram("School MASTER", "The ClassROOM"));
 
        System.out.println("____"+anagram("DORMITORY", "Dirty Room"));
 
        System.out.println("____"+anagram("ASTRONOMERS", "NO MORE STARS"));
 
        System.out.println("____"+anagram("Toss", "Shot"));
 
        System.out.println("____"+anagram("joy", "enjoy"));


	}

	public static boolean anagram(String s1, String s2){

		if (s1.length() != s2.length()){
			return false;
		}

		s1= s1.toLowerCase();
		s2= s2.toLowerCase();
		char [] ch = s2.toCharArray();
		HashMap<String, Integer> hm = new HashMap();

		for (int i = 0; i < s2.length(); i++) {
			//System.out.println(i+"_"+"__"+ ch[i]);

			String str = ch[i]+"";
			if (hm.get(str) == null){
				hm.put(str, 1);

			}else {
				int val = hm.get(str);
				hm.put(str, val+1);
			}

		}
		
		char[] ch2 = s1.toCharArray();
		for (int i=0; i<s1.length(); i++){
			String str = ch2[i]+"";
			if (hm.get(str) == null){
				hm.put(str, 1);
				return false;// new char 

			}else {
				int val = hm.get(str);
				hm.put(str, val-1);
			}
			
		}
		
		//System.out.println("___"+hm.toString());
		
		Set s = hm.keySet();
		Iterator i = s.iterator();
		while (i.hasNext()){
			String key = (String) i.next();
			if(hm.get(key).intValue() < 0 ){
				return false;
			}
		}
		
		return true;

	}

}
