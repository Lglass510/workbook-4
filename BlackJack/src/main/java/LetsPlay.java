public class LetsPlay {

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffle();


        for (int i = 0; i < 5; i++) {
            Card dealtCard = deck.dealCard();
            System.out.println("Card " + (i + 1) + ":" + dealtCard);

        }

        System.out.println(deck.size() + ": remaining cards");


    }


}
