package com.kurtulussahin.java.personalprojects.pirategame.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.kurtulussahin.java.personalprojects.pirategame.refactor.Ship;

public class PirateGameTest {
	
	private PirateGame game;
	
	
	@Before
	public void setup() throws Exception {
		game = new PirateGame();
		
	}
	
	@Test
	public void onePirateAhundredGold() throws Exception {
		boolean overboardHTML = true;
        boolean fiftyPercentHTML = true;
        boolean proposerVoteHTML = true;
        int numberOfPirates=1;
        int numberOfGolds=100;
        
        game.setRules(overboardHTML,fiftyPercentHTML,proposerVoteHTML,numberOfPirates,numberOfGolds );

		assertEquals(100, game.offer());
	}
	
	@Test
	public void onePirateTenGold() throws Exception {
		boolean overboardHTML = true;
        boolean fiftyPercentHTML = true;
        boolean proposerVoteHTML = true;
        int numberOfPirates=1;
        int numberOfGolds=10;
        
        game.setRules(overboardHTML,fiftyPercentHTML,proposerVoteHTML,numberOfPirates,numberOfGolds );

		assertEquals(10,game.offer());
	}
	
	@Test
	public void TwoPirateAhundredGoldAllTrue() throws Exception {
		
		boolean overboardHTML = true;
        boolean fiftyPercentHTML = true;
        boolean proposerVoteHTML = true;
        int numberOfPirates=2;
        int numberOfGolds=100;
        
        game.setRules(overboardHTML,fiftyPercentHTML,proposerVoteHTML,numberOfPirates,numberOfGolds );
		
		int[] mockResult = {100,0};
		assertArrayEquals(mockResult, game.offerMany());
	}
	
	@Test
	public void TwoPirateAhundredGold_overboardTrue_fiftyPercentTrue_proposerVoteFalse() throws Exception {
		
		boolean overboardHTML = true;
        boolean fiftyPercentHTML = true;
        boolean proposerVoteHTML = false;
        int numberOfPirates=2;
        int numberOfGolds=100;
        
        game.setRules(overboardHTML,fiftyPercentHTML,proposerVoteHTML,numberOfPirates,numberOfGolds );
		
		int[] mockResult = {0,100};
		assertArrayEquals(mockResult, game.offerMany());
 
	}
	
}
