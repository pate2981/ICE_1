
package cardtrick;

import java.util.Random;


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
        
        boolean magicHandContainsLuckyCard = false;   //This is deset to default
        
        for (Card c : magicHand) {
            System.out.printf("%d of %s\n", c.getValue(), c.getSuit());
            
            if(c.getValue() == luckyCard.getValue()&& c.getSuit().equals(luckyCard.getSuit())) { //This is to check if the values of each property
                magicHandContainsLuckyCard = true;
            }
        }
        
        System.out.println("Results:");
        
        if (magicHandContainsLuckyCard) {
            System.out.println("YOU WIN");
        } 
        else {
            System.out.println("YOU LOSE");
        }
              
    }
    
}
