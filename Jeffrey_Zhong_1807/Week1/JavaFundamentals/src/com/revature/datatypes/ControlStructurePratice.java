package com.revature.datatypes;

public class ControlStructurePratice {

	public static void main(String[] args) {
		loops();
	}

	public static void loops() {

		int[] intarray = { 1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 7 };
		int sum = 0;
		for (int a : intarray) {
			sum = a + sum;
		}
		System.out.println(sum);

		int month = 12;
		String monthString;
		switch (month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";
			break;
		case 11:
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;

		default:
			monthString = "Invalid month";
			break;
		}
		System.out.println(monthString);

	}

	public void ifpractice(int i) {
		if(i < 0) {
			System.out.println("less than 0");
		}
		else if (i >0) {
			System.out.println("greater than 0");

		}
		else {
			System.out.println("equals than 0");
		}
	}
		
		
	public void doWhilePractice() {
		int c = 0;
		do { c++;
		}
		while(c<10);
	}
		

		
	

	public void forloop(int i) {
		for (int a = i; a < 10; a++) {
			if (a == 5) {
				System.out.println(a);
				break;
			}

		}
	}

	public void whileprac(int i) {
		int a = 0;
		while (a < i) {
			System.out.println("Gonna be shown this many times");
			a++;
		}
	}
}


