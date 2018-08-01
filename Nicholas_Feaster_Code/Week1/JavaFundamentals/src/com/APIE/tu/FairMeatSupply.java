package com.APIE.tu;

public class FairMeatSupply extends Pile {
	
	private int weight;
	private int height;
	private int width;
	private int daysUntilExpiration;
	public String[] ingredients;
	

	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		if(weight>=0) {
		this.weight = weight;
	}
	}
		


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		if(height>=0) {
		this.height = height;
		}
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		if(width>=0) {
		this.width = width;
		}
		}


	public int getDaysUntilExpiration() {
		return daysUntilExpiration;
	}


	public void setDaysUntilExpiration(int daysUntilExpiration) {
		if(daysUntilExpiration>=0) {
		this.daysUntilExpiration = daysUntilExpiration;
		}
		}


	public String[] getIngredients() {
		return ingredients;
	}


	public void setIngredients(String[] ingredients) {
		this.ingredients = ingredients;
	}

	void Cook(String way) {
		if (way.equals("roasted")) {
			System.out.println("Roasted to perfection!");
		}
		else if(way.equals("grilled")){
			System.out.println("Flame grilled and ready to eat!");
		}
		else
			System.out.println("You're at a fair but you seem to be having some trouble.Please ask someone for assistance.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
