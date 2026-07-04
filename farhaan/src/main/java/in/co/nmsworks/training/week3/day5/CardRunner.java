package in.co.nmsworks.training.week3.day5;

import java.util.*;

public class CardRunner {
    String[] cardTypes = {"Heart", "Diamond", "Spade" , "Clover"};
    List<Card> deck = new ArrayList<>();
    public static void main(String[] args) {
        CardRunner runner = new CardRunner();
        List<Card> deck = runner.createDeck();
        Collections.shuffle(deck);
        Map<Integer, List<Card>> eachPlayerMap = runner.cardsDistribution(3, deck);
        runner.printCards(eachPlayerMap);

    }

    private void printCards(Map<Integer, List<Card>> map) {
        for (Integer i : map.keySet()) {
            System.out.println("Player : " + i + " has " + map.get(i).size() + " cards :: " + map.get(i));
        }
    }

    public List<Card> createDeck() {
        for (int i = 0; i <cardTypes.length; i++) {
            for (int j = 1; j < 14; j++) {
                Card card = new Card(cardTypes[i],j);
                deck.add(card);
            }
        }
        return deck;
    }


    public Map<Integer, List<Card>> cardsDistribution(int noOfPlayers, List<Card> deck) {
        Map<Integer, List<Card>> playersToCard = new HashMap<>();
        int count = 0;
        for (Card card : deck) {
            int key = (count % noOfPlayers) + 1;
            List<Card> cardsForEachPlayer = playersToCard.getOrDefault(key,new ArrayList<>());
            cardsForEachPlayer.add(card);
            playersToCard.put(key,cardsForEachPlayer);
            count++;
        }
        return playersToCard;
    }
}
