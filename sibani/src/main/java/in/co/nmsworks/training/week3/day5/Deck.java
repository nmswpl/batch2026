package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> cards = new ArrayList<>();

    public Deck() {
            for (int i = 1; i <= 13  ; i++) {
                Card card = new Card("H"+i);
                cards.add(card);
            }
            for (int i = 1; i <= 13  ; i++) {
                Card card = new Card("S"+i);
                cards.add(card);
            }
            for (int i = 1; i <= 13  ; i++) {
                Card card = new Card("D"+i);
                cards.add(card);
            }
            for (int i = 1; i <= 13  ; i++) {
                Card card = new Card("C"+i);
                cards.add(card);
            }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card dealCard() {
        if (cards.isEmpty()) {
            return null; // No cards left
        }
        return cards.remove(0);
    }

}
