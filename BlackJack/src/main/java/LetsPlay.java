import java.util.*;

public class LetsPlay {

    public static void main(String[] args) {
        LetsPlay game = new LetsPlay();
        game.startGame();
    }

    public void startGame() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Gambling is terrible for your mental and social wellbeing.\n" +
                " Are you sure you want to participate?");
        String choice = sc.nextLine();

        switch (choice) {
            case "Yes" -> {
                System.out.println("Fine. But im watching you 👮🏽‍♀️");
                displayHomeScreen();
                runGame();

            }

            case "No" -> {
                System.out.println("Good choice bud 👍🏽");
                return;
            }
            default -> {
                System.out.println("Does it look like that was an option?!?");
                return;
            }
        }

        Deck deck = new Deck();
        deck.shuffle();


        for (int i = 0; i < 5; i++) {
            Card dealtCard = deck.dealCard();
            System.out.println("Card " + (i + 1) + ":" + dealtCard);

        }

        System.out.println(deck.remainingCards() + ": remaining cards");


    }

    public void displayHomeScreen() {

        System.out.println("   ♣️♦️ Welcome to Glass House Casino! ♠️♥️\n Lets Play");
    
        
    }


}
