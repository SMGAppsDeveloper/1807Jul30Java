package com.revature.classbasics;

public class scopes {
	int age;
	String name;
	static int count;
	
	public scopes() {
		//constuctor..will discuss later
		count ++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num = new Integer(5);
		Integer x = new Integer(159109);
		System.out.println(num.MAX_VALUE==x.MAX_VALUE);
		
		scopes s = new scopes();
		s.age =16;
		doThings();
		
	}
	static void doThings() {
		//test();
	}
}
