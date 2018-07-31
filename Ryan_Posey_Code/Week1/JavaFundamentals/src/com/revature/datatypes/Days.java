package com.revature.datatypes;

public enum Days {
	
	/* 
	 * A Java enum is a special type used to define collections
	 * of constants. They are special classes.
	 * Enums were added to Java in Java 5.
	 */
	MONDAY {
		public void live() {
			System.out.println("Mondays are long days");
		}
	},
	TUESDAY {
		public void live() {
			System.out.println("Taco Tuesdays");
		}
	},
	WEDNESDAY {
		public void live() {
			System.out.println("Wear Pink");
		}
	},
	THURSDAY {
		public void live() {
			System.out.println("Thursdays");
			
		}
	},
	FRIDAY {
		public void live() {
			System.out.println("Fridays");
			
		}
	},
	SATURDAY {
		public void live() {
			System.out.println("Sleep til 12");
			
		}
	},
	SUNDAY {
		public void live() {
			System.out.println("Go to church. Or not.");
		}
	};
	
	public abstract void live();
}
