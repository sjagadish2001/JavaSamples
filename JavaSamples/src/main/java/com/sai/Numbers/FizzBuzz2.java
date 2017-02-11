package com.sai.Numbers;

public class FizzBuzz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i <= 50; i ++) {

			 if ( i % 15 ==0) {
				System.out.println("FizzBuzz"+i);
			} else if ( i % 5 ==0) {
				System.out.println("Buzz"+i);
			} else if (i%3 == 0) {
				System.out.println("Fizz"+i);
			} else {
				System.out.println(""+i);
			}

		}

	}

}
