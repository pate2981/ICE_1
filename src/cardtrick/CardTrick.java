
package cardtrick;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sanket
 */
public class CardTrick {

 /*
  Sanket Patel
  Student Number: 991620505
 */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
         Card[] magicHand = new Card[7];
         
         Random random = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            int value = random.nextInt(13) + 1;
            String suit = Card.SUITS[random.nextInt(4)];
            
            Card c = new Card(value, suit);
            magicHand[i] = c;
        }
         
        Card luckyCard = new Card(2, "Hearts");   //Hard coded object
        
        System.out.println("Here are the 7 cards in the hand");
        for (Card c : magicHand) {
            System.out.printf("%d of %s\n", c.getValue(), c.getSuit());
        }

        // Now ask the user for a card
        System.out.println("Pick a suit for your card");
        for (int i = 0; i < Card.SUITS.length; i++) {
            System.out.println((i + 1) + ": " + Card.SUITS[i]);
        }
        int suit = input.nextInt();

        System.out.println("Enter a value (1 to 13)");
        int value = input.nextInt();

        Card userGuess = new Card(value, Card.SUITS[suit - 1]);

        boolean match = false;
        for (Card c : magicHand) {
            if (c.getValue() == userGuess.getValue()
                    && c.getSuit().equals(userGuess.getSuit())) {
                match = true;
                break;
            }
        }
    
        String response = match ? "Right guess": "No match for any Card in the Hand";
        
        System.out.println(response);

        
    }
    
}
