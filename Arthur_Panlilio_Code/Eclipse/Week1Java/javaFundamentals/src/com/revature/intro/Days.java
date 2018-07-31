package com.revature.intro;

public enum Days {
	
	MONDAY(1){
		@Override
		public void live() {
			System.out.println("Mondays are long days");
		}
	},
	TUEDAY(2){
		@Override
		public void live() {
			System.out.println("Tequila/Taco tuesday");
		}
	},
	WEDNESDAY(3){
		@Override
		public void live() {
			System.out.println("Wear pink");
		}
	},
	THURSDAY(4){
		@Override
		public void live() {
			System.out.println("YEAH");
		}
	},
	FRIDAY(5){
		@Override
		public void live() {
			System.out.println("WOWO");
		}
	},
	SATURDAY(6){
		@Override
		public void live() {
			System.out.println("ahaha");
		}
	},
	SUNDAY(7){
		@Override
		public void live() {
			System.out.println("OK!");
		}
	};
	
	public abstract void live();
	
	Days(int num){
		
	}

}
