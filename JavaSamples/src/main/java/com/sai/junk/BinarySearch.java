package com.sai.junk;

import java.util.Scanner;

//https://www.youtube.com/watch?v=j5uXyPJ0Pew&index=1&list=PL2_aWCzGMAwL3ldWlrii6YeLszojgH77j

public class BinarySearch {
	
	
	public static void main(String []args){
		
		//int[] a1 = {2, 6, 13, 21,36, 47,63,81,97};
		//int x = 21;
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int v = in.nextInt();
        int[] a1 = new int[n];
        
        for(int a_i=0; a_i < n; a_i++){
            a1[a_i] = in.nextInt();
        }
        in.close();
        
        //int index = search(a1, a1.length, v);
        
        int index = searchR(a1, a1.length, v, 0, a1.length - 1);
		System.out.println("____" + index);
	}
	
	public static int search(int[] a1, int n, int x) {
		
		int start = 0;
		int end = n -1;
		
		while (start <= end ) { //recursive exit condition 
			
			int mid = (start + end)/2; // divide array by half
			
			if (x == a1[mid]){ // element found
				return mid;
			} else if (x < a1[mid]) { //search element on the left
				//start = 0;
				end = mid-1;
			} else if (x > a1[mid]) { //search element on the right
				start = mid +1;
				//end = n -1;
			}
			
		}
		return -1;
	}


public static int searchR(int[] a1, int n, int x, int start, int end) {
		
			if (start > end ) return -1;// exit condition	
	
			int mid = (start + end)/2; // divide array by half
			if (x == a1[mid]){   // element found
				return mid;
			} else if (x < a1[mid]) {
				//start = 0;
				end = mid-1;
				searchR(a1, n, x, start, end); //search element on the left
			} else if (x > a1[mid]) {
				start = mid +1;
				//end = n -1;
				searchR(a1, n, x, start, end); //search element on the right
			}
		return -1;
	}
	
	
	
}
