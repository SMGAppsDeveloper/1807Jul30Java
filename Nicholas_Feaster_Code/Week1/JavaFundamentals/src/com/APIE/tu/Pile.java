package com.APIE.tu;

abstract class Pile {
	
void cook(String way) {};
	int height;
	int width;
	String[] ingredients;
}
class candyPile extends Pile{
	public candyPile( int height, int width, String... list) {
		this.height = height;
		this.width = width;
		String[] ingredients = list;
	}
	
	void cook(String way) {
		if (height < 8) {
			String manner = way;
			switch(manner) {
			case "Syrup": System.out.println("Cook at 111 degrees Celsius");
			break;
			case "Fudge": System.out.println("Cook at 114 degrees Celsius");
			break;
			case "Firm": System.out.println("Cook at 119 degrees Celsius");
			break;
			case "Hard": System.out.println("Cook at 125 degrees Celsius");
			break;
			case "Soft": System.out.println("Cook at 137 degrees Celsius");
			break;
			case "Crack": System.out.println("Cook at 151 degrees Celsius");
			break;
			case "Clear": System.out.println("Cook at 160 degrees Celsius");
			break;
			case "Brown": System.out.println("Cook at 170 degrees Celsius");
			break;
			default: System.out.println("Ruined.");
			}
			
		}
		else 
				System.out.println("Spin,spin,spin");
			
	}
	
}

class chocolateStack extends candyPile{

	public chocolateStack(int height, int width, String[] list) {
		super(height, width, list);
		
	}
	void cook(String way) {
			if (height < 8) {
				int count = 0;
				while (height < 11) {
					height = height *2;
					count++;
				}
				System.out.println("Amount of time need to reach optimal cooking height: " + count);
				System.out.println("Tempering performed. Enjoy!");	
			}
			else {
				if(width < 13 ) {
					System.out.println("Tempering performed. Enjoy!");	

				}
				else if(width>13 && width<24) {
					System.out.println("Molding performed. Behold.");
				}
				else {
					System.out.println("Sclupting performed!!! Compliment your chef/artisan and please tip your server!");
				}
					
				
			}
		}
}


	