package in.co.nmsworks.training.week3.day5;

import java.util.*;

public class CardsRunner {
    public static void main(String[] args) {
        CardsRunner cardsRunner = new CardsRunner();
        Cards card = new Cards();
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 13; j++) {
                list.add(i+""+j);
            }
        }
        Collections.shuffle(list);
        card.setCards(list);


        System.out.println(list);
        CardsRunner.distributeCardsToPlayer(4,card);
    }

    private static void distributeCardsToPlayer(int n, Cards card) {
        Map<Integer , List<String>> cardShuffle = new HashMap<>();
        int index = 0;
        for (String card1 : card.getCards()) {
            int person = index % n ;
            List<String> cards = cardShuffle.get(person);
            if (cards == null) {
                cards = new ArrayList<>();
                cardShuffle.put(person , cards);
            }
            cards.add(card1);
            index++ ;
        }
        for (Map.Entry<Integer, List<String>> entry : cardShuffle.entrySet()) {
            System.out.println("Person"+entry.getKey()+" = "+entry.getValue());
        }
    }


}
