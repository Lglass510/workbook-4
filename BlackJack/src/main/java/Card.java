

public class Card {
 // Holds the cards info
    private String suit;
    private String rank;
// Creates card
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }


    public String getRank() {
        return rank;
    }
// Returns score
    public int getValue() {
        return switch (rank) {
            case "Ace" -> 11;
            case "King", "Queen", "Jack" -> 10;
            // take string numbers and convert to int
            default -> Integer.parseInt(rank);
        };
    }
// Prints rank plus the suit
    @Override
    public String toString() {
        return rank + " of " + suit;
    }



}
