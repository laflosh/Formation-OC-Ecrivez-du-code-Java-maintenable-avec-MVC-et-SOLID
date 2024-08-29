package com.openclassrooms.cardgame.view;

import com.openclassrooms.cardgame.controller.GameController;

public interface GameViewable {

	public void setController(GameController gc);
	
	public void promptForPlayerName();
	
	public void promptForFlip();
	
	public void promptForNewGame();
	    
	public void showPlayerName(int playerIndex, String playerName);
	
	public void showFaceDownCardForPlayer(int playerIndex, String playerName);
	
	public void showCardForPlayer(int playerIndex, String playerName, String rank, String suit);
	
	public void showWinner (String playerName);
	
}
