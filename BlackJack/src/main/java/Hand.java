import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> arsenal;

    public Hand() {
        this.arsenal = new ArrayList<>();
    }

    public void addCard(Card card) {
        arsenal.add(card);
    }

    public int getTotalValue(){
        int total = 0;
        int aceCount = 0;


// Loop through each card and add its value to the total
        for(Card card : arsenal) {
            total += card.getValue();
            if (card.getRank().equals("Ace")){
                aceCount++; //increase ace count
            }
        }
 // if total is 21 set the ace value to 1
        while (total > 21 && aceCount > 0) {
            total -= 10;
            aceCount--;
        }

        return total;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Card card : arsenal) {
            // add each card on a new line
            output.append(card).append("\n");
        }
        output.append("Total: ").append(getTotalValue());
        return output.toString();
    }





}
