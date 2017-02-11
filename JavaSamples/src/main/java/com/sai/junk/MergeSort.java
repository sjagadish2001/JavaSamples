package com.sai.junk;

public class MergeSort {


	public static void main(String []args){

		int []a = { 2, 4, 1, 6, 8, 5, 7, 3};
		MergeSort ms = new MergeSort();
		ms.mergesort(a);


	}


	public void mergesort(int[] a) {
		
		
		
	}
	
	
	
	public void merge(int[] a, int [] left, int[] right) {
		int l = left.length;
		int r = right.length;

		int i =0,j=0,k=0;

		while (i < l && j < r) {

			if (left[i] <= right[j]) {
				a[k] = left[i];
				i = i + 1;
			} else {
				a[k] = right[j];
				j = j + 1;
			}
			k = k + 1;
		}

		while (i < l) {
			a[k] = left[i];
			i=i+1;
			k=k+1;
		}
		while (j < r) {
			a[k] = right[j];
			j = j +1;
			k = k + 1;
		}
	}

}
