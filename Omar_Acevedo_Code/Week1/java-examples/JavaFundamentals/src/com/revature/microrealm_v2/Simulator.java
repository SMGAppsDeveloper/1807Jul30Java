package com.revature.microrealm_v2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Simulator extends Avatar {
	
	public static void main(String[] args) {
		
		String[] preAvatarList = initAvatars(); // or prepare Avatars?
		Avatar[] avatarList = prepareAvatars(preAvatarList);
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
	
	
	private static Avatar[] prepareAvatars(String[] p_preavatars) {
		
		Avatar[] theAvatars = new Avatar[p_preavatars.length];
		
//		HumanBluePrint preAvatar;
	
		for ( int i = 0; i < p_preavatars.length; i++ ) {
				
//			"Initialize" an Avatar with a given name.
			theAvatars[i] = new Avatar(p_preavatars[i]);	
		
		}
		
		return theAvatars;
	}
	
	private static String[] initAvatars() {
		
//		String[] avatarNameList = {"Omar", "Laura", "Billy", "Joel", "Camille", "Salam", "Mee", "Taco", "Tuesday", "Becky", "Baker"};
		String[][] avatarNameList = {"Omar", "Laura", "Billy", "Joel", "Camille", "Salam", "Mee", "Taco", "Tuesday", "Becky", "Baker"};
		String[][] avatarNameList = {"Omar"};
		avatarNameList[0][0] = "Omar";
		avatarNameList[0][1] = "male";
		
//				"Laura", "Billy", "Joel", "Camille", "Salam", "Mee", "Taco", "Tuesday", "Becky", "Baker"};
		// we need to have ["Omar"]["Male"]
		
		
//		Map<String, String> avatarMapList = new HashMap<>();
		Map<Avatar, String> avatarMapList = new HashMap<>();
		Avatar avatar;
//		HumanBluePrint avatar;
		for ( int i = 0; i < avatarNameList.length; i++ ) {
			
			avatar = new Avatar(avatarNameList[i], )
			
			//			avatarMapList.put(key, value)
		}
		
		return avatarNameList;
		
	}
	
}
