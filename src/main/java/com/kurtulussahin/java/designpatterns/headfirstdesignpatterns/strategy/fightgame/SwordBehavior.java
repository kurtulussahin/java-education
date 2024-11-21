package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.strategy.fightgame;

public class SwordBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Sword attack");
		
	}

}
