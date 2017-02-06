package com.sai.junk;

public class CountOccurrencesBS {
	
public static void main(String []args){
		
		int[] a1 = {2, 6, 13, 21,21, 21, 21,21, 36, 47,63,81,97};
		int v = 21;
		
		/*Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int v = in.nextInt();
        int[] a1 = new int[n];
        
        for(int a_i=0; a_i < n; a_i++){
            a1[a_i] = in.nextInt();
        }
        in.close();*/
        
        //int index = searchFirst(a1, a1.length, v);
        int first = searchFirst(a1, a1.length, v);
        int last = searchLast(a1, a1.length, v);
        //int index = searchR(a1, a1.length, v, 0, a1.length - 1);
		System.out.println("____" + first +"__"+ last+":" + (last-first + 1));
	}
	
	public static int searchFirst(int[] a1, int n, int x) {
		
		int start = 0;
		int end = n -1;
		int index = -1;
		
		while (start <= end ) { //recursive exit condition 
			int mid = (start + end)/2; // divide array by half
			if (x == a1[mid]){ // element found
				index = mid;
				end = mid -1; //search for First occurrence
			} else if (x < a1[mid]) { //search element on the left
				end = mid-1;
			} else if (x > a1[mid]) { //search element on the right
				start = mid +1;
			}
			
		}
		return index;
	}
	
	public static int searchLast(int[] a1, int n, int x) {
		
		int start = 0;
		int end = n -1;
		int index = -1;
		while (start <= end ) { //recursive exit condition 
			
			int mid = (start + end)/2; // divide array by half
			
			if (x == a1[mid]){ // element found
				index = mid;
				start = mid + 1; //search for First occurrence   
				
			} else if (x < a1[mid]) { //search element on the left
				//start = 0;
				end = mid-1;
			} else if (x > a1[mid]) { //search element on the right
				start = mid +1;
				//end = n -1;
			}
			
		}
		return index;
	}
	
}
