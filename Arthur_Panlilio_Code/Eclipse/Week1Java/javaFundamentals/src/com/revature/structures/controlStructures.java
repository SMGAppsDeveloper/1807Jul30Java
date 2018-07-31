package com.revature.structures;

import java.util.ArrayList;

public class controlStructures {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		ArrayList<donkey> donks = new ArrayList<>();
		for(int i = 0; i < nums.length; i++) {
			
			if(nums[i]==7) {
				break;
			}
			if(nums[i]==4) {
				continue;
			} else {
				System.out.println(nums[i]);
				donks.add(new donkey(nums[i]));
			}
		}
		for(donkey d: donks) {
			switch(d.id) {
				case 1:
					System.out.println("I am the first donkey");
					break;
				case 2:
					System.out.println("And I am the second!");
					break;
				default:
					System.out.println("Donkey: " + d.id);
			}
			if(d.id == 5) {
				System.out.println("I am the fifth Donkey");
			} else if (d.id == 7) {
				System.out.println("I am the seventh donkey");
			} else {
				System.out.println("Hello!");
			}
		System.out.println("---------------------------------------------------------------------");
			
		}
		
		
		System.out.println("========================================================================");
		while(!donks.isEmpty()) {
			System.out.println("Donkey " + donks.get(0).id + " is being terminated");
			donks.remove(0);
		}
		
		
		int counter = 0;
		System.out.println("========================================================================");
		do {
			donks.add(new donkey(counter));
			System.out.println("Adding donkey: " + counter + " to the list.");
			counter++;
		} while(donks.size() < 5);

	}
	
	
	public static class donkey{
		public int id;
		
		donkey(int theId){
			id = theId;
		}
		
	}

}
