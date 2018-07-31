package oopWithCars;

public class Honda extends Cars{
	
	private static String manufacture = "Honda";
	
	/*
	 * How I implemented each OOP concept
	 * Inheritance - The Honda class inherits methods from the Cars class because it is a subclass of cars.
	 * Polymorphism - The is overloading in Honda class because of the constructors one for no parameter calls
	 * and another for user input.
	 * Abstraction - The Cars class is an abstract
	 * Encapsulation - The manufacturer is a private static variable that cannot be changed because all
	 * Honda cars are manufactured by Honda. There are also getter and setter methods to access everything
	 * else because those things can be changed.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//No parameter call to Honda Constructor
		Honda h = new Honda();
		System.out.println(h.getColor());
		System.out.println(h.getManufacturer());

		//Owner repainted car
		h.setColor("Red");
		System.out.println(h.getColor());
		
		//Owner sold car to Jim
		h.setOwner("Jim");
		System.out.println(h.getOwner());
		
		//Jim wanted a faster engine
		h.setEngine("V8");
		System.out.println(h.getEngine());
		
		//Bill buys a new honda
		Honda b = new Honda("V8", "Bill", "Green");
		
		//showing the Overriding of base acceleration from cars class
		System.out.print(b.getAcceleration());
	}
	
	public Honda() {
		this("V6", "Bob", "Blue");
	}
	
	public Honda(String engine, String owner, String color) {
		super();
		this.engine = engine;
		this.owner = owner;
		this.color = color;
	}
	
	@Override
	public String getEngine() {
		// TODO Auto-generated method stub
		return this.engine;
	}

	@Override
	public void setEngine(String newEngine) {
		// TODO Auto-generated method stub
		this.engine = newEngine;
		return;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}

	@Override
	public void setColor(String newColor) {
		// TODO Auto-generated method stub
		this.color = newColor;
		return;
	}
	
	public String getManufacturer() {
		return this.manufacture;
	}

	@Override
	public String getOwner() {
		// TODO Auto-generated method stub
		return this.owner;
	}

	@Override
	public void setOwner(String newOwner) {
		// TODO Auto-generated method stub
		this.owner = newOwner;
	}
	
	//Overrides the base acceleration of every car from 10 seconds to reach 70mph 
	//to 8 seconds for all Honda cars
	@Override
	public int getAcceleration() {
		return 8;
	}
}
