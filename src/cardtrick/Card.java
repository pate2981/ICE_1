/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrick;

/**
 *
 * @author Sanket
 */
public class Card {
    
   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {
                "Hearts", "Diamonds", "Spades", "Clubs"};
  
   public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
   }
    public String getSuit() {
        return this.suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return this.value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    
}
