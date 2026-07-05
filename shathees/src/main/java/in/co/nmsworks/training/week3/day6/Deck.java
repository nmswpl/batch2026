package in.co.nmsworks.training.week3.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    public Deck() {

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (String s : suits) {
            for (String v : values) {
                cards.add(new Card(s, v));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> draw(int n) {
        List<Card> hand = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            hand.add(cards.remove(0));
        }
        return hand;
    }
}
