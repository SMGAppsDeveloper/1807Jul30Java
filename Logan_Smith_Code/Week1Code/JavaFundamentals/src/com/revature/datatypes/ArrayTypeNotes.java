package com.revature.datatypes;

import java.util.*;

public class ArrayTypeNotes {

	public static void main(String args[]) {
		int[] nums = {9, 5, 1, 0};
		int[] n = new int [5];
		n[2] = 5;
		
		int length = nums.length;
		int[][] twoD = new int[4][4];
		twoD[0][0] = 0;
		twoD[0][1] = 1;
		twoD[1][0] = 1;
		twoD[1][1] = 1;
		
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++) {
				System.out.print(twoD[i][j]);
			}
			System.out.println();
		}
		System.out.println(add(20,10,15));
	}
			//var args
			static int add(int... nums) {
				int sum = 0;
				for (int n:nums) {
					sum+=n;
				}
				return sum;
			}
	
}
