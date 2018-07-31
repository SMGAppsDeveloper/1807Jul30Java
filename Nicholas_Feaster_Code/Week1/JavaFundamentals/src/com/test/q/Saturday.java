package com.test.q;


public class Saturday {
	static int hours = 10;
	
	public static void main(String[] args) {
		do{
			theTimeWarp();
			hours =(int) Math.floor((hours-.8333333));
		}while(hours > 0 ); 

	}
	
	public static void theTimeWarp() {
		System.out.println("You have just watched The Rocky Horror Picture Show. Congrats~");
		System.out.println("You have " + hours + " hours left!");
	}
		

}
