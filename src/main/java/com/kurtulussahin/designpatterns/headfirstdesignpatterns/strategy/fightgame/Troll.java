package com.kurtulussahin.designpatterns.headfirstdesignpatterns.strategy.fightgame;

public class Troll extends Character {
	
	public Troll() {
		weaponBehavior=new AxeBehavior();
	}
	
	@Override
	void fight() {
		System.out.println("Troll Fight");
		
	}

}
