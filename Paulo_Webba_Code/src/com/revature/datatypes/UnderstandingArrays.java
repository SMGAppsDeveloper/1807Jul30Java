package com.revature.datatypes;
import java.util.Arrays;
public class UnderstandingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {9,5,2,10};
		int[] n = new int[5];
		//n[10] = 7;
		
		//int length = nums.length();
		int [][] twoD = new int [2][2];
		twoD[0][0] = 3;
		twoD[0][1] = 1;
		twoD[1][0] = 1;
		twoD[1][1] = 1;
		for(int i=0; i < twoD.length ;i++) {
			for(int j=0; j < twoD[i].length; j++) {
				System.out.print(twoD[i][j]);
			}
			System.out.println(); 
		}
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		//var args
		
		

	}

}
