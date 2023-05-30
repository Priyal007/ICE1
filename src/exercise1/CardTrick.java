package exercise1;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Gurpriyal Kaur
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            card.setValue((int)(Math.random()*13)+1);
             
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            card.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            
            hand[i] = card;
            
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

        // insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter the card value. 1 for Ace, 0-10, 11 for jack, 12 for Queen, 13 for King");
        int cardValue = input.nextInt();
        
        System.out.println("Enter the suit. O for Spade, 1 for Hearts, 2 for Diamonds, 3 for Club");
        int suitValue = input.nextInt();
        
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
            //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
            //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
            //
            // Then loop through the cards in the array to see if there's a match.
            // If the guess is successful, invoke the printInfo() method below.
         for (int i = 0; i < 7; i++) {
            if(cardValue == hand[i].getValue() && suitValue == hand[i].getValue()) {
                System.out.println("Your guessed card is in the hand of random cards");
                printInfo();
                break;
            }
            else {
                System.out.println("Your guessed card is not in the hand of random cards");
            }
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("My name is Gurpriyal Kaur. I am currently enrolled in second semester in Computer Programming at Sheridan College.");
        
    
    }

}
