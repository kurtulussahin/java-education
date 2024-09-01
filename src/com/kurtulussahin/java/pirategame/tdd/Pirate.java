package com.kurtulussahin.java.pirategame.tdd;

public class Pirate {
	
	private boolean isOverboard;
	private boolean vote;
	private int nextTurnEarning=0;
	private int seniority;
	
	public Pirate(boolean isOverboard, int seniority) {
		this.isOverboard = isOverboard;
		this.seniority = seniority;
	}
	
	public boolean evaluateOffer(int offer, boolean isOverboard) {
		if (offer<nextTurnEarning) {
			 return false;
		}
		nextTurnEarning=offer;
		return true;
	}
	

}
