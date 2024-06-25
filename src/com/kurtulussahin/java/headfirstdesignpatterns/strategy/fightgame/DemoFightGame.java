package com.kurtulussahin.java.headfirstdesignpatterns.strategy.fightgame;

public class DemoFightGame {

	public static void main(String[] args) {

		Character Character1 = new King();
		Character Character2 = new Queen();
		Character Character3 = new Troll();
		Character Character4 = new Knight();

		Character1.fight();
		Character1.weaponAttack();

		Character2.fight();
		Character2.weaponAttack();

		Character3.fight();
		Character3.weaponAttack();

		Character4.fight();
		Character4.weaponAttack();
		Character4.setWeapon(new ArrowBehavior());
		Character4.weaponAttack();



	}
}
