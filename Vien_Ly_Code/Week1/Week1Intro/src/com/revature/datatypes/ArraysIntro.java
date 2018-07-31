package com.revature.datatypes;

import java.util.Arrays;

public class ArraysIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {9, 2, 1, 3};
		int[] arr = new int[5];
		
		System.out.println(Arrays.toString(nums));
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		System.out.println(add(10, 2, 3, 4, 1, 23));
	
	}

	//var args
	static int add(int... inputs) {
		int sum = 0;
		for (int n : inputs) {
			sum += n;
		}
		
		return sum;
	}
}
