package com.sai.Numbers;

/*
 * An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself.
 *  For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
 * */
public class NumberIsArmstrong {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberIsArmstrong na = new NumberIsArmstrong();
		System.out.println("--"+na.isArmstrong(370));;
		System.out.println("--"+na.isArmstrong(371));
		System.out.println("--"+na.isArmstrong(153));
		System.out.println("--"+na.isArmstrong(1531));
		
		//list first 100 Armstrong num
		for (int i = 1; i <=10000; i++){
			if (na.isArmstrong(i)){
				System.out.println(i+"---"+ na.isArmstrong(i));
			}
		}
		
	}
	
	public boolean isArmstrong(int num) {
		
		long value =0; 
		
		String str =  String.valueOf(num);
		char[] inArray = str.toCharArray();
		
		for(char a:inArray){
			String t = Character.toString(a);
			long tmp = findCube(new Integer(t));
			value = value + tmp;
		}
		
		if (value == num) {
			return true;
		}
		return false;
	}
	
	
	private long findCube(int num) {
		//System.out.println("__"+num);
		return num*num*num;
	}

}
