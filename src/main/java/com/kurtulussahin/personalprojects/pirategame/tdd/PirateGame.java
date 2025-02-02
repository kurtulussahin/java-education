package com.kurtulussahin.personalprojects.pirategame.tdd;

public class PirateGame {
	private boolean isOfferersVoteValid;
	private boolean isOverboard;
	private boolean isFiftyPercentEnough;
	private Pirate[] pirates;
	private int numberOfPirates;
	private int numberOfGolds;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	public void setRules(boolean isOfferersVoteValid, boolean isOverboard, boolean isFiftyPercentEnough,int numberOfPirates, int numberOfGolds) {
		this.isOfferersVoteValid = isOfferersVoteValid;
		this.isOverboard = isOverboard;
		this.isFiftyPercentEnough = isFiftyPercentEnough;
		this.numberOfPirates=numberOfPirates;
		this.numberOfGolds = numberOfGolds;
		createPirates ();
	}
	
	public Pirate[] createPirates () {
		
		pirates = new Pirate[numberOfPirates];
		for (int i=0; i<numberOfPirates; i++) {
			pirates[i]= new Pirate(isOverboard, i);
		}
		return pirates;
		
	}
	
	private int calculateEnoughNumberOfVote() {
			int enoughVote=-1;
			    if (isFiftyPercentEnough) {
			        enoughVote =1;
			    } else {
			        enoughVote = 2;
			    }
			return enoughVote;
		}
		

	public int offer() {
		boolean vote = pirates[0].evaluateOffer(100, isOverboard);
		if (vote) {
		return numberOfGolds;
		}
		return 0;
	}
	
	public int[] offerMany() {
		int numberOfVotes=0;
		int numberOfVoters=pirates.length;
		
		if(!isOfferersVoteValid) {
			numberOfVoters--;
		}
		offer();
		for(int i=0; i<numberOfVoters; i++) {
			
			int offer=0;
			if(i==numberOfVoters-1) {
				offer=100;
			}
			
			
			boolean vote= pirates[i].evaluateOffer(0, isOverboard);
			if(vote) {
				numberOfVotes++;
			}
		}
		
		if(numberOfVotes>= calculateEnoughNumberOfVote()) {
			int[] offers = {100,0};
			return offers;
		}
		int[] offers = {0,100};
		return offers;
	}

}
