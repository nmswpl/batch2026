package in.co.nmsworks.training.week3.day5;

import in.co.nmsworks.training.week2.day3.Car;
import in.co.nmsworks.training.week2.day5.CreditCardPayment;

import java.util.*;

public class CardRunner {
    public static void main(String[] args) {
        CardRunner cardRunner = new CardRunner();
        List<Card> cardList = new ArrayList<>();
        for (int i = 1; i <= 13; i++){
            Card card = new Card("H", i);
            cardList.add(card);
        }
        for (int i = 1; i <= 13; i++){
            Card card = new Card("D", i);
            cardList.add(card);
        }
        for (int i = 1; i <= 13; i++){
            Card card = new Card("C", i);
            cardList.add(card);
        }
        for (int i = 1; i <= 13; i++){
            Card card = new Card("S", i);
            cardList.add(card);
        }

        Map<Integer, List<Card>> playerToCards = cardRunner.distributeCards(cardList, 3);
        for (Integer i : playerToCards.keySet()) {
            System.out.println(i + " : " + playerToCards.get(i));
        }

    }

    private Map<Integer, List<Card>> distributeCards(List<Card> cardList, Integer players) {

        Collections.shuffle(cardList);

        int cards = 52 / players;
        Map<Integer, List<Card>> playerToCards = new HashMap<>();
        for (int i = 1; i <= players; i++){
            List<Card> playerCards = new ArrayList<>();
            int card = cards;
            while (card > 0){
                playerCards.add(cardList.get(0));
                cardList.remove(cardList.get(0));
                card--;
            }

            playerToCards.put(i, playerCards);

        }
        return playerToCards;

    }
}
