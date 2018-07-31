package com.revature.microrealm;
import com.revature.helpers.HelperFunctions;

public abstract class HumanBluePrint extends HelperFunctions /*implements HumanActions*/ {
	
	private String hairColor;
	private String eyesColor;
//	private String noseSize;
//	private String mouthSize;
	private String bodySize;
	private String name;
	
	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	public String getEyesColor() {
		return eyesColor;
	}
	public void setEyesColor(String eyesColor) {
		this.eyesColor = eyesColor;
	}
	public String getBodySize() {
		return bodySize;
	}
	public void setBodySize(String bodySize) {
		this.bodySize = bodySize;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
