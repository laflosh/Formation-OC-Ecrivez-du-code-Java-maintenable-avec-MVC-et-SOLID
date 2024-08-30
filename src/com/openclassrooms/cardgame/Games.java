package com.openclassrooms.cardgame;

import com.openclassrooms.cardgame.controller.GameController;
import com.openclassrooms.cardgame.games.HighCardGameEvaluator;
import com.openclassrooms.cardgame.games.LowCardGameEvaluator;
import com.openclassrooms.cardgame.model.DeckFactory;
import com.openclassrooms.cardgame.model.DeckFactory.DeckType;
import com.openclassrooms.cardgame.view.CommandLineView;

public class Games {

	public static void main(String[] args) {
		
		//GameController gc = new GameController(new Deck(), new CommandLineView(), new HighCardGameEvaluator());
		GameController gc = new GameController(DeckFactory.makeDeck(DeckType.Normal), new CommandLineView(), new LowCardGameEvaluator());
		
		gc.run();
		
	}
	
}
