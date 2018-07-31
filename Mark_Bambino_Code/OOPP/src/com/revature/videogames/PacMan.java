package com.revature.videogames;

public class PacMan extends VideoGame {
	float _cost = 0;
	
	@Override
	public String GetName() {
		// TODO Auto-generated method stub
		return "Pac-Man";
	}

	@Override
	public String GetDeveloper() {
		// TODO Auto-generated method stub
		return "Namco";
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
