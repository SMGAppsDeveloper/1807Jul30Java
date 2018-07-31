package com.revature.exercises;
import java.util.Random;
public class TuesdayExercises {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		Random r = new Random();
		//loops
		//for
		int count = 0;
		for (int i = 0; i < 10; i++) {
			arr[i] = r.nextInt(11);
			count++;
		}
		
		//foreach
		for (int i : arr) {
			System.out.println(i);
		}
		
		while (count > 0) {
			System.out.println(count--);
		}
		
		do {
			System.out.println(count++);
		} while (count < 10);
	
		int x = 20;
		test(x);
		System.out.println(x);
		
		
	}
	
	public static void test(int x) {
		for (;x < 30; x++) {
			System.out.println("looping");
		}
	}

}
