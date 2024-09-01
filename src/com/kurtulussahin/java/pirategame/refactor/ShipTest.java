package com.kurtulussahin.java.pirategame.refactor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShipTest {
	
	@Test
	public void allFalse() throws Exception {
		boolean overboardHTML = false;
        boolean fiftyPercentHTML = false;
        boolean proposerVoteHTML = false;
        
        Ship ship = new Ship(5,100);
        
        int[] mockResult = {100,0,0,0,0};
        int[] result = ship.makeAProposal(overboardHTML, fiftyPercentHTML, proposerVoteHTML);
 
        assertArrayEquals(mockResult,result);
	}
	
	@Test
	public void allTrue() throws Exception {
		boolean overboardHTML = true;
        boolean fiftyPercentHTML = true;
        boolean proposerVoteHTML = true;
        
        Ship ship = new Ship(5,100);
        
        int[] mockResult = {98,0,1,0,1};
        int[] result = ship.makeAProposal(overboardHTML, fiftyPercentHTML, proposerVoteHTML);
 
        assertArrayEquals(mockResult,result);
	}
	@Test
	public void overboardTrue_fiftyPercentFalse_proposerVoteFalse() throws Exception {
		boolean overboardHTML = true;
        boolean fiftyPercentHTML = false;
        boolean proposerVoteHTML = false;
        
        Ship ship = new Ship(5,100);
        
        int[] mockResult = {97,0,1,1,1};
        int[] result = ship.makeAProposal(overboardHTML, fiftyPercentHTML, proposerVoteHTML);
 
        assertArrayEquals(mockResult,result);
	}
	@Test
	public void overboardTrue_fiftyPercentTrue_proposerVoteFalse() throws Exception {
		boolean overboardHTML = true;
        boolean fiftyPercentHTML = true;
        boolean proposerVoteHTML = false;
        
        Ship ship = new Ship(5,100);
        
        int[] mockResult = {97,0,1,0,2};
        int[] result = ship.makeAProposal(overboardHTML, fiftyPercentHTML, proposerVoteHTML);
 
        assertArrayEquals(mockResult,result);
	}
	
	@Test
	public void overboardTrue_fiftyPercentFalse_proposerVoteTrue() throws Exception {
		boolean overboardHTML = true;
        boolean fiftyPercentHTML = false;
        boolean proposerVoteHTML = true;
        
        Ship ship = new Ship(5,100);
        
        int[] mockResult = {97,0,1,0,2};
        int[] result = ship.makeAProposal(overboardHTML, fiftyPercentHTML, proposerVoteHTML);
 
        assertArrayEquals(mockResult,result);
	}
	
	@Test
	public void overboardFalse_fiftyPercentFalse_proposerVoteTrue() throws Exception {
		boolean overboardHTML = false;
        boolean fiftyPercentHTML = false;
        boolean proposerVoteHTML = true;
        
        Ship ship = new Ship(5,100);
        
        int[] mockResult = {100,0,0,0,0};
        int[] result = ship.makeAProposal(overboardHTML, fiftyPercentHTML, proposerVoteHTML);
 
        assertArrayEquals(mockResult,result);
	}
	
	@Test
	public void overboardFalse_fiftyPercentTrue_proposerVoteTrue() throws Exception {
		boolean overboardHTML = false;
        boolean fiftyPercentHTML = true;
        boolean proposerVoteHTML = true;
        
        Ship ship = new Ship(5,100);
        
        int[] mockResult = {100,0,0,0,0};
        int[] result = ship.makeAProposal(overboardHTML, fiftyPercentHTML, proposerVoteHTML);
 
        assertArrayEquals(mockResult,result);
	}
	
	@Test
	public void overboardFalse_fiftyPercentTrue_proposerVoteFalse() throws Exception {
		boolean overboardHTML = false;
        boolean fiftyPercentHTML = true;
        boolean proposerVoteHTML = false;
        
        Ship ship = new Ship(5,100);
        
        int[] mockResult = {100,0,0,0,0};
        int[] result = ship.makeAProposal(overboardHTML, fiftyPercentHTML, proposerVoteHTML);
 
        assertArrayEquals(mockResult,result);
	}
	
	@Test
	public void onePrite_overboardTrue_fiftyPercentTrue_proposerVoteTrue() throws Exception {
		boolean overboardHTML = true;
        boolean fiftyPercentHTML = true;
        boolean proposerVoteHTML = true;
        
        Ship ship = new Ship(1,100);
        
        int[] mockResult = {100};
        int[] result = ship.makeAProposal(overboardHTML, fiftyPercentHTML, proposerVoteHTML);
 
        assertArrayEquals(mockResult,result);
	}
}
