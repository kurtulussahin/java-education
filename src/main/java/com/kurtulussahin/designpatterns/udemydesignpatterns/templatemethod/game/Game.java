package com.kurtulussahin.designpatterns.udemydesignpatterns.templatemethod.game;

public abstract class Game {
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();

	//template method
	public final void play(){

		//initialize the game
		initialize();

		//start game
		startPlay();

		//end game
		endPlay();
	}
}
