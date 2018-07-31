package com.test.q;

//import java.util.ArrayList;

public class Problem2 {

	public static void main(String[] args) {
		int count = 0;
		int count2 = 0;
		int[] quick = {1,2};
		int[] fibonacciNums = new int[50];
		while(quick[1]<10000000) {
			int temp1 = quick[0];
			int temp2 = quick[1];
			int newValue = temp1+temp2;
			fibonacciNums[count] = quick[0];
			count++;
			quick[0]=quick[1];
			quick[1]=newValue;
			/*if (quick [1]<(55+89)) {
				//System.out.println(quick[1]);
			}*/
		
			
			
		}
		int sum = 0;
		//int testForEven;
		//System.out.println(quick[0]);
		//System.out.println(quick[1]);
		System.out.print("The Fibonacci sequence: ");
		for(int it:fibonacciNums) {
			if(it<4000000) {
				if(it%2==0) {
					sum+=it;
				}
			}
			if(it>0) {
				
				System.out.print(it + ", ");
			}
		}
		System.out.println();
		System.out.println("The sum of the even terms in the Fibonacci sequence whose values are less than four million: " + sum);
	}

}
