package com.Revature.FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a positive number: ");
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}else if(i % 5 == 0) {
				System.out.println("Buzz");
			}else if(i % 3 == 0) {
				System.out.println("Fizz");
			}else {
				System.out.println(i);
			}
		}
	}
}
