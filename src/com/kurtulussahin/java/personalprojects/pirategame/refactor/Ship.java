package com.kurtulussahin.java.personalprojects.pirategame.refactor;

import java.util.HashMap;
import java.util.Map;

public class Ship {
    private final int numberOfPirates;
    private final int numberOfGolds;
    private Map<Integer, Integer> proposal = new HashMap<>();;
    
    private Map<Integer, Integer> previousProposal = new HashMap<>();
    
    public Ship(int numberOfPirates,int numberOfGolds) {
    	this.numberOfPirates=numberOfPirates;
    	this.numberOfGolds=numberOfGolds;
    }

    public int[] makeAProposal(boolean isOverboard,boolean isFiftyPercentEnough, boolean isProposerVote) {
        int numberOfTurn = 1;
        int controlDeath = 0;
        int controlDeathRepetition = 0;
        previousProposal.put(1, 100);


        int k = 1;
        while (k <= numberOfPirates) {
            int purposeIncrease = 0;

            int sufficientNumberOfVotes = calculateSufficientNumberOfVotes(isFiftyPercentEnough, isProposerVote, numberOfTurn);

            int  numberOfYesVote;
            if (isProposerVote) {
            	numberOfYesVote=1;
            } else {
            	numberOfYesVote=0;
            }
            proposal=putDefaultOffers(numberOfTurn);

            boolean control = true;
            int checkPirateNumber = 0;
            while (control && checkPirateNumber <= numberOfTurn) {
                if (checkPirateNumber == numberOfTurn) {
                    proposal = new HashMap<>(previousProposal);
                    proposal.put(numberOfTurn, numberOfGolds);
                    numberOfYesVote++;

                    if (numberOfTurn > 1 && isOverboard) {
                        controlDeath++;
                    }
                }

                if (sufficientNumberOfVotes == numberOfYesVote) {
                    control = false;
                    for (int i = 1; i < proposal.size(); i++) {
                        int currentValue = proposal.get(numberOfTurn);
                        proposal.put(numberOfTurn, currentValue - proposal.get(i));
                    }
                    previousProposal = new HashMap<>(proposal);
                } else {
                    if (isOverboard) {
                        for (int j = 1; j < proposal.size(); j++) {
                            if (previousProposal.get(j) == purposeIncrease) {
                                controlDeathRepetition++;
                                if (controlDeath > 0) {
                                    proposal.put(j, previousProposal.get(j));
                                    if (controlDeathRepetition != 2) {
                                        controlDeath--;
                                    }
                                } else {
                                    proposal.put(j, previousProposal.get(j) + 1);
                                    controlDeathRepetition--;
                                }
                                numberOfYesVote++;

                                if (sufficientNumberOfVotes == numberOfYesVote) {
                                    j = proposal.size();
                                    previousProposal = new HashMap<>(proposal);
                                }
                            }
                        }
                        purposeIncrease++;
                    } else {
                        for (int k1 = 1; k1 < proposal.size(); k1++) {
                            if (previousProposal.get(k1) == purposeIncrease) {
                                proposal.put(k1, previousProposal.get(k1));
                                numberOfYesVote++;

                                if (sufficientNumberOfVotes == numberOfYesVote) {
                                    k1 = proposal.size();
                                    previousProposal = new HashMap<>(proposal);
                                }
                            }
                        }
                    }
                }
                checkPirateNumber++;
            }




            numberOfTurn++;
            purposeIncrease--;
            k++;
        }

        int[] result = new int[numberOfPirates];
        for (int i = numberOfTurn - 1; i >= 1; i--) {
            System.out.print(proposal.get(i) + "-");
            result[numberOfPirates-i]=proposal.get(i); 
            
        }
        return result;
    }

	private Map putDefaultOffers(int numberOfTurn) {
	    Map<Integer, Integer> offers = new HashMap<>();

		for (int i = 1; i <= numberOfTurn; i++) {
			offers.put(i, 0);
		}
		
		offers.put(numberOfTurn, numberOfGolds);
		return offers;
	}

	private int calculateSufficientNumberOfVotes(boolean isFiftyPercentEnough, boolean isProposerVote,
			int numberOfTurn) {
		int enoughVote;
		if (!isProposerVote) {
		    if (isFiftyPercentEnough) {
		        enoughVote = (int) Math.floor((numberOfTurn - 1 + 1) / 2.0);
		    } else {
		        enoughVote = ((int) Math.floor((numberOfTurn - 1) / 2.0)) + 1;
		    }
		} else {
		    if (isFiftyPercentEnough) {
		        enoughVote = (int) Math.floor((numberOfTurn + 1) / 2.0);
		    } else {
		        enoughVote = ((int) Math.floor(numberOfTurn / 2.0)) + 1;
		    }
		}
		return enoughVote;
	}

    public static void main(String[] args) {
        boolean overboardHTML = true;
        boolean fiftyPercentHTML = true;
        boolean proposerVoteHTML = true;

        // Assuming these values are set based on some input, for example:
        // overboardHTML = request.getParameter("Overboard").equals("true");
        // fiftyPercentHTML = request.getParameter("FiftyPercent").equals("true");
        // proposerVoteHTML = request.getParameter("ProposerVote").equals("true");

        Ship ship = new Ship(5,100 );
        int[] result = ship.makeAProposal(overboardHTML, fiftyPercentHTML, proposerVoteHTML);

        for (int j : result) {
            System.out.print(j + "-");

        }
    }
}

