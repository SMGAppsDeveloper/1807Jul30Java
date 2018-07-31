package com.revature.classbasics;
import java.util.*;

public class Athelete {
	  private String name; 
      private int weight;
      private String team;
      protected static int numberOfatheletes = 0;

  public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getTeam() {
		return team;
	}



static Scanner AtheleteInput = new Scanner(System.in);
public Athelete() {
	numberOfatheletes++;
	
   System.out.println("The best Atheletes");
   System.out.println("Enter name of the player: \n");
    if(AtheleteInput.hasNextLine()) {
    	this.setName(AtheleteInput.nextLine());
    }
    System.out.println("Enter name of the team: \n");
    if(AtheleteInput.hasNextLine()) {
    	this.setTeam(AtheleteInput.nextLine());
    }
    System.out.println("Enter player weight: \n");
    if(AtheleteInput.hasNextLine()) {
    	this.setWeight(AtheleteInput.nextInt());
    }
    
	
} 
public void setTeam(String team) {

        this.team = team;
         
        System.out.println("The new Team is: " + this.team);
    }
public String celebration(){
	
    return "YAY!!! We did it! \n";
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
     Athelete player = new Athelete();
     System.out.println("The player is " + player.getName() + " who weighs " + player.getWeight()
     + " pounds and plays for the " + player.getTeam());
    
     Athelete mbappe = new Ronaldo();
     Athelete benSimmons = new LeBron();
     
     System.out.println("Mbappe celebrates like Ronaldo like " + mbappe.celebration());
 
     System.out.println("Ben Simmons celebrates like LeBron like " + benSimmons.celebration());

     
}
  
}
