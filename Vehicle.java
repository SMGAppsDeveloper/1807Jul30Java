package com.revature.principles.oop;

import java.util.LinkedList;

public abstract class Vehicle {
	private String driver;
	private  final int passengerCap;
	private LinkedList<String> passengers;
	
	
	Vehicle(int passengerCap){
		this.passengerCap = passengerCap;
		passengers = new LinkedList<String>();
	}
	
	public abstract void drive();
	public abstract void drive(String destination);
	
	public String getDriver() {
		return driver;
	}
	
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public int getMaxPassangers() {
		return passengerCap;
	}
	
	public LinkedList<String> getPassengers() {
		return passengers;
	}
	
	public int getPassengerCount() {
		return passengers.size();
	}
	
	public int getRemainingPassengerSpace() {
		return passengerCap - passengers.size();
	}
}
