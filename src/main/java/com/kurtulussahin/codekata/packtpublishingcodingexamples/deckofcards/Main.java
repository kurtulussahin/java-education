package com.kurtulussahin.codekata.packtpublishingcodingexamples.deckofcards;
 
import com.kurtulussahin.codekata.packtpublishingcodingexamples.deckofcards.card.Card;
import com.kurtulussahin.codekata.packtpublishingcodingexamples.deckofcards.card.Pack;
import com.kurtulussahin.codekata.packtpublishingcodingexamples.deckofcards.card.StandardCard;
import com.kurtulussahin.codekata.packtpublishingcodingexamples.deckofcards.card.StandardPack;
import com.kurtulussahin.codekata.packtpublishingcodingexamples.deckofcards.card.StandardSuit;
import com.kurtulussahin.codekata.packtpublishingcodingexamples.deckofcards.deck.Deck;

public class Main {

    public static void main(String[] args) {

        // create a single classical card
        Card sevenHeart = new StandardCard(StandardSuit.HEARTS, 7);              

        // create a complete deck of standard cards      
        Pack cp = new StandardPack();                   
        Deck deck = new Deck(cp);
        
        System.out.println("Remaining cards: " + deck.remainingCards());
    }
}
