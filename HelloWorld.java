package com.revature.intro;

import java.util.ArrayList;

// The first line of any Java class is the package that it is in
// Following the package declaration is any import statements for resources you may need outside this package

//[access modifier] [non-access modifiers] class [className] {}
//public - any class can access this entity
//protected - any class in this package OR its subclasses can access
//__ (default/package) - only accessible from package
//private - only accessible within the class 
public class HelloWorld {

	//[access modifier] [non-access modifiers] [return type*] [methodName]([parameters])]
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		ArrayList<String> list = new ArrayList<String>();
		//ctrl+shift+O adds imports automatically
	}

}
