


public class Player {
    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public int getScore() {
        return hand.getTotalValue();
    }

    public void addCard(Card card) {
        hand.addCard(card);
    }
    @Override
    public String toString() {
        return name + "'s hand:\n" + hand.toString() + "Score: " + getScore();
}


}
