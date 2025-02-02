package com.kurtulussahin.designpatterns.udemydesignpatterns.templatemethod.game;

public class GameDemo {
	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();		
	}
}