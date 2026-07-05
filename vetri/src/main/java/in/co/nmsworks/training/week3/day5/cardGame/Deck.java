package in.co.nmsworks.training.week3.day5.cardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> cards = new ArrayList<>();

    public void deck() {
        String[] suits = {"heart", "diamond", "spade", "clove"};
        String[] values = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "joker", "king", "queen"};
        for (String suit : suits) {
            for (String value : values) {
                cards.add(new Card(suit, value));
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public List<List<Card>> distribute(int noOfPlayer) {

        List<List<Card>> playerHands = new ArrayList<>();
        int cardsPerPlayer = cards.size() / noOfPlayer;

        int startIndex = 0;
        for (int i = 0; i < noOfPlayer; i++) {
            int endIndex = startIndex + cardsPerPlayer;
            List<Card> hand=cards.subList(startIndex,endIndex);
            playerHands.add(hand);

            startIndex=endIndex;

        }
        return playerHands;
    }


}
