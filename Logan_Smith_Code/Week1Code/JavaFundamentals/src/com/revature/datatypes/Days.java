package com.revature.datatypes;

public enum Days {

	MONDAY {
		@Override
		public void live() {
			System.out.println("Mondays are days");
		}
	},
	TUESDAY {
		@Override
		public void live() {
			System.out.println("Tuesdays are days");
		}
	},
	WEDNESDAY {
		@Override
		public void live() {
			System.out.println("Wednesdays are days");
		}
	},
	THURSDAY {
		public void live() {
			System.out.println("Thursdays are days");
		}
	},
	FRIDAY {
		@Override
		public void live() {
			System.out.println("Fridays are days");
		}
	},
	SATURDAY {
		@Override
		public void live() {
			System.out.println("Saturdays are days");
		}
	},
	SUNDAY {
		@Override
		public void live() {
			System.out.println("Sundays are days");
		}
	};

	public abstract void live();

}
