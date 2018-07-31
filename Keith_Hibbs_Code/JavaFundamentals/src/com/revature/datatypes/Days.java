package com.revature.datatypes;

public enum Days {
MONDAY { public void live() {
	System.out.println("Mondays are long days");}
},
TUESDAY {public void live() {
	System.out.println("Taco Tuesday");}
},
WEDNESDAY
 {
	@Override
	public void live() {
		// TODO Auto-generated method stub
		
	};
},THURSDAY
 {
	@Override
	public void live() {
		// TODO Auto-generated method stub
		
	};
},FRIDAY
 {
	@Override
	public void live() {
		// TODO Auto-generated method stub
		
	};
},SATURDAY
 {
	@Override
	public void live() {
		// TODO Auto-generated method stub
		
	};
},SUNDAY
 {
	@Override
	public void live() {
		// TODO Auto-generated method stub
		
	};
}}

public abstract void live();}