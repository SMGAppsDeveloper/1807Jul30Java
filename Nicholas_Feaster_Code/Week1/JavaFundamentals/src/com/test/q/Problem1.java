package com.test.q;

public class Problem1 {
	
	public static void main(String[] args) {
		int someSums = 0;
		int unworth = 0;
		String n0 =  args[0];
		int n = Integer.parseInt(n0);
		for(int i=0;i<n;i++) {
			if(i%5==0) {
				someSums+=i;
			}
			else if (i%3==0) {
				someSums+=i;
			}
			else
				unworth++;
			}
		System.out.println("Sum of the mutltiples of 3 or 5 less than " + n + ": " + someSums);
		System.out.println("Amount of numbers below " + n + " not used: "+ unworth);
	}

}
