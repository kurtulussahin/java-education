package com.kurtulussahin.java.headfirstdesignpatterns.strategy.fightgame;

public class Troll extends Character {
	
	public Troll() {
		weaponBehavior=new AxeBehavior();
	}
	
	@Override
	void fight() {
		System.out.println("Troll Fight");
		
	}

}
