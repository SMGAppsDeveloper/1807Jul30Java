package com.revature.videogames;

public abstract class VideoGame {
	public abstract String GetName();
	public abstract String GetDeveloper();
	public abstract float GetCost();
	public abstract void SetCost(float cost);
	public void PrintData() {
		System.out.println("-------------------------------------");
		System.out.println("Name: " + GetName());
		System.out.println("Developer: " + GetDeveloper());
		System.out.println("Price: " + GetCost());
		System.out.println("-------------------------------------");
	}
}
