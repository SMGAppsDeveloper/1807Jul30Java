package com.revature.microrealm_v2;

public class Avatar extends HumanBluePrint {

	private String role;
	
	public Avatar() {}
	public Avatar(String name, String gender) {
		this.setName(name);
		this.setGender(gender);
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public /*static*/ void role() {
		print("...");
	}
	
}
