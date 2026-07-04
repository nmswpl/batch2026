package in.co.nmsworks.training.week3.day5;

import java.util.*;

public class CardGame {
    public static void main(String[] args) {
        CardGame game = new CardGame();
        List<Card> deck = game.getCardDeck();
        int noOfPlayers = 4;

        Collections.shuffle(deck);
        Map<Integer, List<Card>> distributionMap = game.distributeCards(deck, noOfPlayers);
        printCardInHand(distributionMap);
    }

    private static void printCardInHand(Map<Integer, List<Card>> distributionMap) {
        distributionMap.forEach((player, cards) -> System.out.println(player + ":" + cards.size() + ":" + cards));
    }

    private Map<Integer, List<Card>> distributeCards(List<Card> deck, int noOfPlayers) {
        Map<Integer, List<Card>> distributionMap = new HashMap<>();
        int playerCounter = 0;
        for (Card card : deck) {
            int key = ((playerCounter) % noOfPlayers) + 1;
            List<Card> cardsInHand = distributionMap.getOrDefault(key, new ArrayList<>());
            cardsInHand.add(card);
            distributionMap.put(key, cardsInHand);
            playerCounter++;
        }
        return distributionMap;
    }

    private List<Card> getCardDeck() {
        List<Card> deck = new ArrayList<>();
        String[] suites = {"♠", "♥", "♦", "♣"};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deck.add(new Card(suites[i], j + 1));
            }
        }

        return deck;
    }
}
