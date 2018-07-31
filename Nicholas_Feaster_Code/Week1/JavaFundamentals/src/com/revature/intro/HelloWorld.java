package com.revature.intro;

import java.util.ArrayList;

/*the first line of any Java class is the package that it is in
 * following the package declaration is any import statements 
 * for resources you may need outside this package
 */
//Ctrl+Shift+o
//[access modifies] [non-access modifiers] class [ className]{}
public class HelloWorld {
	/**@author Student0011
	 * @since 7/30/2018
	 * 
	 * @param args
	 * JavaDocs
	 */
	
	/*
	 * THis is a multi line comment
	 * Acesss Modifiers !
	 * public - any class can access this entity(class,method,variable)
	 * protected - any class in this package or its subclasses can access
	 * __(default/package) - only accessible from package
	 * private - only accessible within the class
	 */
	// This is a comment
	
	//[access modifier] [non access mods] [return type*] [ methodName]([parameters]){}
	public static void main(String[] args) {//main, ctrl+space
		System.out.println("Hello World"); //sysout, ctrl+space
			//ctrl+d-deletes line
		ArrayList<String> list = new ArrayList<String>(); 

	}

}
