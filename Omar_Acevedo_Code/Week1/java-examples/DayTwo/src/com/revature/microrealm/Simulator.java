package com.revature.microrealm;
import java.util.Scanner;

public class Simulator extends Avatar {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] preAvatarList = prepareSimulation(); // or prepare Avatars?
		Avatar[] avatarList = initAvatars(preAvatarList);
		runSimulation(avatarList);
		
	}
	
	private static void runSimulation(Avatar[] p_allAvatars) {
		
		int iter = 0;
		for (Avatar avatar : p_allAvatars) {
			
			print("Info about Avatar " + avatar.getName() + " -> ");
			print("\tLocation in realm: "+ avatar.getClass());
			print("\tActions it can do:");
			
			avatar.talks();
			avatar.walk();
			avatar.run();
			avatar.sneeze();
			avatar.salute();
			avatar.sleep();
			avatar.wakeUp();
			
			print("------------------------------------------------------------");
			
		}
		
//		Avatar avatar1 = new Avatar("Omar");
//		avatar1.talks();
//		Scanner t = new Scanner(null);
		
	}
	
	
	private static Avatar[] initAvatars(String[] p_preavatars) {
		
		Avatar[] theAvatars = new Avatar[p_preavatars.length];
		
//		HumanBluePrint preAvatar;
	
		for ( int i = 0; i < p_preavatars.length; i++ ) {
				
//			"Initialize" an Avatar with a given name.
			theAvatars[i] = new Avatar(p_preavatars[i]);	
		
		}
		
		return theAvatars;
	}
	
	private static String[] prepareSimulation() {
		
		String[] avatarList = {"Omar", "Laura", "Billy", "Joel", "Camille", "Guile", "Taco", "Becky", "Baker"};
		return avatarList;
	}
	
}
