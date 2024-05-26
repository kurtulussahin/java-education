package com.kurtulussahin.java.temeller.classobject.footballplayer;

public class FootballPlayer {

	int no;
	String name;
	int minutes;
	boolean inPlay;
	int numberofGoals;
	
	void play(int minutesToPlay) {
		minutes=minutes+minutesToPlay;
	}
	
	void score() {
		numberofGoals++;
	}

}
