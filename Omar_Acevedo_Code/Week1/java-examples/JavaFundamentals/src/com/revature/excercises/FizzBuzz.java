package com.revature.excercises;
import java.util.Scanner;

/**
 * FizzBuzz
 * 	It should take in a number n, and print out the numbers 1-n. 
 * 	However instead of any multiple of 3, print “Fizz”. 
 * 	Any multiple of 5, “Buzz”. 
 * 	And any multiple of both 3 and 5, “FizzBuzz”
 * 
 * 	You can either take input from a scanner or an argument into your main method
 * 
 * @author omaracevedoacevedo
 */


public class FizzBuzz {

	public static void main(String[] args) {
		
		Scanner scanFromUser = new Scanner(System.in);
		int n = scanFromUser.nextInt();
		
		for ( int i = 1; i <= n; i++ ) {
			
			if (!( i % 3 == 0 )) {			// instead of any multiple of 3, print “Fizz”. 		
				System.out.println(i + " -> Fizz");
				
			}
			if ( i % 5 == 0) {				// Any multiple of 5, “Buzz”.
				System.out.println(i + " -> Buzz");
				
			}
			if ( i % 15 == 0 ) {			// And any multiple of both 3 and 5, “FizzBuzz”
				System.out.println(i + " -> FizzBuzz");
			}

		}
		
	}

}
