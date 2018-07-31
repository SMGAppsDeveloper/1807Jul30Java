package com.revature.intro;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Scanners, wrapper classes, strings, arrays, if/else, operators, excepitons
		 */
		 /* Scanner scan = new Scanner(System.in);
           int n = can.nextInt();*/
		
          String num = args[0];
          
          int n = Integer.parseInt(num);
          
          for(int i=0; i< n; i++) {
        	  if(i % 15 == 0) {
        		  System.out.println("FizzBuzz");
        	  }
        	  else if(i % 5 == 0) {
        		  System.out.println("Buzz");
        	  }
        	  else if ( i % 3== 0) {
        		  System.out.println("Fizz");
        	  }
        	  else {
        		  System.out.println(i);
        	  }
          }
        	  
          }
	}
