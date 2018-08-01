package com.revature.datatypes;
import com.revature.helpers.HelperFunctions;

public enum Days {
	MONDAY {
		public void live() {
			System.out.println("Today is Monday");
		}
	},
	TUESDAY {
		public void live() {
			System.out.println("Today is Tuesday");
		}
	},
	WEDNESDAY {
		public void live() {
			System.out.println("Today is Wednesday");
		}
	},
	THURSDAY {
		public void live() {
			System.out.println("Today is Thursday");
		}
	},
	FRIDAY {
		public void live() {
			System.out.println("Today is Friday");
		}
	},
	SATURDAY {
		public void live() {
			System.out.println("Today is Saturday");
		}
	},
	SUNDAY {
		public void live() {
			System.out.println("Today is Sunday");
		}
	};
	
	public abstract void live();
	
}
