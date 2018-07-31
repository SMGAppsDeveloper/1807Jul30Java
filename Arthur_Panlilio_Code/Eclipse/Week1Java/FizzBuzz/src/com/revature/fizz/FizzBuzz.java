package com.revature.fizz;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  
		System.out.println("Enter a number: ");
		int n = reader.nextInt(); 
		reader.close();
		fizzBuzz(n);

	}
	
	public static void fizzBuzz(int n) {
		for (int i = 1; i < n; i++) {
			StringBuilder s = new StringBuilder();
			if((i%3)==0) {
				s.append("Fizz");
			}
			if((i%5)==0) {
				s.append("Buzz");
			}
			if(s.length() == 0){
				s.append(i);
			}
			System.out.println(s.toString());
		}
	}

}
