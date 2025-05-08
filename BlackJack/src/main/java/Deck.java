import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
// Encapsulate the deck
    private List<Card> deck;

    public Deck() {
// initialize the deck
        deck = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4","5","6","7","8","9","10",
                            "Jack", "Queen","King", "Ace"
        };
 // For each suit go through each rank
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank,suit));
            }
        }
    }
// randomly reorder cards
    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card dealCard(){
        if(!deck.isEmpty()){
            //take the top card
            return deck.remove(0);
        }
        return null;
    }
// tells us how many cards are left
    public int size() {
        return deck.size();
    }








}
