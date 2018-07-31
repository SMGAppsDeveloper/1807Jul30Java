package com.revature.datatypes;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {

		fizzBuzz();
		long longnum = 10000000000000000l;
	}

	public static void fizzBuzz()

	{

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}
	}

}
