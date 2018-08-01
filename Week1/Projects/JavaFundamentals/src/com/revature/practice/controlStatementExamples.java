package com.revature.practice;

public class controlStatementExamples {
	// control statement example class (for, for each, while, dowhile, if, else-if, switch)
	
	
	public static void main(String[] args) {
		//"for statement" that counts a certain letter in the string
		
		String str =  "leggo my eggo";
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'g') { //if statements
				count++;
			}
			else //else statement
			{
				count += 0; //I know it's redundant, but just as an example
			}
		}
			System.out.println(count);
			
			
		//for each statement that adds all the integers in the array
		int[] ar = {1,3,4,6,15};
		int sum = 0;
		int sum2 = 0;
		int sum3 = 20;
		
		for (int k : ar) {
			sum += k;
		}
		System.out.println(sum);
		
		//while
		int x = 0;
		while (x < ar.length) {
			sum2 += ar[x];
			x++;
		}
		System.out.println(sum2);
		
		//do while
		do {
			sum3 += 5;
		} while (sum3 < 20);
		System.out.println(sum3);
	
		//switch statements
		int y = 10;
		int w = 0;
		switch (y) {
		case 1: w = 1;
				break;
		case 5: w = 2;
				break;
		case 10: w = 3;
				break;
		}
		System.out.println(w);
	}
	
	
}
