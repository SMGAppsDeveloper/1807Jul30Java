package com.revature.videogames;

public class SuperMarioBros extends VideoGame {
	float _cost = 60.00f;
	
	@Override
	public String GetName() {
		// TODO Auto-generated method stub
		return "Super Mario Bros.";
	}

	@Override
	public String GetDeveloper() {
		// TODO Auto-generated method stub
		return "Nintendo";
	}

	@Override
	public float GetCost() {
		// TODO Auto-generated method stub
		return _cost;
	}

	@Override
	public void SetCost(float cost) {
		// TODO Auto-generated method stub
		_cost = cost;
	}

}
