package com.kurtulussahin.designpatterns.headfirstdesignpatterns.strategy.fightgame;

public class King extends Character {
	
	public King() {
		weaponBehavior=new SwordBehavior();
	}
	
	@Override
	void fight() {
		System.out.println("King Fight");
		
	}

}
