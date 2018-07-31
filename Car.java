package com.revature.principles.oop;

public class Car extends Vehicle{
	private final String make;
	private final String model;
	
	
	Car(String make, String model){this(make, model, 3);}
	Car(String make, String model, int passengerCap) {
		super(passengerCap);
		this.make = make;
		this.model = model;
	}

	public String getMakeAndModel() {
		return make + model;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drive(String destination) {
		// TODO Auto-generated method stub
		
	}
	
}
