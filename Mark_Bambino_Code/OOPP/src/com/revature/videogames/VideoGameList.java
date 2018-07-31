package com.revature.videogames;

public class VideoGameList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VideoGame[] listOfGames = new VideoGame[3];
		listOfGames[0] = new SuperMarioBros();
		listOfGames[1] = new SonicTheHedgehog();
		listOfGames[2] = new PacMan();
		
		//print games
		for(VideoGame i:listOfGames) {
			i.PrintData();
		}
		//reduce price of games
		for(VideoGame i:listOfGames) {
			i.SetCost(i.GetCost() / 2);
		}
		//print again after sale
		for(VideoGame i:listOfGames) {
			i.PrintData();
		}
	}

}
