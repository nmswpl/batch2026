package in.co.nmsworks.training.week3.day5.card;

import java.util.*;

public class CardRunner {
    public static void main(String[] args) {

        List<Card> cards = new ArrayList<>();
        cards.addAll(getCards("A"));
        cards.addAll(getCards("B"));
        cards.addAll(getCards("C"));
        cards.addAll(getCards("D"));

        distributeCards(3, cards);
    }

    private static void distributeCards(int noOfPlayers, List<Card> cards) {

        Collections.shuffle(cards);

        Map<Integer, List<Card>> map = new HashMap<>();

        int index = 0;
        for (Card card : cards) {
            map.computeIfAbsent((index%noOfPlayers)+1, v -> new ArrayList<>()).add(card);
            index++;
        }

        for (Map.Entry<Integer, List<Card>> entry : map.entrySet()) {
            System.out.println("Player-" + entry.getKey() + " : ");
            for (Card card : entry.getValue()) {
                System.out.println(card.getShape()+card.getNum());
            }
            System.out.println();
        }
    }

    private static List<Card> getCards(String name) {
        List<Card> cards = new ArrayList<>();

        for (int i = 1; i <= 13; i++) {
            cards.add(new Card(name, i));
        }

        return cards;
    }
}
