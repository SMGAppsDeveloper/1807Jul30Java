package com.revature.microrealm_v2;
import com.revature.helpers.HelperFunctions;

public abstract class HumanBluePrint extends HelperFunctions implements HumanActions {
	
	private String hairColor;
	private String eyesColor;
//	private String noseSize;
//	private String mouthSize;
	private String bodySize;
	private String name;
	private String gender;
	
//	Accessors and Mutators ( getters and setters )
	public String getHairColor() { return hairColor; }
	public void setHairColor(String hairColor) { this.hairColor = hairColor; }
	public String getEyesColor() { return eyesColor; }
	public void setEyesColor(String eyesColor) { this.eyesColor = eyesColor; }
	public String getBodySize() { return bodySize; }
	public void setBodySize(String bodySize) { this.bodySize = bodySize; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getGender() { return gender; }
	public void setGender(String gender) { this.gender = gender; }
	
	
// 	Implement Human Actions
	public void talks() {
		print("\t    The avatar " + this.getName() + " talks.");
	}
	
	public void walk() {
		print("\t    The avatar " + this.getName() + " walks.");
	}
	
	public void run() {
		print("\t    The avatar " + this.getName() + " run.");
	}
	
	public void sneeze() {
		print("\t    The avatar " + this.getName() + " sneezes.");
	}
	
	public void salute() {
		print("\t    The avatar " + this.getName() + " salute.");
	}
	
	public void sleep() {
		print("\t    The avatar " + this.getName() + " sleep.");
	}
	
	public void wakeUp() {
		print("\t    The avatar " + this.getName() + " wakes up.");
	}
	
	
	
}
