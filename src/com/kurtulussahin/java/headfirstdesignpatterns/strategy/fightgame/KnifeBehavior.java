package com.kurtulussahin.java.headfirstdesignpatterns.strategy.fightgame;

public class KnifeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Knife attack");
		
	}

}
