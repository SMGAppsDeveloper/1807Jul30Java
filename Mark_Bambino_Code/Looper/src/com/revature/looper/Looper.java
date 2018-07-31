package com.revature.looper;

import java.util.Random;

class Looper {
	int[] nums;

	public Looper() {
		nums = new int[100];
		Random r = new Random();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(100);
		}
	}

	public void DoStuff() {
		int y = 0;
		do {
			print();
			y++;
		} while (y < 10);

		while (y > 0) {
			y--;
			System.out.println("Decrementing y: " + y);
		}
		System.out.println("I undid your work");
	}

	void print() {
		for (int x : nums) {
			if (x == 0) {
				System.out.println("ZERO!!!");
			} else {
				if (x == 1) {
					System.out.println("ONE!!!");
				} else if (x == 2) {
					System.out.println("TWO!!!");
				} else {
					switch (x) {
					case 3:
						System.out.println("TRES");
						break;
					case 4:
						System.out.println("CUATRO");
						break;
					default:
						System.out.println(x);
						break;
					}
				}
			}
		}
	}
}