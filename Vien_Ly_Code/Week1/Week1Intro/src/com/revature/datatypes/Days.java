package com.revature.datatypes;

public enum Days {
	MONDAY {
		public void live() {
			System.out.println("Mondays are long");
		}
	},
	TUESDAY {
		@Override
		public void live() {
			// TODO Auto-generated method stub
			
		}
	},	
	WEDNESDAY {
		@Override
		public void live() {
			// TODO Auto-generated method stub
			
		}
	};
	
	public abstract void live();
}

