package com.revature.datatypes;
import com.revature.helpers.HelperFunctions;

public class UnderstatingArrays extends HelperFunctions {

	public static void main(String[] args) {
		
		int[] nums = {9,4,5,3,342,23,423,5,465,4};
		int[] n = new int[5];
		
//		n[10] = 7;
		
		int length = nums.length;
		int[][] twoD = new int[4][4];
//		twoD[0][0] = 'x';
		twoD[0][0] = 0;
		twoD[0][1] = 1;
		twoD[1][0] = 1;
		
		print("Length of twoD -> " + twoD.length);
		print("Length of twoD[0] -> " + twoD[0].length);
		
		for (int i = 0; i < twoD.length; i++ ) {
			
			print("i -> " + i);
			
			for (int j = 0; j < twoD[i].length; i++ ) {
			
				print("j -> " + j);
				
			}
		}
	}
	
}
