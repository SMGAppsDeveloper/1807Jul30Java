package com.revature.datatypes;

import java.util.Arrays;

public class UnderstandingArrays {
public static void main(String[] Args) {
/* an array is a group of variables
 * ele,emts pf am array ,ist ne tje sa,e ty[e
 * e;e,emts are accessed ny am omdex
 * tjhe first element is at the 0th index 
 * find an array's size with arrayName.length
 */
int [] nums= {9,5,2,10};
int [] n = new int[5];
n[10] = 7;
/*int[] wring = new int[];  // in order to initialize
 * an array, we must either explicitly add uts values
 * or specify the size we want to allocate to it
 */
int length = nums.length;
int [][] twoD = new int [4][4];
twoD[0][0] = 'x';

for(int i=0;i<twoD.length;i++) {
	for(int j=0; j<twoD[i].length;j++) {
		System.out.println(twoD[i][j]);
		}
	System.out.println();
	
	}

Arrays.sort(nums);
System.out.println(Arrays.toString(nums));
}

static int add(int...a nums) {
	int sum = 0;
	for (int n:nums) ( sum+=n);
//	return a + b;

}


