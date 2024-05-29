package com.kurtulussahin.java.temeller.classobject.footballplayer;

public class FootballPlayerTest {

	public static void main(String[] args) {
		
		FootballPlayer alex = new FootballPlayer();
		alex.no=10;
		alex.name="Alex de Souza";
		alex.minutes=0;
		alex.inPlay=true;
		alex.numberofGoals=0;
		
		alex.play(45);
		alex.score();
		alex.score();
		
		System.out.println("Number of goals Alex scored: " + alex.numberofGoals);
		System.out.println("Alex played totally " + alex.minutes + " minutes so far.");		

	}

}
