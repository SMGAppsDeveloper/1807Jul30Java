package com.revature.microrealm;


public class Avatar extends HumanBluePrint implements HumanActions {
	
	public Avatar() {}
	public Avatar(String name) {
		this.setName(name);
	}
	
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
