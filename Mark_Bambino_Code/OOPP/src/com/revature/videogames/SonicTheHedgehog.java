package com.revature.videogames;

public class SonicTheHedgehog extends VideoGame {
	float _cost = 40.00f;
	
	@Override
	public String GetName() {
		// TODO Auto-generated method stub
		return "Sonic The Hedgehog";
	}

	@Override
	public String GetDeveloper() {
		// TODO Auto-generated method stub
		return "SEGA";
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
