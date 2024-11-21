package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.strategy.fightgame;

public class ArrowBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Arrow attack");
		
	}

}
