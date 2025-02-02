package com.kurtulussahin.designpatterns.headfirstdesignpatterns.strategy.fightgame;

public class AxeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Axe attack");
		
	}

}
