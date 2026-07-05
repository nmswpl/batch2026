package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    private final List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void receiveCard(Card card) {
        if (card != null) {
            hand.add(card);
        }
    }

    public void printHand() {
        System.out.println(  name + "'s Cards (" + hand.size() + " cards) ");
        if (hand.isEmpty()) {
            System.out.println("No cards dealt");
        } else {
            for (Card card : hand) {
                System.out.println("  • " + card);
            }
        }
    }
}
