package com.revature.intro;

public enum Days {
	/*
	 *A Java Enum is a special type used to define 
	 *collections of constants. They are special classes
	 *Enums were added in Java 5.
	 */
	/*MONDAY(1),
	TUESDAY(2),
	WEDNESDAYS(3),
	THURSDAY(4),
	FRIDAY(5),
	SATURDAY(6)
	SUNDAY(7);*/
	MONDAY{
		public void live() {
			System.out.println("Mondays are long days");
		}
	}
	,
	TUESDAY{
		public void live() {
			System.out.println("Tequila/Taco Tuesday");
		}
	}
	,
	WEDNESDAYS{
		public void live() {
			System.out.println("wear pink");
		}
	}
	,
	THURSDAY
 {
		@Override
		public void live(){
			System.out.println("friday eve");
		}
	},
	FRIDAY
 {
		@Override
		public void live() {
			// TODO Auto-generated method stub
			
		}
	},	
	SATURDAY
 {
		@Override
		public void live() {
			// TODO Auto-generated method stub
			
		}
	}	,SUNDAY

 {
		@Override
		public void live() {
			// TODO Auto-generated method stub
			
		}
	};	
	public abstract void live();
}
