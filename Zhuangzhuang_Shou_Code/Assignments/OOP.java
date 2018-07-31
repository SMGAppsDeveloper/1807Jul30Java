package com.revature.assignments;

import java.io.Serializable;

public abstract class OOP implements Serializable //Inheritance
{
	//Encapsulation
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	//Polymorphism
	@Override
	public String toString()
	{
		return Integer.toString(num);
	}
	
	//Abstraction
	public abstract void performAction();
	
	
}
