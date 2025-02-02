package com.kurtulussahin.designpatterns.headfirstdesignpatterns.strategy.fightgame;

public abstract class Character {
	WeaponBehavior weaponBehavior;
	abstract void fight();
	
	public void weaponAttack() {
		weaponBehavior.useWeapon();
	}

	public void setWeapon(WeaponBehavior weaponBehavior) {
		this.weaponBehavior=weaponBehavior;
	}
	
}
