package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.strategy.fightgame;

public class Queen extends Character {
	
	public Queen() {
		weaponBehavior=new KnifeBehavior();
	}
	
	@Override
	void fight() {
		System.out.println("Queen Fight");
		
	}

}
