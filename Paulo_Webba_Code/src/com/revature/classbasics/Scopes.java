package com.revature.classbasics;

public class Scopes {
	int age;
	String name;
	static int count =0;
	public Scopes() {
		count++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scopes s = new Scopes();
		s.age = 16;
		doThings();
	

	}
	static void doThings() {
		//();
	}
	void test() {
		doThings();
	}

}
