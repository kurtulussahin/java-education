package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.strategy.fightgame;

public class Knight extends Character {
	
	public Knight() {
		weaponBehavior=new SwordBehavior();
	}
	
	@Override
	void fight() {
		System.out.println("Knight Fight");
		
	}

}
